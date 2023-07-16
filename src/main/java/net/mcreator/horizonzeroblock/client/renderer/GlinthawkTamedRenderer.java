
package net.mcreator.horizonzeroblock.client.renderer;

public class GlinthawkTamedRenderer extends MobRenderer<GlinthawkTamedEntity, ModelGlinthawk<GlinthawkTamedEntity>> {

	public GlinthawkTamedRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelGlinthawk(context.bakeLayer(ModelGlinthawk.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(GlinthawkTamedEntity entity) {
		return new ResourceLocation("horizon_zero_block:textures/entities/glinthawktame.png");
	}

}
