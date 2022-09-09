package net.mcreator.horizonzeroblock.procedures;

import net.minecraftforge.server.ServerLifecycleHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.ChatType;
import net.minecraft.Util;

import net.mcreator.horizonzeroblock.network.HorizonZeroBlockModVariables;

public class TallneckEntityDiesProcedure {
	public static void execute(LevelAccessor world) {
		if (!world.isClientSide()) {
			MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
			if (_mcserv != null)
				_mcserv.getPlayerList().broadcastMessage(new TextComponent("Somehow the tallneck has been defeated"), ChatType.SYSTEM, Util.NIL_UUID);
		}
		HorizonZeroBlockModVariables.WorldVariables.get(world).Tallneck = false;
		HorizonZeroBlockModVariables.WorldVariables.get(world).syncData(world);
	}
}
