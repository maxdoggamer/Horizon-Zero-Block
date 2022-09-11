package net.mcreator.horizonzeroblock.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.horizonzeroblock.network.HorizonZeroBlockModVariables;

public class CorruptorEntityDiesProcedure {
	public static void execute(Entity sourceentity) {
		if (sourceentity == null)
			return;
		{
			boolean _setval = true;
			sourceentity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.PSI_overrides = _setval;
				capability.syncPlayerVariables(sourceentity);
			});
		}
	}
}
