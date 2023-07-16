
package net.mcreator.horizonzeroblock.client.renderer;

public class CorruptedStalkerRenderer extends MobRenderer<CorruptedStalkerEntity, ModelStalker<CorruptedStalkerEntity>> {

	public CorruptedStalkerRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelStalker(context.bakeLayer(ModelStalker.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(CorruptedStalkerEntity entity) {
		return new ResourceLocation("horizon_zero_block:textures/entities/stalkercorrupted.png");
	}

}
