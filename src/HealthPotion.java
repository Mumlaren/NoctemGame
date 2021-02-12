
public class HealthPotion extends Item {

	public HealthPotion(Player caster) {
		super(caster);
		setDescription("Lesser healthpotion(10)");
	}

	public void use(Player target) {
		super.use(target);
		target.increaseHealth(10);
	}
}

