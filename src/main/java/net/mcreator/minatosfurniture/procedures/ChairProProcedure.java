package net.mcreator.minatosfurniture.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.minatosfurniture.init.MinatoFurnitureModEntities;
import net.mcreator.minatosfurniture.entity.BlocksitEntity;

import java.util.Comparator;

public class ChairProProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Direction direction, Entity entity) {
		if (direction == null || entity == null)
			return;
		double energy = 0;
		if (!(!world.getEntitiesOfClass(BlocksitEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).isEmpty())) {
			if (direction == Direction.UP) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = MinatoFurnitureModEntities.BLOCKSIT.get().spawn(_level, BlockPos.containing(x, y - 0, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				entity.startRiding(((Entity) world.getEntitiesOfClass(BlocksitEntity.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)));
			}
		}
	}
}
