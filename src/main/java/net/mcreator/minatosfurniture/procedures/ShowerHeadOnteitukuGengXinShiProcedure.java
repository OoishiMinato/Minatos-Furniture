package net.mcreator.minatosfurniture.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class ShowerHeadOnteitukuGengXinShiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FALLING_WATER, (x + 0.5), (y - 0.25), (z + 0.5), 2, 0.0625, 0.0625, 0.0625, 0.5);
	}
}
