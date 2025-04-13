
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minatosfurniture.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.minatosfurniture.client.renderer.BlocksitRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MinatoFurnitureModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MinatoFurnitureModEntities.BLOCKSIT.get(), BlocksitRenderer::new);
	}
}
