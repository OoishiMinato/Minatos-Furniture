
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minatosfurniture.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.minatosfurniture.item.WatarMelonShavedItem;
import net.mcreator.minatosfurniture.item.ShavedIceItem;
import net.mcreator.minatosfurniture.item.RefrigeratorItem;
import net.mcreator.minatosfurniture.item.HotSpringItem;
import net.mcreator.minatosfurniture.item.GearItem;
import net.mcreator.minatosfurniture.item.FuelItem;
import net.mcreator.minatosfurniture.item.CutCookedRabbitItem;
import net.mcreator.minatosfurniture.item.CutCookedPorkchopItem;
import net.mcreator.minatosfurniture.item.CutCookedMuttonItem;
import net.mcreator.minatosfurniture.item.CutCookedChickenItem;
import net.mcreator.minatosfurniture.item.CutCookedBeefItem;
import net.mcreator.minatosfurniture.item.BathItem;
import net.mcreator.minatosfurniture.MinatoFurnitureMod;

public class MinatoFurnitureModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MinatoFurnitureMod.MODID);
	public static final RegistryObject<Item> OAK_CHAIR = block(MinatoFurnitureModBlocks.OAK_CHAIR);
	public static final RegistryObject<Item> SPRUCE_CHAIR = block(MinatoFurnitureModBlocks.SPRUCE_CHAIR);
	public static final RegistryObject<Item> BIRCH_CHAIR = block(MinatoFurnitureModBlocks.BIRCH_CHAIR);
	public static final RegistryObject<Item> JUNGLE_CHAIR = block(MinatoFurnitureModBlocks.JUNGLE_CHAIR);
	public static final RegistryObject<Item> ACACIA_CHAIR = block(MinatoFurnitureModBlocks.ACACIA_CHAIR);
	public static final RegistryObject<Item> DARK_OAK_CHAIR = block(MinatoFurnitureModBlocks.DARK_OAK_CHAIR);
	public static final RegistryObject<Item> SMOOTH_STONE_CHAIR = block(MinatoFurnitureModBlocks.SMOOTH_STONE_CHAIR);
	public static final RegistryObject<Item> POLISHED_GRANITE_CHAIR = block(MinatoFurnitureModBlocks.POLISHED_GRANITE_CHAIR);
	public static final RegistryObject<Item> POLISHED_DIORITE_CHAIR = block(MinatoFurnitureModBlocks.POLISHED_DIORITE_CHAIR);
	public static final RegistryObject<Item> POLISHED_ANDESITE_CHAIR = block(MinatoFurnitureModBlocks.POLISHED_ANDESITE_CHAIR);
	public static final RegistryObject<Item> BATH_1 = block(MinatoFurnitureModBlocks.BATH_1);
	public static final RegistryObject<Item> BATH_2 = block(MinatoFurnitureModBlocks.BATH_2);
	public static final RegistryObject<Item> BATH = REGISTRY.register("bath", () -> new BathItem());
	public static final RegistryObject<Item> BATH_3 = block(MinatoFurnitureModBlocks.BATH_3);
	public static final RegistryObject<Item> OAK_TABLE = block(MinatoFurnitureModBlocks.OAK_TABLE);
	public static final RegistryObject<Item> SPRUCE_TABLE = block(MinatoFurnitureModBlocks.SPRUCE_TABLE);
	public static final RegistryObject<Item> BIRCH_TABLE = block(MinatoFurnitureModBlocks.BIRCH_TABLE);
	public static final RegistryObject<Item> JUNGLE_TABLE = block(MinatoFurnitureModBlocks.JUNGLE_TABLE);
	public static final RegistryObject<Item> ACACIA_TABLE = block(MinatoFurnitureModBlocks.ACACIA_TABLE);
	public static final RegistryObject<Item> DARK_OAK_TABLE = block(MinatoFurnitureModBlocks.DARK_OAK_TABLE);
	public static final RegistryObject<Item> SMOOTH_STONE_TABLE = block(MinatoFurnitureModBlocks.SMOOTH_STONE_TABLE);
	public static final RegistryObject<Item> POLISHED_GRANITE_TABLE = block(MinatoFurnitureModBlocks.POLISHED_GRANITE_TABLE);
	public static final RegistryObject<Item> POLISHED_DIORITE_TABLE = block(MinatoFurnitureModBlocks.POLISHED_DIORITE_TABLE);
	public static final RegistryObject<Item> POLISHED_ANDESITE_TABLE = block(MinatoFurnitureModBlocks.POLISHED_ANDESITE_TABLE);
	public static final RegistryObject<Item> REFRIGERATOR_1 = block(MinatoFurnitureModBlocks.REFRIGERATOR_1);
	public static final RegistryObject<Item> REFRIGERATOR_2 = block(MinatoFurnitureModBlocks.REFRIGERATOR_2);
	public static final RegistryObject<Item> REFRIGERATOR = REGISTRY.register("refrigerator", () -> new RefrigeratorItem());
	public static final RegistryObject<Item> INGREDIENTS_CUTTER = block(MinatoFurnitureModBlocks.INGREDIENTS_CUTTER);
	public static final RegistryObject<Item> CUT_COOKED_BEEF = REGISTRY.register("cut_cooked_beef", () -> new CutCookedBeefItem());
	public static final RegistryObject<Item> CUT_COOKED_PORKCHOP = REGISTRY.register("cut_cooked_porkchop", () -> new CutCookedPorkchopItem());
	public static final RegistryObject<Item> CUT_COOKED_CHICKEN = REGISTRY.register("cut_cooked_chicken", () -> new CutCookedChickenItem());
	public static final RegistryObject<Item> GEAR = REGISTRY.register("gear", () -> new GearItem());
	public static final RegistryObject<Item> CUT_COOKED_MUTTON = REGISTRY.register("cut_cooked_mutton", () -> new CutCookedMuttonItem());
	public static final RegistryObject<Item> HOT_SPRING_BUCKET = REGISTRY.register("hot_spring_bucket", () -> new HotSpringItem());
	public static final RegistryObject<Item> SHOWER_HEAD = block(MinatoFurnitureModBlocks.SHOWER_HEAD);
	public static final RegistryObject<Item> SHOWER_HEAD_ON = block(MinatoFurnitureModBlocks.SHOWER_HEAD_ON);
	public static final RegistryObject<Item> SHAVED_ICE_MACHINE = block(MinatoFurnitureModBlocks.SHAVED_ICE_MACHINE);
	public static final RegistryObject<Item> SHAVED_ICE_MACHINE_1 = block(MinatoFurnitureModBlocks.SHAVED_ICE_MACHINE_1);
	public static final RegistryObject<Item> SHAVED_ICE_MACHINE_2 = block(MinatoFurnitureModBlocks.SHAVED_ICE_MACHINE_2);
	public static final RegistryObject<Item> SHAVED_ICE_MACHINE_3 = block(MinatoFurnitureModBlocks.SHAVED_ICE_MACHINE_3);
	public static final RegistryObject<Item> SHAVED_ICE_MACHINE_4 = block(MinatoFurnitureModBlocks.SHAVED_ICE_MACHINE_4);
	public static final RegistryObject<Item> SHAVED_ICE_MACHINE_5 = block(MinatoFurnitureModBlocks.SHAVED_ICE_MACHINE_5);
	public static final RegistryObject<Item> SHAVED_ICE_MACHINE_6 = block(MinatoFurnitureModBlocks.SHAVED_ICE_MACHINE_6);
	public static final RegistryObject<Item> SHAVED_ICE_MACHINE_7 = block(MinatoFurnitureModBlocks.SHAVED_ICE_MACHINE_7);
	public static final RegistryObject<Item> SHAVED_ICE_MACHINE_IN_ICE = block(MinatoFurnitureModBlocks.SHAVED_ICE_MACHINE_IN_ICE);
	public static final RegistryObject<Item> SHAVED_ICE = REGISTRY.register("shaved_ice", () -> new ShavedIceItem());
	public static final RegistryObject<Item> WATER_MELON_SHAVED = REGISTRY.register("water_melon_shaved", () -> new WatarMelonShavedItem());
	public static final RegistryObject<Item> TV = block(MinatoFurnitureModBlocks.TV);
	public static final RegistryObject<Item> TV_ON = block(MinatoFurnitureModBlocks.TV_ON);
	public static final RegistryObject<Item> FAN_BLOCK = block(MinatoFurnitureModBlocks.FAN_BLOCK);
	public static final RegistryObject<Item> FUEL = REGISTRY.register("fuel", () -> new FuelItem());
	public static final RegistryObject<Item> HIGH_HEAT_OVEN = block(MinatoFurnitureModBlocks.HIGH_HEAT_OVEN);
	public static final RegistryObject<Item> CUT_COOKED_RABBIT = REGISTRY.register("cut_cooked_rabbit", () -> new CutCookedRabbitItem());
	public static final RegistryObject<Item> TOILET_OPEN = block(MinatoFurnitureModBlocks.TOILET_OPEN);
	public static final RegistryObject<Item> TOILET = block(MinatoFurnitureModBlocks.TOILET);
	public static final RegistryObject<Item> OAK_VERTICAL_BOOKSHELF = block(MinatoFurnitureModBlocks.OAK_VERTICAL_BOOKSHELF);
	public static final RegistryObject<Item> SPRUCE_VERTICAL_BOOKSHELF = block(MinatoFurnitureModBlocks.SPRUCE_VERTICAL_BOOKSHELF);
	public static final RegistryObject<Item> BIRCH_VERTICAL_BOOKSHELF = block(MinatoFurnitureModBlocks.BIRCH_VERTICAL_BOOKSHELF);
	public static final RegistryObject<Item> MANGROVE_CHAIR = block(MinatoFurnitureModBlocks.MANGROVE_CHAIR);
	public static final RegistryObject<Item> MANGROVE_TABLE = block(MinatoFurnitureModBlocks.MANGROVE_TABLE);
	public static final RegistryObject<Item> CHERRY_CHAIR = block(MinatoFurnitureModBlocks.CHERRY_CHAIR);
	public static final RegistryObject<Item> CHERRY_TABLE = block(MinatoFurnitureModBlocks.CHERRY_TABLE);
	public static final RegistryObject<Item> JUNGLE_VERTICAL_BOOKSHELF = block(MinatoFurnitureModBlocks.JUNGLE_VERTICAL_BOOKSHELF);
	public static final RegistryObject<Item> ACACIA_VERTICAL_BOOKSHELF = block(MinatoFurnitureModBlocks.ACACIA_VERTICAL_BOOKSHELF);
	public static final RegistryObject<Item> DARK_OAK_VERTICAL_BOOKSHELF = block(MinatoFurnitureModBlocks.DARK_OAK_VERTICAL_BOOKSHELF);
	public static final RegistryObject<Item> MANGROVE_VERTICAL_BOOKSHELF = block(MinatoFurnitureModBlocks.MANGROVE_VERTICAL_BOOKSHELF);
	public static final RegistryObject<Item> CHERRY_VERTICAL_BOOKSHELF = block(MinatoFurnitureModBlocks.CHERRY_VERTICAL_BOOKSHELF);
	public static final RegistryObject<Item> SMOOTH_STONE_VERTICAL_BOOKSHELF = block(MinatoFurnitureModBlocks.SMOOTH_STONE_VERTICAL_BOOKSHELF);
	public static final RegistryObject<Item> POLISHED_GRANITE_VERTICAL_BOOKSHELF = block(MinatoFurnitureModBlocks.POLISHED_GRANITE_VERTICAL_BOOKSHELF);
	public static final RegistryObject<Item> POLISHED_DIORITE_VERTICAL_BOOKSHELF = block(MinatoFurnitureModBlocks.POLISHED_DIORITE_VERTICAL_BOOKSHELF);
	public static final RegistryObject<Item> POLISHED_ANDESITE_VERTICAL_BOOKSHELF = block(MinatoFurnitureModBlocks.POLISHED_ANDESITE_VERTICAL_BOOKSHELF);
	public static final RegistryObject<Item> CONNECTED_OAK_TABLE = block(MinatoFurnitureModBlocks.CONNECTED_OAK_TABLE);
	public static final RegistryObject<Item> CONNECTED_SPRUCE_TABLE = block(MinatoFurnitureModBlocks.CONNECTED_SPRUCE_TABLE);
	public static final RegistryObject<Item> CONNECTED_BIRCH_TABLE = block(MinatoFurnitureModBlocks.CONNECTED_BIRCH_TABLE);
	public static final RegistryObject<Item> CONNECTED_JUNGLE_TABLE = block(MinatoFurnitureModBlocks.CONNECTED_JUNGLE_TABLE);
	public static final RegistryObject<Item> CONNECTED_ACACIA_TABLE = block(MinatoFurnitureModBlocks.CONNECTED_ACACIA_TABLE);
	public static final RegistryObject<Item> CONNECTED_DARK_OAK_TABLE = block(MinatoFurnitureModBlocks.CONNECTED_DARK_OAK_TABLE);
	public static final RegistryObject<Item> CONNECTED_SMOOTH_STONE_TABLE = block(MinatoFurnitureModBlocks.CONNECTED_SMOOTH_STONE_TABLE);
	public static final RegistryObject<Item> CONNECTED_POLISHED_GRANITE_TABLE = block(MinatoFurnitureModBlocks.CONNECTED_POLISHED_GRANITE_TABLE);
	public static final RegistryObject<Item> CONNECTED_POLISHED_DIORITE_TABLE = block(MinatoFurnitureModBlocks.CONNECTED_POLISHED_DIORITE_TABLE);
	public static final RegistryObject<Item> CONNECTED_POLISHED_ANDESITE_TABLE = block(MinatoFurnitureModBlocks.CONNECTED_POLISHED_ANDESITE_TABLE);
	public static final RegistryObject<Item> CONNECTED_MANGROVE_TABLE = block(MinatoFurnitureModBlocks.CONNECTED_MANGROVE_TABLE);
	public static final RegistryObject<Item> CONNECTED_CHERRY_TABLE = block(MinatoFurnitureModBlocks.CONNECTED_CHERRY_TABLE);
	public static final RegistryObject<Item> OAK_BELL = block(MinatoFurnitureModBlocks.OAK_BELL);
	public static final RegistryObject<Item> SPRUCE_BELL = block(MinatoFurnitureModBlocks.SPRUCE_BELL);
	public static final RegistryObject<Item> BIRCH_BELL = block(MinatoFurnitureModBlocks.BIRCH_BELL);
	public static final RegistryObject<Item> JUNGLE_BELL = block(MinatoFurnitureModBlocks.JUNGLE_BELL);
	public static final RegistryObject<Item> ACACIA_BELL = block(MinatoFurnitureModBlocks.ACACIA_BELL);
	public static final RegistryObject<Item> DARK_OAK_BELL = block(MinatoFurnitureModBlocks.DARK_OAK_BELL);
	public static final RegistryObject<Item> SMOOTH_STONE_BELL = block(MinatoFurnitureModBlocks.SMOOTH_STONE_BELL);
	public static final RegistryObject<Item> POLISHED_GRANITE_BELL = block(MinatoFurnitureModBlocks.POLISHED_GRANITE_BELL);
	public static final RegistryObject<Item> POLISHED_DIORITE_BELL = block(MinatoFurnitureModBlocks.POLISHED_DIORITE_BELL);
	public static final RegistryObject<Item> POLISHED_ANDESITE_BELL = block(MinatoFurnitureModBlocks.POLISHED_ANDESITE_BELL);
	public static final RegistryObject<Item> CHERRY_BELL = block(MinatoFurnitureModBlocks.CHERRY_BELL);
	public static final RegistryObject<Item> MANGROVE_BELL = block(MinatoFurnitureModBlocks.MANGROVE_BELL);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
