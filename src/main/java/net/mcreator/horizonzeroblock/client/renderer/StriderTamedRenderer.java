
package net.mcreator.horizonzeroblock.client.renderer;

public class StriderTamedRenderer extends MobRenderer<StriderTamedEntity, ModelStrider<StriderTamedEntity>> {

	public StriderTamedRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelStrider(context.bakeLayer(ModelStrider.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(StriderTamedEntity entity) {
		return new ResourceLocation("horizon_zero_block:textures/entities/strider_tame.png");
	}

}
