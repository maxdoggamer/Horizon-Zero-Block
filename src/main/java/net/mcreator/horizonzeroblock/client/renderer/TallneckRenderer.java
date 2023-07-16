
package net.mcreator.horizonzeroblock.client.renderer;

public class TallneckRenderer extends MobRenderer<TallneckEntity, ModelTallneck<TallneckEntity>> {

	public TallneckRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelTallneck(context.bakeLayer(ModelTallneck.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(TallneckEntity entity) {
		return new ResourceLocation("horizon_zero_block:textures/entities/tallneck.png");
	}

}
