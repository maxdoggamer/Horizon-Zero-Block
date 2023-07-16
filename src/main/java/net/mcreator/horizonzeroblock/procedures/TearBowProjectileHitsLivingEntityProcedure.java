package net.mcreator.horizonzeroblock.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class TearBowProjectileHitsLivingEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.hit")), SoundSource.MASTER, 5, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.hit")), SoundSource.MASTER, 5, 1, false);
			}
		}
		HorizonZeroBlockMod.queueServerWork(60, () -> {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("horizon_zero_block:soundblast")), SoundSource.MASTER, 5, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("horizon_zero_block:soundblast")), SoundSource.MASTER, 5, 1, false);
				}
			}
			if (Mth.nextDouble(RandomSource.create(), 1, 10) > 5) {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 4, Explosion.BlockInteraction.NONE);
				if (entity instanceof LivingEntity _entity)
					_entity.hurt(new DamageSource("It's too LOUD! I cant listen to my toughts").bypassArmor(), 5);
			}
		});
	}
}
