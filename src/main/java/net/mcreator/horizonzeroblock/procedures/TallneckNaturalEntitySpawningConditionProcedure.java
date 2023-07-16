package net.mcreator.horizonzeroblock.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class TallneckNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		if (HorizonZeroBlockModVariables.WorldVariables.get(world).Tallneck == false) {
			return true;
		}
		return false;
	}
}
