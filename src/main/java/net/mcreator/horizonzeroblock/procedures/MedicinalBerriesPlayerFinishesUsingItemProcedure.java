package net.mcreator.horizonzeroblock.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class MedicinalBerriesPlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 2));
	}
}
