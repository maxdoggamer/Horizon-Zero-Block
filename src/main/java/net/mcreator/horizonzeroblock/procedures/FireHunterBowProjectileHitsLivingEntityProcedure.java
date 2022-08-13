package net.mcreator.horizonzeroblock.procedures;

import net.minecraft.world.entity.Entity;

public class FireHunterBowProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(10);
	}
}
