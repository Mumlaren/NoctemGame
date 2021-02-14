package ability;

import gameobject.GameObject;
import gameobject.Player;

public abstract class Ability {

	public enum AbilityType {
		Physical,
		Magic
	}

	protected Player      player;
	protected AbilityType type;
	protected int         manaCost;
	protected int         damage;
	private   String      toolTip;

	public Ability(Player caster) {
		this.player = caster;
	}

	public String getToolTip() {
		return toolTip;
	}

	public void setToolTip(String toolTip) {
		this.toolTip = toolTip;
	}

	public String toString() {

		String str = "Description: " + toolTip + "\nDamage: " + getDamage() + "Manacost: " + getManaCost();

		return str;
	}

	public void cast(GameObject target) {
		System.out.println( player.getName() + " casting ability: " + toolTip);
	}

	public void setManaCost(int manaCost) {
		this.manaCost = manaCost;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getManaCost() {
		return manaCost;
	}
}
