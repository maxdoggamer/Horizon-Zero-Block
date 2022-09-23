
package net.mcreator.horizonzeroblock.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.horizonzeroblock.entity.ScrapperTamedEntity;
import net.mcreator.horizonzeroblock.client.model.ModelScrapper;

public class ScrapperTamedRenderer extends MobRenderer<ScrapperTamedEntity, ModelScrapper<ScrapperTamedEntity>> {
	public ScrapperTamedRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelScrapper(context.bakeLayer(ModelScrapper.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ScrapperTamedEntity entity) {
		return new ResourceLocation("horizon_zero_block:textures/entities/scrappertame.png");
	}
}
