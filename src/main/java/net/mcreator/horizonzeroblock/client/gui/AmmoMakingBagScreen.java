
package net.mcreator.horizonzeroblock.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.horizonzeroblock.world.inventory.AmmoMakingBagMenu;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class AmmoMakingBagScreen extends AbstractContainerScreen<AmmoMakingBagMenu> {
	private final static HashMap<String, Object> guistate = AmmoMakingBagMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public AmmoMakingBagScreen(AmmoMakingBagMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("horizon_zero_block:textures/screens/ammo_making_bag.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Ridge-Wood", 24, 7, -10079488);
		this.font.draw(poseStack, "Metal-Shards", 24, 25, -16777216);
		this.font.draw(poseStack, "Blaze", 24, 43, -256);
		this.font.draw(poseStack, "Wire", 24, 61, -13421773);
		this.font.draw(poseStack, "Chillwater", 114, 7, -16711681);
		this.font.draw(poseStack, "Sparker", 114, 25, -16777012);
		this.font.draw(poseStack, "MetalBurn", 114, 43, -65536);
		this.font.draw(poseStack, "Echo-Shell", 114, 61, -39424);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
	}
}
