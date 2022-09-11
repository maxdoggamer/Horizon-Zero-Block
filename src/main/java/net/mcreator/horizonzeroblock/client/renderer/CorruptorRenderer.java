
package net.mcreator.horizonzeroblock.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.horizonzeroblock.entity.CorruptorEntity;
import net.mcreator.horizonzeroblock.client.model.ModelCorruptor;

public class CorruptorRenderer extends MobRenderer<CorruptorEntity, ModelCorruptor<CorruptorEntity>> {
	public CorruptorRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCorruptor(context.bakeLayer(ModelCorruptor.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CorruptorEntity entity) {
		return new ResourceLocation("horizon_zero_block:textures/entities/corruptor.png");
	}
}
