
public class ManaPotion extends Item {

	public ManaPotion(Player caster) {
		super(caster);
		setDescription("Lesser manapotion(10)");
	}

	public void use(Player target) {
		super.use(target);
		target.increaseMana(10);
	}
}