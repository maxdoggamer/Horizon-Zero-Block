
package net.mcreator.horizonzeroblock.client.renderer;

public class CorruptedScrapperRenderer extends MobRenderer<CorruptedScrapperEntity, ModelScrapper<CorruptedScrapperEntity>> {

	public CorruptedScrapperRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelScrapper(context.bakeLayer(ModelScrapper.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(CorruptedScrapperEntity entity) {
		return new ResourceLocation("horizon_zero_block:textures/entities/scrappercorrupted.png");
	}

}
