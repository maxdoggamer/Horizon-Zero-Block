
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.horizonzeroblock.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.horizonzeroblock.network.AmmoMakingBagOpenMessage;
import net.mcreator.horizonzeroblock.network.AmmoCraftingMessage;
import net.mcreator.horizonzeroblock.HorizonZeroBlockMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class HorizonZeroBlockModKeyMappings {
	public static final KeyMapping AMMO_CRAFTING = new KeyMapping("key.horizon_zero_block.ammo_crafting", GLFW.GLFW_KEY_R, "key.categories.misc");
	public static final KeyMapping AMMO_MAKING_BAG_OPEN = new KeyMapping("key.horizon_zero_block.ammo_making_bag_open", GLFW.GLFW_KEY_B,
			"key.categories.misc");

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(AMMO_CRAFTING);
		ClientRegistry.registerKeyBinding(AMMO_MAKING_BAG_OPEN);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onKeyInput(InputEvent.KeyInputEvent event) {
			if (Minecraft.getInstance().screen == null) {
				if (event.getKey() == AMMO_CRAFTING.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						HorizonZeroBlockMod.PACKET_HANDLER.sendToServer(new AmmoCraftingMessage(0, 0));
						AmmoCraftingMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
				if (event.getKey() == AMMO_MAKING_BAG_OPEN.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						HorizonZeroBlockMod.PACKET_HANDLER.sendToServer(new AmmoMakingBagOpenMessage(0, 0));
						AmmoMakingBagOpenMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
			}
		}
	}
}
