
package net.mcreator.horizonzeroblock.client.renderer;

public class SnapmawTamedRenderer extends MobRenderer<SnapmawTamedEntity, ModelSnapmaw<SnapmawTamedEntity>> {

	public SnapmawTamedRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSnapmaw(context.bakeLayer(ModelSnapmaw.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(SnapmawTamedEntity entity) {
		return new ResourceLocation("horizon_zero_block:textures/entities/snapmaw_tame.png");
	}

}
