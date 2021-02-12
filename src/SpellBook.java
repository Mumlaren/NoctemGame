import java.util.ArrayList;

public class SpellBook {

	private ArrayList<Ability> spellBook = new ArrayList<>(4);

	public void addAbility(Ability ability) {
		if (spellBook.size() < 4)
			spellBook.add(ability);
		else {
			return;
		}
	}

	public void removeAbility(Ability ability) {
		spellBook.remove(ability);
	}

	public void clearSpellBook() {
		spellBook.clear();
	}
}
