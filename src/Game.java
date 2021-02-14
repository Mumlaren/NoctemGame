import gameobject.Block;
import gameobject.ID;
import gameobject.Mage;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import gameobject.*;

public class Game extends Canvas implements Runnable {

	private boolean isRunning = false;
	private Thread  thread;
	private Handler handler;
	private Camera camera;

	private BufferedImage level = null;

	public Game() {

		new Window(1000, 563, "Noctem Game", this);
		start();

		handler = new Handler();
		camera = new Camera(0,0);
		this.addKeyListener(new KeyInput(handler));

		BufferedImageLoader loader = new BufferedImageLoader();
		level = loader.loadImage("/map2.png");


		loadLevel(level);

		//handler.addObject(new gameobject.Mage(100, 100, gameobject.ID.gameobject.Player, handler));


	}

	private void start() {
		isRunning = true;
		thread = new Thread(this);
		thread.start();
	}

	private void stop() {
		isRunning = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void run() {
		this.requestFocus();

		long   lastTime      = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns            = 1000000000 / amountOfTicks;
		double delta         = 0;
		long   timer         = System.currentTimeMillis();
		int    frames        = 0;
		int    updates       = 0;

		while (isRunning) {
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;

			while (delta >= 1) {
				tick();
				updates++;
				delta--;
			}

			render();
			frames++;

			if (System.currentTimeMillis() - timer > 1000) {
				timer += 1000;
				System.out.printf("FPS: %d, TICKS: %d%n", frames, updates);
				frames = 0;
				updates = 0;
			}
		}
		stop();
	}

	public void tick() {

		for(int i =0; i< handler.object.size(); i++){
			if (handler.object.get(i).getId()==ID.Player)
				camera.tick(handler.object.get(i));
		}

		handler.tick();


	}

	public void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if (bs == null) {
			this.createBufferStrategy(3);
			return;
		}

		Graphics g = bs.getDrawGraphics();
		Graphics2D g2d = (Graphics2D) g;
		/////////

		g.setColor(Color.black);
		g.fillRect(0, 0, 1000, 563);

		g2d.translate(-camera.getX(), -camera.getY());

		handler.render(g);

		g2d.translate(camera.getX(), camera.getY());
		////////

		g.dispose();
		bs.show();
	}
	//Loading level

	private void loadLevel (BufferedImage image){
		int w = image.getWidth();
		int h = image.getHeight();

		for(int i = 0; i < w; i++){
			for(int j=0; j<h; j++){
				int pixel = image.getRGB(i,j);
				int red = (pixel >> 16) & 0xff;
				int green = (pixel >> 8) & 0xff;
				int blue = (pixel) & 0xff;

				if (red == 255)
					handler.addObject(new Block(i*32, j*32, ID.Block));

				if (blue==255)
					handler.addObject(new Mage(i*32, j*32, ID.Player, handler));
			}
		}
	}

	public static void main(String[] args) {
		new Game();
	}

}
