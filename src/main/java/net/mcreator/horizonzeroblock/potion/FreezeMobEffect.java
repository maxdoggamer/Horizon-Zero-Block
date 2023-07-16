
package net.mcreator.horizonzeroblock.potion;

public class FreezeMobEffect extends MobEffect {

	public FreezeMobEffect() {
		super(MobEffectCategory.HARMFUL, -16711681);
	}

	@Override
	public String getDescriptionId() {
		return "effect.horizon_zero_block.freeze";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		FreezeActiveTickConditionProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

}
