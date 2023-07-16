
package net.mcreator.horizonzeroblock.client.particle;

@OnlyIn(Dist.CLIENT)
public class SparkParticle extends TextureSheetParticle {

	public static SparkParticleProvider provider(SpriteSet spriteSet) {
		return new SparkParticleProvider(spriteSet);
	}

	public static class SparkParticleProvider implements ParticleProvider<SimpleParticleType> {
		private final SpriteSet spriteSet;

		public SparkParticleProvider(SpriteSet spriteSet) {
			this.spriteSet = spriteSet;
		}

		public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
			return new SparkParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
		}
	}

	private final SpriteSet spriteSet;

	protected SparkParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
		super(world, x, y, z);
		this.spriteSet = spriteSet;

		this.setSize(0.2f, 0.2f);
		this.quadSize *= 0.5f;

		this.lifetime = 5;

		this.gravity = 1.5f;
		this.hasPhysics = true;

		this.xd = vx * 1;
		this.yd = vy * 1;
		this.zd = vz * 1;

		this.pickSprite(spriteSet);
	}

	@Override
	public int getLightColor(float partialTick) {
		return 15728880;
	}

	@Override
	public ParticleRenderType getRenderType() {
		return ParticleRenderType.PARTICLE_SHEET_LIT;
	}

	@Override
	public void tick() {
		super.tick();

	}

}
