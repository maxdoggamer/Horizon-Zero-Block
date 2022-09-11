
package net.mcreator.horizonzeroblock.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.horizonzeroblock.entity.StriderCorruptedEntity;
import net.mcreator.horizonzeroblock.client.model.ModelStrider;

public class StriderCorruptedRenderer extends MobRenderer<StriderCorruptedEntity, ModelStrider<StriderCorruptedEntity>> {
	public StriderCorruptedRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelStrider(context.bakeLayer(ModelStrider.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StriderCorruptedEntity entity) {
		return new ResourceLocation("horizon_zero_block:textures/entities/stridercorrupted.png");
	}
}
