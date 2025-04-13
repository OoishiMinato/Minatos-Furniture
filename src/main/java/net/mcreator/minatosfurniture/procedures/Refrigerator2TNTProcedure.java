package net.mcreator.minatosfurniture.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.minatosfurniture.init.MinatoFurnitureModBlocks;

public class Refrigerator2TNTProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == MinatoFurnitureModBlocks.REFRIGERATOR_1.get()) {
			world.destroyBlock(BlockPos.containing(x, y - 1, z), false);
		}
	}
}
