
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minatosfurniture.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.minatosfurniture.potion.CoolMobEffect;
import net.mcreator.minatosfurniture.MinatoFurnitureMod;

public class MinatoFurnitureModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, MinatoFurnitureMod.MODID);
	public static final RegistryObject<MobEffect> COOL = REGISTRY.register("cool", () -> new CoolMobEffect());
}
