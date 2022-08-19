
package net.mcreator.test.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.Rarity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.test.init.TestModItems;
import net.mcreator.test.init.TestModFluids;
import net.mcreator.test.init.TestModBlocks;

public abstract class ToxinFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(TestModFluids.TOXIN, TestModFluids.FLOWING_TOXIN,
			FluidAttributes.builder(new ResourceLocation("test:blocks/toxinstill"), new ResourceLocation("test:blocks/toxinflow"))

					.density(3).viscosity(20)

					.rarity(Rarity.EPIC))
			.explosionResistance(100f)

			.tickRate(20).levelDecreasePerBlock(4).slopeFindDistance(1).bucket(TestModItems.TOXIN_BUCKET)
			.block(() -> (LiquidBlock) TestModBlocks.TOXIN.get());

	private ToxinFluid() {
		super(PROPERTIES);
	}

	@Override
	public Vec3 getFlow(BlockGetter world, BlockPos pos, FluidState fluidstate) {
		return super.getFlow(world, pos, fluidstate).scale(-1.5);
	}

	public static class Source extends ToxinFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends ToxinFluid {
		public Flowing() {
			super();
		}

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
