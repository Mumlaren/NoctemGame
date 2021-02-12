
public class Fireball extends Ability {

	public Fireball(Player caster) {
		super(caster);
		type = AbilityType.Magic;
		setManaCost(10);
		setDamage(7);
		setToolTip("Fireball!!!!, Type: " + type.toString());
	}

	public void cast(Character target) {
		super.cast(target);
		target.decreaseHealth(damage);
	}

}
