package net.mcreator.horizonzeroblock.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class TallFolliageUpdateTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 200, 1, false, false));
	}
}
