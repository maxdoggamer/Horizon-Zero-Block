
package net.mcreator.horizonzeroblock.client.renderer;

public class TallneckTamedRenderer extends MobRenderer<TallneckTamedEntity, ModelTallneck<TallneckTamedEntity>> {

	public TallneckTamedRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelTallneck(context.bakeLayer(ModelTallneck.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(TallneckTamedEntity entity) {
		return new ResourceLocation("horizon_zero_block:textures/entities/tallneck_tame.png");
	}

}
