import java.awt.*;

public abstract class Character extends Interactable {

	String name;
	SpellBook spellBook;
	Inventory inventory;
	int health, mana;

	public Character(int x, int y, ID id) {
		super(x, y, id);
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}
}
