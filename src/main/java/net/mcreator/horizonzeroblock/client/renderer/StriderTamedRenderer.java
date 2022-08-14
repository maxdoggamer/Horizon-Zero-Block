
package net.mcreator.horizonzeroblock.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.horizonzeroblock.entity.StriderTamedEntity;
import net.mcreator.horizonzeroblock.client.model.ModelStrider;

public class StriderTamedRenderer extends MobRenderer<StriderTamedEntity, ModelStrider<StriderTamedEntity>> {
	public StriderTamedRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelStrider(context.bakeLayer(ModelStrider.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StriderTamedEntity entity) {
		return new ResourceLocation("horizon_zero_block:textures/entities/strider_tame.png");
	}
}
