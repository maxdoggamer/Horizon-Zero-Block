
package net.mcreator.horizonzeroblock.client.renderer;

public class ScrapperTamedRenderer extends MobRenderer<ScrapperTamedEntity, ModelScrapper<ScrapperTamedEntity>> {

	public ScrapperTamedRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelScrapper(context.bakeLayer(ModelScrapper.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(ScrapperTamedEntity entity) {
		return new ResourceLocation("horizon_zero_block:textures/entities/scrappertame.png");
	}

}
