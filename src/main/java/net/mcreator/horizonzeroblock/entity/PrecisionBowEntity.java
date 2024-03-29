
package net.mcreator.horizonzeroblock.entity;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class PrecisionBowEntity extends AbstractArrow implements ItemSupplier {
	public PrecisionBowEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(HorizonZeroBlockModEntities.PRECISION_BOW.get(), world);
	}

	public PrecisionBowEntity(EntityType<? extends PrecisionBowEntity> type, Level world) {
		super(type, world);
	}

	public PrecisionBowEntity(EntityType<? extends PrecisionBowEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public PrecisionBowEntity(EntityType<? extends PrecisionBowEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return ItemStack.EMPTY;
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(HorizonZeroBlockModItems.PRECISION_ARROW.get());
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void tick() {
		super.tick();
		if (this.inGround)
			this.discard();
	}

	public static PrecisionBowEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		PrecisionBowEntity entityarrow = new PrecisionBowEntity(HorizonZeroBlockModEntities.PRECISION_BOW.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(true);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1, 1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static PrecisionBowEntity shoot(LivingEntity entity, LivingEntity target) {
		PrecisionBowEntity entityarrow = new PrecisionBowEntity(HorizonZeroBlockModEntities.PRECISION_BOW.get(), entity, entity.level);
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 5f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(2.5);
		entityarrow.setKnockback(1);
		entityarrow.setCritArrow(true);
		entity.level.addFreshEntity(entityarrow);
		entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1, 1f / (RandomSource.create().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}
