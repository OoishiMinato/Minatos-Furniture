
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minatosfurniture.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.minatosfurniture.MinatoFurnitureMod;

public class MinatoFurnitureModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MinatoFurnitureMod.MODID);
	public static final RegistryObject<CreativeModeTab> MINATO_FURNITURE_FOODS = REGISTRY.register("minato_furniture_foods",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.minato_furniture.minato_furniture_foods")).icon(() -> new ItemStack(MinatoFurnitureModItems.CUT_COOKED_BEEF.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MinatoFurnitureModItems.CUT_COOKED_BEEF.get());
				tabData.accept(MinatoFurnitureModItems.CUT_COOKED_PORKCHOP.get());
				tabData.accept(MinatoFurnitureModItems.CUT_COOKED_CHICKEN.get());
				tabData.accept(MinatoFurnitureModItems.CUT_COOKED_MUTTON.get());
				tabData.accept(MinatoFurnitureModItems.CUT_COOKED_RABBIT.get());
				tabData.accept(MinatoFurnitureModItems.SHAVED_ICE.get());
				tabData.accept(MinatoFurnitureModItems.WATER_MELON_SHAVED.get());
			}).build());
	public static final RegistryObject<CreativeModeTab> MINATO_FURNITURE = REGISTRY.register("minato_furniture",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.minato_furniture.minato_furniture")).icon(() -> new ItemStack(MinatoFurnitureModBlocks.OAK_CHAIR.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MinatoFurnitureModBlocks.OAK_CHAIR.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.SPRUCE_CHAIR.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.BIRCH_CHAIR.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.JUNGLE_CHAIR.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.ACACIA_CHAIR.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.DARK_OAK_CHAIR.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.MANGROVE_CHAIR.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.CHERRY_CHAIR.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.SMOOTH_STONE_CHAIR.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.POLISHED_GRANITE_CHAIR.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.POLISHED_DIORITE_CHAIR.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.POLISHED_ANDESITE_CHAIR.get().asItem());
				tabData.accept(MinatoFurnitureModItems.BATH.get());
				tabData.accept(MinatoFurnitureModBlocks.OAK_TABLE.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.SPRUCE_TABLE.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.BIRCH_TABLE.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.JUNGLE_TABLE.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.ACACIA_TABLE.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.DARK_OAK_TABLE.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.MANGROVE_TABLE.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.CHERRY_TABLE.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.SMOOTH_STONE_TABLE.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.POLISHED_GRANITE_TABLE.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.POLISHED_DIORITE_TABLE.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.POLISHED_ANDESITE_TABLE.get().asItem());
				tabData.accept(MinatoFurnitureModItems.REFRIGERATOR.get());
				tabData.accept(MinatoFurnitureModBlocks.INGREDIENTS_CUTTER.get().asItem());
				tabData.accept(MinatoFurnitureModItems.GEAR.get());
				tabData.accept(MinatoFurnitureModItems.HOT_SPRING_BUCKET.get());
				tabData.accept(MinatoFurnitureModBlocks.SHOWER_HEAD.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.SHAVED_ICE_MACHINE.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.TV.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.FAN_BLOCK.get().asItem());
				tabData.accept(MinatoFurnitureModItems.FUEL.get());
				tabData.accept(MinatoFurnitureModBlocks.HIGH_HEAT_OVEN.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.TOILET.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.OAK_VERTICAL_BOOKSHELF.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.SPRUCE_VERTICAL_BOOKSHELF.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.BIRCH_VERTICAL_BOOKSHELF.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.JUNGLE_VERTICAL_BOOKSHELF.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.ACACIA_VERTICAL_BOOKSHELF.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.DARK_OAK_VERTICAL_BOOKSHELF.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.MANGROVE_VERTICAL_BOOKSHELF.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.CHERRY_VERTICAL_BOOKSHELF.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.SMOOTH_STONE_VERTICAL_BOOKSHELF.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.POLISHED_GRANITE_VERTICAL_BOOKSHELF.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.POLISHED_DIORITE_VERTICAL_BOOKSHELF.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.POLISHED_ANDESITE_VERTICAL_BOOKSHELF.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.OAK_BELL.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.SPRUCE_BELL.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.BIRCH_BELL.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.JUNGLE_BELL.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.ACACIA_BELL.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.DARK_OAK_BELL.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.MANGROVE_BELL.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.CHERRY_BELL.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.SMOOTH_STONE_BELL.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.POLISHED_GRANITE_BELL.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.POLISHED_DIORITE_BELL.get().asItem());
				tabData.accept(MinatoFurnitureModBlocks.POLISHED_ANDESITE_BELL.get().asItem());
			}).withTabsBefore(MINATO_FURNITURE_FOODS.getId()).build());
}
