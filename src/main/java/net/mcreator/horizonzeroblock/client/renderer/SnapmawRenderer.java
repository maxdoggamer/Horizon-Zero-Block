
package net.mcreator.horizonzeroblock.client.renderer;

public class SnapmawRenderer extends MobRenderer<SnapmawEntity, ModelSnapmaw<SnapmawEntity>> {

	public SnapmawRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSnapmaw(context.bakeLayer(ModelSnapmaw.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(SnapmawEntity entity) {
		return new ResourceLocation("horizon_zero_block:textures/entities/snapmaw.png");
	}

}
