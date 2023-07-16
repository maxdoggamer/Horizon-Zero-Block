
package net.mcreator.horizonzeroblock.client.renderer;

public class ScrapperRenderer extends MobRenderer<ScrapperEntity, ModelScrapper<ScrapperEntity>> {

	public ScrapperRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelScrapper(context.bakeLayer(ModelScrapper.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(ScrapperEntity entity) {
		return new ResourceLocation("horizon_zero_block:textures/entities/scrapper.png");
	}

}
