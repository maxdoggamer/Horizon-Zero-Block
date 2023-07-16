
package net.mcreator.horizonzeroblock.entity;

import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.material.Material;
import net.minecraft.nbt.Tag;
import net.minecraft.sounds.SoundEvent;

import javax.annotation.Nullable;

public class SnapmawCorruptedEntity extends Monster {

	public SnapmawCorruptedEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(HorizonZeroBlockModEntities.CORRUPTED_SNAPMAW.get(), world);
	}

	public SnapmawCorruptedEntity(EntityType<SnapmawCorruptedEntity> type, Level world) {
		super(type, world);
		maxUpStep = 0.6f;
		xpReward = 10;
		setNoAi(false);

		setPersistenceRequired();

		this.setPathfindingMalus(BlockPathTypes.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (SnapmawCorruptedEntity.this.isInWater())
					SnapmawCorruptedEntity.this.setDeltaMovement(SnapmawCorruptedEntity.this.getDeltaMovement().add(0, 0.005, 0));

				if (this.operation == MoveControl.Operation.MOVE_TO && !SnapmawCorruptedEntity.this.getNavigation().isDone()) {
					double dx = this.wantedX - SnapmawCorruptedEntity.this.getX();
					double dy = this.wantedY - SnapmawCorruptedEntity.this.getY();
					double dz = this.wantedZ - SnapmawCorruptedEntity.this.getZ();

					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier * SnapmawCorruptedEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());

					SnapmawCorruptedEntity.this.setYRot(this.rotlerp(SnapmawCorruptedEntity.this.getYRot(), f, 10));
					SnapmawCorruptedEntity.this.yBodyRot = SnapmawCorruptedEntity.this.getYRot();
					SnapmawCorruptedEntity.this.yHeadRot = SnapmawCorruptedEntity.this.getYRot();

					if (SnapmawCorruptedEntity.this.isInWater()) {
						SnapmawCorruptedEntity.this.setSpeed((float) SnapmawCorruptedEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());

						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						SnapmawCorruptedEntity.this.setXRot(this.rotlerp(SnapmawCorruptedEntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(SnapmawCorruptedEntity.this.getXRot() * (float) (Math.PI / 180.0));

						SnapmawCorruptedEntity.this.setZza(f3 * f1);
						SnapmawCorruptedEntity.this.setYya((float) (f1 * dy));
					} else {
						SnapmawCorruptedEntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					SnapmawCorruptedEntity.this.setSpeed(0);
					SnapmawCorruptedEntity.this.setYya(0);
					SnapmawCorruptedEntity.this.setZza(0);
				}
			}
		};
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected PathNavigation createNavigation(Level world) {
		return new WaterBoundPathNavigation(this, world);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();

		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, false) {

			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}

		});
		this.goalSelector.addGoal(2, new RandomSwimmingGoal(this, 2, 40));
		this.goalSelector.addGoal(3, new RandomStrollGoal(this, 1));
		this.targetSelector.addGoal(4, new HurtByTargetGoal(this).setAlertOthers());
		this.goalSelector.addGoal(5, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(6, new FloatGoal(this));

	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
	}

	@Override
	public boolean hurt(DamageSource source, float amount) {
		if (source == DamageSource.FALL)
			return false;
		if (source == DamageSource.CACTUS)
			return false;
		if (source == DamageSource.DROWN)
			return false;
		if (source == DamageSource.WITHER)
			return false;
		if (source.getMsgId().equals("witherSkull"))
			return false;
		return super.hurt(source, amount);
	}

	@Override
	public boolean canBreatheUnderwater() {
		return true;
	}

	@Override
	public boolean checkSpawnObstruction(LevelReader world) {
		return world.isUnobstructed(this);
	}

	@Override
	public boolean isPushedByFluid() {
		return false;
	}

	public static void init() {

	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 90);
		builder = builder.add(Attributes.ARMOR, 1);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 4);
		builder = builder.add(Attributes.FOLLOW_RANGE, 32);

		builder = builder.add(ForgeMod.SWIM_SPEED.get(), 0.3);

		return builder;
	}

}
