
package net.mcreator.horizonzeroblock.client.renderer;

public class StalkerRenderer extends MobRenderer<StalkerEntity, ModelStalker<StalkerEntity>> {

	public StalkerRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelStalker(context.bakeLayer(ModelStalker.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(StalkerEntity entity) {
		return new ResourceLocation("horizon_zero_block:textures/entities/stalker.png");
	}

}
