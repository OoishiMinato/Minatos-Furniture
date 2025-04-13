
package net.mcreator.minatosfurniture.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class CoolMobEffect extends MobEffect {
	public CoolMobEffect() {
		super(MobEffectCategory.NEUTRAL, -16252934);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
