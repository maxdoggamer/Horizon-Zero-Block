
package net.mcreator.horizonzeroblock.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.horizonzeroblock.entity.TallneckEntity;
import net.mcreator.horizonzeroblock.client.model.ModelTallneck;

public class TallneckRenderer extends MobRenderer<TallneckEntity, ModelTallneck<TallneckEntity>> {
	public TallneckRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelTallneck(context.bakeLayer(ModelTallneck.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TallneckEntity entity) {
		return new ResourceLocation("horizon_zero_block:textures/entities/tallneck.png");
	}
}
