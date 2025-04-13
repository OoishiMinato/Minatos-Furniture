
package net.mcreator.minatosfurniture.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.minatosfurniture.init.MinatoFurnitureModItems;
import net.mcreator.minatosfurniture.init.MinatoFurnitureModFluids;
import net.mcreator.minatosfurniture.init.MinatoFurnitureModFluidTypes;
import net.mcreator.minatosfurniture.init.MinatoFurnitureModBlocks;

public abstract class HotSpringFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> MinatoFurnitureModFluidTypes.HOT_SPRING_TYPE.get(), () -> MinatoFurnitureModFluids.HOT_SPRING.get(),
			() -> MinatoFurnitureModFluids.FLOWING_HOT_SPRING.get()).explosionResistance(100f).bucket(() -> MinatoFurnitureModItems.HOT_SPRING_BUCKET.get()).block(() -> (LiquidBlock) MinatoFurnitureModBlocks.HOT_SPRING.get());

	private HotSpringFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.CAMPFIRE_COSY_SMOKE;
	}

	public static class Source extends HotSpringFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends HotSpringFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
