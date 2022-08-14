
package net.mcreator.horizonzeroblock.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.horizonzeroblock.entity.StriderEntity;
import net.mcreator.horizonzeroblock.client.model.ModelStrider;

public class StriderRenderer extends MobRenderer<StriderEntity, ModelStrider<StriderEntity>> {
	public StriderRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelStrider(context.bakeLayer(ModelStrider.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StriderEntity entity) {
		return new ResourceLocation("horizon_zero_block:textures/entities/strider.png");
	}
}
