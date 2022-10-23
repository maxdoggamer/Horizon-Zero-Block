package net.mcreator.horizonzeroblock.procedures;

import net.minecraftforge.server.ServerLifecycleHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.chat.Component;

import net.mcreator.horizonzeroblock.network.HorizonZeroBlockModVariables;

public class TallneckEntityDiesProcedure {
	public static void execute(LevelAccessor world) {
		if (!world.isClientSide()) {
			MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
			if (_mcserv != null)
				_mcserv.getPlayerList().broadcastSystemMessage(Component.literal("Somehow the tallneck has been defeated (STOP CHEATING)"), false);
		}
		HorizonZeroBlockModVariables.WorldVariables.get(world).Tallneck = false;
		HorizonZeroBlockModVariables.WorldVariables.get(world).syncData(world);
	}
}
