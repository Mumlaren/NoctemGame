public class Mage extends Player {

	public Mage(int x, int y, ID id, Handler handler) {
		super(x, y, id, handler);

		description = "Mage, elemental caster.";

		spellBook.addAbility(new Fireball(this));
		spellBook.addAbility(new Fireball(this));
		spellBook.addAbility(new Fireball(this));
		spellBook.addAbility(new Fireball(this));

		inventory.addItem(new HealthPotion(this));
		inventory.addItem(new ManaPotion(this));

		maxHealth = 90;
		health = maxHealth;
		maxMana = 100;
		mana = maxMana;
	}
}
