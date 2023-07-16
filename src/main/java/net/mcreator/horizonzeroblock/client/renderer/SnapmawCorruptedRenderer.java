
package net.mcreator.horizonzeroblock.client.renderer;

public class SnapmawCorruptedRenderer extends MobRenderer<SnapmawCorruptedEntity, ModelSnapmaw<SnapmawCorruptedEntity>> {

	public SnapmawCorruptedRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSnapmaw(context.bakeLayer(ModelSnapmaw.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(SnapmawCorruptedEntity entity) {
		return new ResourceLocation("horizon_zero_block:textures/entities/snapmawcorrupted.png");
	}

}
