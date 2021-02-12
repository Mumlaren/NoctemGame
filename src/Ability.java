public abstract class Ability {

	public enum AbilityType {
		Physical,
		Magic
	}

	protected Player      player;
	protected AbilityType type;

	public int getResourceCost() {
		return resourceCost;
	}

	protected int    resourceCost;
	protected int    damage;
	private   String toolTip;

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

		String str = "Description: " + toolTip + "\nDamage: " + getDamage() + "Manacost: " + resourceCost;

		return str;
	}

	public void cast(GameObject target) {
		System.out.println("__________________\n" + player.getName() + " casting ability: " + toolTip);
	}

	public void setResourceCost(int resourceCost) {
		this.resourceCost = resourceCost;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
}
