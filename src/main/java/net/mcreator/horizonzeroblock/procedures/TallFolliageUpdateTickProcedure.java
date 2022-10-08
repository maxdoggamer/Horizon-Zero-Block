package net.mcreator.horizonzeroblock.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class TallFolliageUpdateTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		while (entity.isShiftKeyDown()) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 20, 1, (false), (false)));
		}
	}
}
