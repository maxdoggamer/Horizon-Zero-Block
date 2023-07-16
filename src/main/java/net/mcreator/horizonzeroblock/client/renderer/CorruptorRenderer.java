
package net.mcreator.horizonzeroblock.client.renderer;

public class CorruptorRenderer extends MobRenderer<CorruptorEntity, ModelCorruptor<CorruptorEntity>> {

	public CorruptorRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCorruptor(context.bakeLayer(ModelCorruptor.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(CorruptorEntity entity) {
		return new ResourceLocation("horizon_zero_block:textures/entities/corruptor.png");
	}

}
