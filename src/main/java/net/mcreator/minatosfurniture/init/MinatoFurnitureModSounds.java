
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minatosfurniture.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.minatosfurniture.MinatoFurnitureMod;

public class MinatoFurnitureModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MinatoFurnitureMod.MODID);
	public static final RegistryObject<SoundEvent> DERU = REGISTRY.register("deru", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("minato_furniture", "deru")));
	public static final RegistryObject<SoundEvent> IRERU = REGISTRY.register("ireru", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("minato_furniture", "ireru")));
	public static final RegistryObject<SoundEvent> KEZURU = REGISTRY.register("kezuru", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("minato_furniture", "kezuru")));
	public static final RegistryObject<SoundEvent> SENPUKI = REGISTRY.register("senpuki", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("minato_furniture", "senpuki")));
	public static final RegistryObject<SoundEvent> FLUSH = REGISTRY.register("flush", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("minato_furniture", "flush")));
	public static final RegistryObject<SoundEvent> BELL = REGISTRY.register("bell", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("minato_furniture", "bell")));
}
