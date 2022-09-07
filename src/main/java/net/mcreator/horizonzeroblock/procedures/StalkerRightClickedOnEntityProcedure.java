package net.mcreator.horizonzeroblock.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.horizonzeroblock.network.HorizonZeroBlockModVariables;
import net.mcreator.horizonzeroblock.init.HorizonZeroBlockModItems;
import net.mcreator.horizonzeroblock.init.HorizonZeroBlockModEntities;
import net.mcreator.horizonzeroblock.entity.StalkerTamedEntity;

public class StalkerRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == HorizonZeroBlockModItems.SPEAR
				.get()) {
			if ((entity.getCapability(HorizonZeroBlockModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new HorizonZeroBlockModVariables.PlayerVariables())).XI_overrides == true) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 99999, (false), (false)));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 99999, (false), (false)));
				new Object() {
					private int ticks = 0;
					private float waitTicks;
					private LevelAccessor world;

					public void start(LevelAccessor world, int waitTicks) {
						this.waitTicks = waitTicks;
						MinecraftForge.EVENT_BUS.register(this);
						this.world = world;
					}

					@SubscribeEvent
					public void tick(TickEvent.ServerTickEvent event) {
						if (event.phase == TickEvent.Phase.END) {
							this.ticks += 1;
							if (this.ticks >= this.waitTicks)
								run();
						}
					}

					private void run() {
						if (!entity.level.isClientSide())
							entity.discard();
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new StalkerTamedEntity(HorizonZeroBlockModEntities.STALKER_TAMED.get(), _level);
							entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()),
										MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, 60);
			}
		}
	}
}
