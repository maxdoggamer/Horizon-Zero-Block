
package net.mcreator.horizonzeroblock.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.horizonzeroblock.entity.TallneckTamedEntity;
import net.mcreator.horizonzeroblock.client.model.ModelTallneck;

public class TallneckTamedRenderer extends MobRenderer<TallneckTamedEntity, ModelTallneck<TallneckTamedEntity>> {
	public TallneckTamedRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelTallneck(context.bakeLayer(ModelTallneck.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TallneckTamedEntity entity) {
		return new ResourceLocation("horizon_zero_block:textures/entities/tallneck_tame.png");
	}
}
