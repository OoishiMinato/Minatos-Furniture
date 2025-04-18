
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minatosfurniture.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.minatosfurniture.fluid.HotSpringFluid;
import net.mcreator.minatosfurniture.MinatoFurnitureMod;

public class MinatoFurnitureModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, MinatoFurnitureMod.MODID);
	public static final RegistryObject<FlowingFluid> HOT_SPRING = REGISTRY.register("hot_spring", () -> new HotSpringFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_HOT_SPRING = REGISTRY.register("flowing_hot_spring", () -> new HotSpringFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(HOT_SPRING.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_HOT_SPRING.get(), RenderType.translucent());
		}
	}
}
