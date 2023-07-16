package net.mcreator.horizonzeroblock.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class TallneckEntityDiesProcedure {
	public static void execute(LevelAccessor world) {
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Somehow the tallneck has been defeated (STOP CHEATING)"), false);
		HorizonZeroBlockModVariables.WorldVariables.get(world).Tallneck = false;
		HorizonZeroBlockModVariables.WorldVariables.get(world).syncData(world);
	}
}
