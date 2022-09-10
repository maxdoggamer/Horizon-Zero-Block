
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.horizonzeroblock.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.horizonzeroblock.client.model.Modelcustom_model;
import net.mcreator.horizonzeroblock.client.model.ModelWatcher;
import net.mcreator.horizonzeroblock.client.model.ModelTallneck;
import net.mcreator.horizonzeroblock.client.model.ModelStrider;
import net.mcreator.horizonzeroblock.client.model.ModelStalker;
import net.mcreator.horizonzeroblock.client.model.ModelSnapmaw;
import net.mcreator.horizonzeroblock.client.model.ModelGlinthawk;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class HorizonZeroBlockModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelWatcher.LAYER_LOCATION, ModelWatcher::createBodyLayer);
		event.registerLayerDefinition(ModelStalker.LAYER_LOCATION, ModelStalker::createBodyLayer);
		event.registerLayerDefinition(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
		event.registerLayerDefinition(ModelGlinthawk.LAYER_LOCATION, ModelGlinthawk::createBodyLayer);
		event.registerLayerDefinition(ModelTallneck.LAYER_LOCATION, ModelTallneck::createBodyLayer);
		event.registerLayerDefinition(ModelSnapmaw.LAYER_LOCATION, ModelSnapmaw::createBodyLayer);
		event.registerLayerDefinition(ModelStrider.LAYER_LOCATION, ModelStrider::createBodyLayer);
	}
}
