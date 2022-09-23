package net.mcreator.horizonzeroblock.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

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
