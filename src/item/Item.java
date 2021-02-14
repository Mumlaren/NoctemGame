package item;

import gameobject.Player;

public abstract class Item {

	protected int    cost;
	protected String description;
	protected Player caster;

	public Item(Player caster) {
		this.caster = caster;
	}

	public void use(Player target) {
		System.out.println("__________________\n" + caster.getName() + " using item: " + description +
			" target: " + target.getName());

	}

	public String toString() {
		String str = "Description: " + description;

		return str;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}


