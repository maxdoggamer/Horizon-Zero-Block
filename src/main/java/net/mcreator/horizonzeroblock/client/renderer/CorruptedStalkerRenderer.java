
package net.mcreator.horizonzeroblock.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.horizonzeroblock.entity.CorruptedStalkerEntity;
import net.mcreator.horizonzeroblock.client.model.ModelStalker;

public class CorruptedStalkerRenderer extends MobRenderer<CorruptedStalkerEntity, ModelStalker<CorruptedStalkerEntity>> {
	public CorruptedStalkerRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelStalker(context.bakeLayer(ModelStalker.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CorruptedStalkerEntity entity) {
		return new ResourceLocation("horizon_zero_block:textures/entities/stalkercorrupted.png");
	}
}
