
package net.mcreator.horizonzeroblock.client.renderer;

public class StalkerTamedRenderer extends MobRenderer<StalkerTamedEntity, ModelStalker<StalkerTamedEntity>> {

	public StalkerTamedRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelStalker(context.bakeLayer(ModelStalker.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(StalkerTamedEntity entity) {
		return new ResourceLocation("horizon_zero_block:textures/entities/stalker_tame.png");
	}

}
