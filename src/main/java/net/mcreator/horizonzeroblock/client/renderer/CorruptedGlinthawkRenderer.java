
package net.mcreator.horizonzeroblock.client.renderer;

public class CorruptedGlinthawkRenderer extends MobRenderer<CorruptedGlinthawkEntity, ModelGlinthawk<CorruptedGlinthawkEntity>> {

	public CorruptedGlinthawkRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelGlinthawk(context.bakeLayer(ModelGlinthawk.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(CorruptedGlinthawkEntity entity) {
		return new ResourceLocation("horizon_zero_block:textures/entities/glinthawkcorrupted.png");
	}

}
