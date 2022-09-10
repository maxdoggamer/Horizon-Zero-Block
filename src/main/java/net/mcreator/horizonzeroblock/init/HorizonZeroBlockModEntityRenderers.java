
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.horizonzeroblock.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.horizonzeroblock.client.renderer.WatcherRenderer;
import net.mcreator.horizonzeroblock.client.renderer.ThunderWarBowRenderer;
import net.mcreator.horizonzeroblock.client.renderer.TearBowRenderer;
import net.mcreator.horizonzeroblock.client.renderer.TallneckTamedRenderer;
import net.mcreator.horizonzeroblock.client.renderer.TallneckRenderer;
import net.mcreator.horizonzeroblock.client.renderer.StriderTamedRenderer;
import net.mcreator.horizonzeroblock.client.renderer.StriderRenderer;
import net.mcreator.horizonzeroblock.client.renderer.StalkerTamedRenderer;
import net.mcreator.horizonzeroblock.client.renderer.StalkerRenderer;
import net.mcreator.horizonzeroblock.client.renderer.SnapmawTamedRenderer;
import net.mcreator.horizonzeroblock.client.renderer.SnapmawRenderer;
import net.mcreator.horizonzeroblock.client.renderer.PrecisionBowRenderer;
import net.mcreator.horizonzeroblock.client.renderer.HunterBowRenderer;
import net.mcreator.horizonzeroblock.client.renderer.HardBowRenderer;
import net.mcreator.horizonzeroblock.client.renderer.GlinthawkTamedRenderer;
import net.mcreator.horizonzeroblock.client.renderer.GlinthawkRenderer;
import net.mcreator.horizonzeroblock.client.renderer.FrostWarBowRenderer;
import net.mcreator.horizonzeroblock.client.renderer.FireHunterBowRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HorizonZeroBlockModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(HorizonZeroBlockModEntities.FIRE_HUNTER_BOW.get(), FireHunterBowRenderer::new);
		event.registerEntityRenderer(HorizonZeroBlockModEntities.PRECISION_BOW.get(), PrecisionBowRenderer::new);
		event.registerEntityRenderer(HorizonZeroBlockModEntities.HARD_BOW.get(), HardBowRenderer::new);
		event.registerEntityRenderer(HorizonZeroBlockModEntities.FROST_WAR_BOW.get(), FrostWarBowRenderer::new);
		event.registerEntityRenderer(HorizonZeroBlockModEntities.THUNDER_WAR_BOW.get(), ThunderWarBowRenderer::new);
		event.registerEntityRenderer(HorizonZeroBlockModEntities.HUNTER_BOW.get(), HunterBowRenderer::new);
		event.registerEntityRenderer(HorizonZeroBlockModEntities.TEAR_BOW.get(), TearBowRenderer::new);
		event.registerEntityRenderer(HorizonZeroBlockModEntities.WATCHER.get(), WatcherRenderer::new);
		event.registerEntityRenderer(HorizonZeroBlockModEntities.STRIDER.get(), StriderRenderer::new);
		event.registerEntityRenderer(HorizonZeroBlockModEntities.STRIDER_TAMED.get(), StriderTamedRenderer::new);
		event.registerEntityRenderer(HorizonZeroBlockModEntities.STALKER.get(), StalkerRenderer::new);
		event.registerEntityRenderer(HorizonZeroBlockModEntities.STALKER_TAMED.get(), StalkerTamedRenderer::new);
		event.registerEntityRenderer(HorizonZeroBlockModEntities.SNAPMAW.get(), SnapmawRenderer::new);
		event.registerEntityRenderer(HorizonZeroBlockModEntities.SNAPMAW_TAMED.get(), SnapmawTamedRenderer::new);
		event.registerEntityRenderer(HorizonZeroBlockModEntities.TALLNECK.get(), TallneckRenderer::new);
		event.registerEntityRenderer(HorizonZeroBlockModEntities.TALLNECK_TAMED.get(), TallneckTamedRenderer::new);
		event.registerEntityRenderer(HorizonZeroBlockModEntities.GLINTHAWK.get(), GlinthawkRenderer::new);
		event.registerEntityRenderer(HorizonZeroBlockModEntities.GLINTHAWK_TAMED.get(), GlinthawkTamedRenderer::new);
	}
}
