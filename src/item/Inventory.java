package item;

import java.util.ArrayList;

public class Inventory {

	private ArrayList<Item> inventory = new ArrayList<>(5);

	public void addItem(Item item) {
		if (inventory.size() < 4)
			inventory.add(item);
		else {
			return;
		}
	}

	public void removeItem(Item item) {
		inventory.remove(item);
	}

	public void clearSpellBook() {
		inventory.clear();
	}
}
