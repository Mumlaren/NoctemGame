package gameobject;

public abstract class Interactable extends GameObject {

	String description;

	public Interactable(int x, int y, ID id) {
		super(x, y, id);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
