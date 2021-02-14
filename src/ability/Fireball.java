package ability;

import gameobject.Character;
import gameobject.Player;

public class Fireball extends Ability {


	public Fireball(Player caster) {
		super(caster);
		type = AbilityType.Magic;
		setManaCost(10);
		setDamage(7);
		setToolTip("ability.Fireball!!!!, Type: " + type.toString());
	}

	public void cast(Character target) {
		super.cast(target);
		target.decreaseHealth(damage);
	}

}
