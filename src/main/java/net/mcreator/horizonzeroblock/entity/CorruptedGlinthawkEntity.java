
package net.mcreator.horizonzeroblock.entity;

import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.material.Material;
import net.minecraft.nbt.Tag;
import net.minecraft.sounds.SoundEvent;

import javax.annotation.Nullable;

public class CorruptedGlinthawkEntity extends Monster implements RangedAttackMob {

	public CorruptedGlinthawkEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(HorizonZeroBlockModEntities.CORRUPTED_GLINTHAWK.get(), world);
	}

	public CorruptedGlinthawkEntity(EntityType<CorruptedGlinthawkEntity> type, Level world) {
		super(type, world);
		maxUpStep = 0.6f;
		xpReward = 6;
		setNoAi(false);

		this.moveControl = new FlyingMoveControl(this, 10, true);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected PathNavigation createNavigation(Level world) {
		return new FlyingPathNavigation(this, world);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();

		this.targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, Player.class, true, false));
		this.goalSelector.addGoal(2, new Goal() {
			{
				this.setFlags(EnumSet.of(Goal.Flag.MOVE));
			}

			public boolean canUse() {
				if (CorruptedGlinthawkEntity.this.getTarget() != null && !CorruptedGlinthawkEntity.this.getMoveControl().hasWanted()) {
					return true;
				} else {
					return false;
				}
			}

			@Override
			public boolean canContinueToUse() {
				return CorruptedGlinthawkEntity.this.getMoveControl().hasWanted() && CorruptedGlinthawkEntity.this.getTarget() != null && CorruptedGlinthawkEntity.this.getTarget().isAlive();
			}

			@Override
			public void start() {
				LivingEntity livingentity = CorruptedGlinthawkEntity.this.getTarget();
				Vec3 vec3d = livingentity.getEyePosition(1);
				CorruptedGlinthawkEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 2);
			}

			@Override
			public void tick() {
				LivingEntity livingentity = CorruptedGlinthawkEntity.this.getTarget();
				if (CorruptedGlinthawkEntity.this.getBoundingBox().intersects(livingentity.getBoundingBox())) {
					CorruptedGlinthawkEntity.this.doHurtTarget(livingentity);
				} else {
					double d0 = CorruptedGlinthawkEntity.this.distanceToSqr(livingentity);
					if (d0 < 16) {
						Vec3 vec3d = livingentity.getEyePosition(1);
						CorruptedGlinthawkEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 2);
					}
				}
			}
		});
		this.goalSelector.addGoal(3, new MeleeAttackGoal(this, 1.2, false) {

			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}

		});
		this.goalSelector.addGoal(4, new RandomStrollGoal(this, 2, 20) {

			@Override
			protected Vec3 getPosition() {
				RandomSource random = CorruptedGlinthawkEntity.this.getRandom();
				double dir_x = CorruptedGlinthawkEntity.this.getX() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_y = CorruptedGlinthawkEntity.this.getY() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_z = CorruptedGlinthawkEntity.this.getZ() + ((random.nextFloat() * 2 - 1) * 16);
				return new Vec3(dir_x, dir_y, dir_z);
			}

		});
		this.goalSelector.addGoal(5, new RandomStrollGoal(this, 1));
		this.targetSelector.addGoal(6, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(7, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(8, new FloatGoal(this));

		this.goalSelector.addGoal(1, new RangedAttackGoal(this, 1.25, 20, 10f) {
			@Override
			public boolean canContinueToUse() {
				return this.canUse();
			}
		});
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
	public boolean causeFallDamage(float l, float d, DamageSource source) {

		return false;
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
	public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
		ItemStack itemstack = sourceentity.getItemInHand(hand);
		InteractionResult retval = InteractionResult.sidedSuccess(this.level.isClientSide());

		super.mobInteract(sourceentity, hand);

		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Entity entity = this;
		Level world = this.level;

		GlinthawkRightClickedOnEntityProcedure.execute(world, x, y, z, entity, sourceentity);
		return retval;
	}

	@Override
	public void performRangedAttack(LivingEntity target, float flval) {
		FrostEntity.shoot(this, target);
	}

	@Override
	protected void checkFallDamage(double y, boolean onGroundIn, BlockState state, BlockPos pos) {
	}

	@Override
	public void setNoGravity(boolean ignored) {
		super.setNoGravity(true);
	}

	public void aiStep() {
		super.aiStep();

		this.setNoGravity(true);
	}

	public static void init() {
		SpawnPlacements.register(HorizonZeroBlockModEntities.CORRUPTED_GLINTHAWK.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> (world.getDifficulty() != Difficulty.PEACEFUL && Monster.isDarkEnoughToSpawn(world, pos, random) && Mob.checkMobSpawnRules(entityType, world, reason, pos, random)));

	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 80);
		builder = builder.add(Attributes.ARMOR, 1.5);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 1);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);

		builder = builder.add(Attributes.FLYING_SPEED, 0.3);

		return builder;
	}

}
