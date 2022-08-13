package net.mcreator.horizonzeroblock.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.horizonzeroblock.init.HorizonZeroBlockModMobEffects;

public class FrostWarBowProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(HorizonZeroBlockModMobEffects.FREEZE.get(), 200, 1, (false), (false)));
	}
}
