
package net.mcreator.horizonzeroblock.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.horizonzeroblock.entity.CorruptedWatcherEntity;
import net.mcreator.horizonzeroblock.client.model.ModelWatcher;

public class CorruptedWatcherRenderer extends MobRenderer<CorruptedWatcherEntity, ModelWatcher<CorruptedWatcherEntity>> {
	public CorruptedWatcherRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelWatcher(context.bakeLayer(ModelWatcher.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CorruptedWatcherEntity entity) {
		return new ResourceLocation("horizon_zero_block:textures/entities/watchercorrupted.png");
	}
}
