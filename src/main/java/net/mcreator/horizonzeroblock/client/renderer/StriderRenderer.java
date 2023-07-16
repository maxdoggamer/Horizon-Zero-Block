
package net.mcreator.horizonzeroblock.client.renderer;

public class StriderRenderer extends MobRenderer<StriderEntity, ModelStrider<StriderEntity>> {

	public StriderRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelStrider(context.bakeLayer(ModelStrider.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(StriderEntity entity) {
		return new ResourceLocation("horizon_zero_block:textures/entities/strider.png");
	}

}
