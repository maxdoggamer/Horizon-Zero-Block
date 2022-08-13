package net.mcreator.horizonzeroblock.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.horizonzeroblock.init.HorizonZeroBlockModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class FreezeDamageProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity());
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(HorizonZeroBlockModMobEffects.FREEZE.get()) : false) {
			if (entity instanceof LivingEntity _entity)
				_entity.hurt(new DamageSource("Freeze").bypassArmor(), 3);
		}
	}
}
