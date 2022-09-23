
package net.mcreator.horizonzeroblock.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.horizonzeroblock.entity.ScrapperEntity;
import net.mcreator.horizonzeroblock.client.model.ModelScrapper;

public class ScrapperRenderer extends MobRenderer<ScrapperEntity, ModelScrapper<ScrapperEntity>> {
	public ScrapperRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelScrapper(context.bakeLayer(ModelScrapper.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ScrapperEntity entity) {
		return new ResourceLocation("horizon_zero_block:textures/entities/scrapper.png");
	}
}
