package net.mcreator.horizonzeroblock.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.horizonzeroblock.network.HorizonZeroBlockModVariables;

public class TallneckNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		if (HorizonZeroBlockModVariables.WorldVariables.get(world).Tallneck == false) {
			return true;
		}
		return false;
	}
}
