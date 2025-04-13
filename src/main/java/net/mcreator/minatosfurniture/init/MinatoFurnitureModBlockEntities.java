
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minatosfurniture.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.minatosfurniture.block.entity.Refrigerator2BlockEntity;
import net.mcreator.minatosfurniture.block.entity.Refrigerator1BlockEntity;
import net.mcreator.minatosfurniture.block.entity.HighHeatOvenBlockEntity;
import net.mcreator.minatosfurniture.MinatoFurnitureMod;

public class MinatoFurnitureModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MinatoFurnitureMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> REFRIGERATOR_1 = register("refrigerator_1", MinatoFurnitureModBlocks.REFRIGERATOR_1, Refrigerator1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> REFRIGERATOR_2 = register("refrigerator_2", MinatoFurnitureModBlocks.REFRIGERATOR_2, Refrigerator2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> HIGH_HEAT_OVEN = register("high_heat_oven", MinatoFurnitureModBlocks.HIGH_HEAT_OVEN, HighHeatOvenBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
