
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.horizonzeroblock.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.horizonzeroblock.client.model.ModelWatcher;
import net.mcreator.horizonzeroblock.client.model.ModelStrider;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class HorizonZeroBlockModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelWatcher.LAYER_LOCATION, ModelWatcher::createBodyLayer);
		event.registerLayerDefinition(ModelStrider.LAYER_LOCATION, ModelStrider::createBodyLayer);
	}
}
