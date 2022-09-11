
package net.mcreator.horizonzeroblock.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.horizonzeroblock.entity.GlinthawkTamedEntity;
import net.mcreator.horizonzeroblock.client.model.ModelGlinthawk;

public class GlinthawkTamedRenderer extends MobRenderer<GlinthawkTamedEntity, ModelGlinthawk<GlinthawkTamedEntity>> {
	public GlinthawkTamedRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelGlinthawk(context.bakeLayer(ModelGlinthawk.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GlinthawkTamedEntity entity) {
		return new ResourceLocation("horizon_zero_block:textures/entities/glinthawktame.png");
	}
}
