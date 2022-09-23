
package net.mcreator.horizonzeroblock.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.horizonzeroblock.entity.CorruptedScrapperEntity;
import net.mcreator.horizonzeroblock.client.model.ModelScrapper;

public class CorruptedScrapperRenderer extends MobRenderer<CorruptedScrapperEntity, ModelScrapper<CorruptedScrapperEntity>> {
	public CorruptedScrapperRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelScrapper(context.bakeLayer(ModelScrapper.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CorruptedScrapperEntity entity) {
		return new ResourceLocation("horizon_zero_block:textures/entities/scrappercorrupted.png");
	}
}
