
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minatosfurniture.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.minatosfurniture.world.inventory.Refrigerator2GUIMenu;
import net.mcreator.minatosfurniture.world.inventory.Refrigerator1GUIMenu;
import net.mcreator.minatosfurniture.world.inventory.OvenMenu;
import net.mcreator.minatosfurniture.MinatoFurnitureMod;

public class MinatoFurnitureModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, MinatoFurnitureMod.MODID);
	public static final RegistryObject<MenuType<Refrigerator2GUIMenu>> REFRIGERATOR_2_GUI = REGISTRY.register("refrigerator_2_gui", () -> IForgeMenuType.create(Refrigerator2GUIMenu::new));
	public static final RegistryObject<MenuType<Refrigerator1GUIMenu>> REFRIGERATOR_1_GUI = REGISTRY.register("refrigerator_1_gui", () -> IForgeMenuType.create(Refrigerator1GUIMenu::new));
	public static final RegistryObject<MenuType<OvenMenu>> OVEN = REGISTRY.register("oven", () -> IForgeMenuType.create(OvenMenu::new));
}
