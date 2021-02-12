
public class Mage extends Player {

	public Mage(int x, int y, ID id, Handler handler) {
		super(x, y, id, handler);

		mana = 100;
		health = 80;
		description = "Mage, elemental caster.";
	}

}
