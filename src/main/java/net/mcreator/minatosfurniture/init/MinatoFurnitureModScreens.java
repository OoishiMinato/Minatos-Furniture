
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minatosfurniture.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.minatosfurniture.client.gui.Refrigerator2GUIScreen;
import net.mcreator.minatosfurniture.client.gui.Refrigerator1GUIScreen;
import net.mcreator.minatosfurniture.client.gui.OvenScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MinatoFurnitureModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(MinatoFurnitureModMenus.REFRIGERATOR_2_GUI.get(), Refrigerator2GUIScreen::new);
			MenuScreens.register(MinatoFurnitureModMenus.REFRIGERATOR_1_GUI.get(), Refrigerator1GUIScreen::new);
			MenuScreens.register(MinatoFurnitureModMenus.OVEN.get(), OvenScreen::new);
		});
	}
}
