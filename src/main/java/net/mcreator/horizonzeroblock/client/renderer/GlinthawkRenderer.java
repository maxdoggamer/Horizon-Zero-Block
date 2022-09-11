
package net.mcreator.horizonzeroblock.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.horizonzeroblock.entity.GlinthawkEntity;
import net.mcreator.horizonzeroblock.client.model.ModelGlinthawk;

public class GlinthawkRenderer extends MobRenderer<GlinthawkEntity, ModelGlinthawk<GlinthawkEntity>> {
	public GlinthawkRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelGlinthawk(context.bakeLayer(ModelGlinthawk.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GlinthawkEntity entity) {
		return new ResourceLocation("horizon_zero_block:textures/entities/glinthawk.png");
	}
}
