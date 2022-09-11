
package net.mcreator.horizonzeroblock.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.horizonzeroblock.entity.GlinthawkEntity;

public class GlinthawkRenderer extends HumanoidMobRenderer<GlinthawkEntity, HumanoidModel<GlinthawkEntity>> {
	public GlinthawkRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	public ResourceLocation getTextureLocation(GlinthawkEntity entity) {
		return new ResourceLocation("horizon_zero_block:textures/entities/glinthawk.png");
	}
}
