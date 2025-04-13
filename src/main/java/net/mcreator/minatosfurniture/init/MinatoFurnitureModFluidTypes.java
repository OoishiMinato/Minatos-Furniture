
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minatosfurniture.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.minatosfurniture.fluid.types.HotSpringFluidType;
import net.mcreator.minatosfurniture.MinatoFurnitureMod;

public class MinatoFurnitureModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, MinatoFurnitureMod.MODID);
	public static final RegistryObject<FluidType> HOT_SPRING_TYPE = REGISTRY.register("hot_spring", () -> new HotSpringFluidType());
}
