package net.mcreator.horizonzeroblock.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.horizonzeroblock.network.HorizonZeroBlockModVariables;
import net.mcreator.horizonzeroblock.init.HorizonZeroBlockModItems;

import java.util.function.Supplier;
import java.util.Map;

public class AmmoMakingBagThisGUIIsopenProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(HorizonZeroBlockModItems.RIDGE_WOOD.get());
			_setstack.setCount((int) (entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N1);
			((Slot) _slots.get(0)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(HorizonZeroBlockModItems.METAL_SHARDS.get());
			_setstack.setCount((int) (entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N2);
			((Slot) _slots.get(1)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(HorizonZeroBlockModItems.BLAZE.get());
			_setstack.setCount((int) (entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N3);
			((Slot) _slots.get(2)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(HorizonZeroBlockModItems.WIRE.get());
			_setstack.setCount((int) (entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N4);
			((Slot) _slots.get(3)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(HorizonZeroBlockModItems.CHILLWATER.get());
			_setstack.setCount((int) (entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N5);
			((Slot) _slots.get(4)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(HorizonZeroBlockModItems.SPARKER.get());
			_setstack.setCount((int) (entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N6);
			((Slot) _slots.get(5)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(HorizonZeroBlockModItems.METALBURN.get());
			_setstack.setCount((int) (entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N7);
			((Slot) _slots.get(6)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(HorizonZeroBlockModItems.ECHO_SHELL.get());
			_setstack.setCount((int) (entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N8);
			((Slot) _slots.get(7)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
	}
}
