
package net.mcreator.horizonzeroblock.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.horizonzeroblock.entity.SnapmawCorruptedEntity;
import net.mcreator.horizonzeroblock.client.model.ModelSnapmaw;

public class SnapmawCorruptedRenderer extends MobRenderer<SnapmawCorruptedEntity, ModelSnapmaw<SnapmawCorruptedEntity>> {
	public SnapmawCorruptedRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSnapmaw(context.bakeLayer(ModelSnapmaw.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SnapmawCorruptedEntity entity) {
		return new ResourceLocation("horizon_zero_block:textures/entities/snapmawcorrupted.png");
	}
}
