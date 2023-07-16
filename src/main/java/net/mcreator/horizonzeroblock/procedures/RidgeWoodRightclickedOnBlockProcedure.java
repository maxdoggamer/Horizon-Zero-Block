package net.mcreator.horizonzeroblock.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class RidgeWoodRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.isEmptyBlock(new BlockPos(x, y + 1, z))) {
			world.setBlock(new BlockPos(x, y + 1, z), HorizonZeroBlockModBlocks.RIDGE_WOOD_BRUSH.get().defaultBlockState(), 3);
		}
	}
}
