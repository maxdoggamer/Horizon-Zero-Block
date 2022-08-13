package net.mcreator.horizonzeroblock.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.horizonzeroblock.init.HorizonZeroBlockModBlocks;

public class RidgeWoodRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos(x, y, z), HorizonZeroBlockModBlocks.RIDGE_WOOD_BRUSH.get().defaultBlockState(), 3);
	}
}
