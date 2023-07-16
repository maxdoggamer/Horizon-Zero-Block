package net.mcreator.horizonzeroblock.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class AmmoCraftingOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == HorizonZeroBlockModItems.FIRE_HUNTER_BOW.get()) {
			if ((entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N1 > 1) {
				if ((entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N2 > 4) {
					if ((entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N3 > 2) {
						{
							double _setval = (entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N1 - 2;
							entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.N1 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = (entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N2 - 5;
							entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.N2 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = (entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N3 - 3;
							entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.N3 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(HorizonZeroBlockModItems.FIRE_ARROW.get());
							_setstack.setCount(10);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					}
				}
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == HorizonZeroBlockModItems.PRECISION_BOW.get()) {
			if ((entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N1 > 9) {
				if ((entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N2 > 7) {
					if ((entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N4 > 4) {
						{
							double _setval = (entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N1 - 10;
							entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.N1 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = (entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N2 - 8;
							entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.N2 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = (entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N4 - 5;
							entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.N4 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(HorizonZeroBlockModItems.PRECISION_ARROW.get());
							_setstack.setCount(5);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					}
				}
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == HorizonZeroBlockModItems.HARD_BOW.get()) {
			if ((entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N1 > 4) {
				if ((entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N2 > 9) {
					{
						double _setval = (entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N1 - 5;
						entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.N1 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = (entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N2 - 10;
						entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.N2 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(HorizonZeroBlockModItems.HARDPOINT_ARROW.get());
						_setstack.setCount(10);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == HorizonZeroBlockModItems.FROST_WAR_BOW.get()) {
			if ((entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N1 > 9) {
				if ((entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N2 > 4) {
					if ((entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N5 > 2) {
						{
							double _setval = (entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N1 - 10;
							entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.N1 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = (entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N2 - 5;
							entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.N2 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = (entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N5 - 3;
							entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.N5 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(HorizonZeroBlockModItems.FREEZE_ARROW.get());
							_setstack.setCount(5);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					}
				}
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == HorizonZeroBlockModItems.THUNDER_WAR_BOW.get()) {
			if ((entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N1 > 9) {
				if ((entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N2 > 4) {
					if ((entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N6 > 4) {
						{
							double _setval = (entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N1 - 10;
							entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.N1 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = (entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N2 - 5;
							entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.N2 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = (entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N6 - 5;
							entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.N6 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(HorizonZeroBlockModItems.SHOCK_ARROW.get());
							_setstack.setCount(5);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					}
				}
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == HorizonZeroBlockModItems.HUNTER_BOW.get()) {
			if ((entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N1 > 0) {
				if ((entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N2 > 1) {
					{
						double _setval = (entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N1 - 1;
						entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.N1 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = (entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N2 - 2;
						entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.N2 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(HorizonZeroBlockModItems.HUNTER_ARROW.get());
						_setstack.setCount(10);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == HorizonZeroBlockModItems.TEAR_BOW.get()) {
			if ((entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N1 > 9) {
				if ((entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N2 > 7) {
					if ((entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N8 > 3) {
						{
							double _setval = (entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N1 - 10;
							entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.N1 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = (entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N2 - 8;
							entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.N2 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = (entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HorizonZeroBlockModVariables.PlayerVariables())).N8 - 4;
							entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.N8 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(HorizonZeroBlockModItems.TEARBLAST_ARROW.get());
							_setstack.setCount(5);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					}
				}
			}
		}
	}
}
