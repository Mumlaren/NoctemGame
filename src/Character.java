public abstract class Character extends Interactable {

	String    name;
	SpellBook spellBook;
	Inventory inventory;
	int       health, mana, maxHealth, maxMana;

	public enum CharState{
		Confused,
		Asleep,
		Cursed
	}

	public Character(int x, int y, ID id) {
		super(x, y, id);
	}

	public String toString() {
		return "Description: Character Mana:" + mana + " Health" + health;
	}

	public void decreaseHealth(int value) {
		if (health - value <= 0) {
			health = 0;
		} else {
			health = health - value;
		}
	}

	public void increaseHealth(int value) {
		if (health + value >= 0) {
			health = maxHealth;
		} else {
			health = health + value;
		}
	}
	public void decreaseMana (int value){
		if (health - value <= 0){
			health=0;
		}else{
			health = health-value;
		}
	}
	public void increaseMana (int value){
		if (health - value <= 0){
			health=0;
		}else{
			health = health-value;
		}
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaxHealth() {
		return maxHealth;
	}

	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}

	public int getMaxMana() {
		return maxMana;
	}

	public void setMaxMana(int maxMana) {
		this.maxMana = maxMana;
	}
}
