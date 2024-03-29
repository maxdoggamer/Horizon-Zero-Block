
package net.mcreator.horizonzeroblock.entity;

import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.material.Material;
import net.minecraft.nbt.Tag;
import net.minecraft.sounds.SoundEvent;

import javax.annotation.Nullable;

public class SnapmawEntity extends Monster {

	public SnapmawEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(HorizonZeroBlockModEntities.SNAPMAW.get(), world);
	}

	public SnapmawEntity(EntityType<SnapmawEntity> type, Level world) {
		super(type, world);
		maxUpStep = 0.6f;
		xpReward = 5;
		setNoAi(false);

		this.setPathfindingMalus(BlockPathTypes.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (SnapmawEntity.this.isInWater())
					SnapmawEntity.this.setDeltaMovement(SnapmawEntity.this.getDeltaMovement().add(0, 0.005, 0));

				if (this.operation == MoveControl.Operation.MOVE_TO && !SnapmawEntity.this.getNavigation().isDone()) {
					double dx = this.wantedX - SnapmawEntity.this.getX();
					double dy = this.wantedY - SnapmawEntity.this.getY();
					double dz = this.wantedZ - SnapmawEntity.this.getZ();

					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier * SnapmawEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());

					SnapmawEntity.this.setYRot(this.rotlerp(SnapmawEntity.this.getYRot(), f, 10));
					SnapmawEntity.this.yBodyRot = SnapmawEntity.this.getYRot();
					SnapmawEntity.this.yHeadRot = SnapmawEntity.this.getYRot();

					if (SnapmawEntity.this.isInWater()) {
						SnapmawEntity.this.setSpeed((float) SnapmawEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());

						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						SnapmawEntity.this.setXRot(this.rotlerp(SnapmawEntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(SnapmawEntity.this.getXRot() * (float) (Math.PI / 180.0));

						SnapmawEntity.this.setZza(f3 * f1);
						SnapmawEntity.this.setYya((float) (f1 * dy));
					} else {
						SnapmawEntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					SnapmawEntity.this.setSpeed(0);
					SnapmawEntity.this.setYya(0);
					SnapmawEntity.this.setZza(0);
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
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
	}

	@Override
	public boolean hurt(DamageSource source, float amount) {
		SnapmawEntityIsHurtProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this, source.getEntity());
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
	public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
		ItemStack itemstack = sourceentity.getItemInHand(hand);
		InteractionResult retval = InteractionResult.sidedSuccess(this.level.isClientSide());

		super.mobInteract(sourceentity, hand);

		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Entity entity = this;
		Level world = this.level;

		SnapmawRightClickedOnEntityProcedure.execute(world, x, y, z, entity, sourceentity);
		return retval;
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
		SpawnPlacements.register(HorizonZeroBlockModEntities.SNAPMAW.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> (world.getDifficulty() != Difficulty.PEACEFUL && Monster.isDarkEnoughToSpawn(world, pos, random) && Mob.checkMobSpawnRules(entityType, world, reason, pos, random)));

	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 70);
		builder = builder.add(Attributes.ARMOR, 0.2);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);

		builder = builder.add(ForgeMod.SWIM_SPEED.get(), 0.3);

		return builder;
	}

}
