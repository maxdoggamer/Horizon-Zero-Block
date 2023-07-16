
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.horizonzeroblock.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.horizonzeroblock.network.AmmoMakingBagOpenMessage;
import net.mcreator.horizonzeroblock.network.AmmoCraftingMessage;
import net.mcreator.horizonzeroblock.HorizonZeroBlockMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class HorizonZeroBlockModKeyMappings {
	public static final KeyMapping AMMO_CRAFTING = new KeyMapping("key.horizon_zero_block.ammo_crafting", GLFW.GLFW_KEY_R, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				HorizonZeroBlockMod.PACKET_HANDLER.sendToServer(new AmmoCraftingMessage(0, 0));
				AmmoCraftingMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping AMMO_MAKING_BAG_OPEN = new KeyMapping("key.horizon_zero_block.ammo_making_bag_open", GLFW.GLFW_KEY_B, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				HorizonZeroBlockMod.PACKET_HANDLER.sendToServer(new AmmoMakingBagOpenMessage(0, 0));
				AmmoMakingBagOpenMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(AMMO_CRAFTING);
		event.register(AMMO_MAKING_BAG_OPEN);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				AMMO_CRAFTING.consumeClick();
				AMMO_MAKING_BAG_OPEN.consumeClick();
			}
		}
	}
}
