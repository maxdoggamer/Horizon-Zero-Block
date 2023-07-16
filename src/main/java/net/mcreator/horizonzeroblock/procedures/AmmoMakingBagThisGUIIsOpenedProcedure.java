package net.mcreator.horizonzeroblock.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class AmmoMakingBagThisGUIIsOpenedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (true) {
			{
				ItemStack _setval = (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY);
				entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.R1 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(0) + (entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N1;
				entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.N1 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get(0)).set(ItemStack.EMPTY);
				_player.containerMenu.broadcastChanges();
			}
		}
		if (true) {
			{
				ItemStack _setval = (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY);
				entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.R2 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(1) + (entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N2;
				entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.N2 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get(1)).set(ItemStack.EMPTY);
				_player.containerMenu.broadcastChanges();
			}
		}
		if (true) {
			{
				ItemStack _setval = (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY);
				entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.R3 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(2) + (entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N3;
				entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.N3 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get(2)).set(ItemStack.EMPTY);
				_player.containerMenu.broadcastChanges();
			}
		}
		if (true) {
			{
				ItemStack _setval = (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY);
				entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.R4 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(3) + (entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N4;
				entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.N4 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get(3)).set(ItemStack.EMPTY);
				_player.containerMenu.broadcastChanges();
			}
		}
		if (true) {
			{
				ItemStack _setval = (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY);
				entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.R5 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(4) + (entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N5;
				entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.N5 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get(4)).set(ItemStack.EMPTY);
				_player.containerMenu.broadcastChanges();
			}
		}
		if (true) {
			{
				ItemStack _setval = (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY);
				entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.R6 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(5) + (entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N6;
				entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.N6 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get(5)).set(ItemStack.EMPTY);
				_player.containerMenu.broadcastChanges();
			}
		}
		if (true) {
			{
				ItemStack _setval = (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY);
				entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.R7 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(6) + (entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N7;
				entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.N7 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get(6)).set(ItemStack.EMPTY);
				_player.containerMenu.broadcastChanges();
			}
		}
		if (true) {
			{
				ItemStack _setval = (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY);
				entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.R8 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(7) + (entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N8;
				entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.N8 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get(7)).set(ItemStack.EMPTY);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}
