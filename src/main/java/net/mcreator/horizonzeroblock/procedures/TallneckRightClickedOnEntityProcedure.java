package net.mcreator.horizonzeroblock.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class TallneckRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == HorizonZeroBlockModItems.SPEAR.get()) {
			if ((sourceentity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HorizonZeroBlockModVariables.PlayerVariables())).PSI_overrides == true) {
				if (sourceentity instanceof LivingEntity _entity && !_entity.level.isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 99999, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 99999, false, false));
				HorizonZeroBlockMod.queueServerWork(60, () -> {
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth(0);
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new TallneckTamedEntity(HorizonZeroBlockModEntities.TALLNECK_TAMED.get(), _level);
						entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					{
						boolean _setval = false;
						entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.PSI_overrides = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				});
			}
		}
	}
}
