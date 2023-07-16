package net.mcreator.horizonzeroblock.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ScrapperParticleSpawningConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.IRON_ORE) {
			return true;
		} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.COPPER_ORE) {
			return true;
		} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.COAL_ORE) {
			return true;
		} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.STONE) {
			return true;
		} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.DIORITE) {
			return true;
		} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.ANDESITE) {
			return true;
		} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.GRANITE) {
			return true;
		} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.COBBLESTONE) {
			return true;
		}
		return false;
	}
}
