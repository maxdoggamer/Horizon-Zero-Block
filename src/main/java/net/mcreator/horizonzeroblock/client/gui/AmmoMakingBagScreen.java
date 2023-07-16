package net.mcreator.horizonzeroblock.client.gui;

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
		this.imageWidth = 250;
		this.imageHeight = 250;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
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

		RenderSystem.setShaderTexture(0, new ResourceLocation("horizon_zero_block:textures/screens/selectwheel.png"));
		this.blit(ms, this.leftPos + 52, this.topPos + 31, 0, 0, 128, 128, 128, 128);

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
		this.font.draw(poseStack, Component.translatable("gui.horizon_zero_block.ammo_making_bag.label_ridgewood"), 43, 22, -10079488);
		this.font.draw(poseStack, Component.translatable("gui.horizon_zero_block.ammo_making_bag.label_metalshards"), 142, 22, -16777216);
		this.font.draw(poseStack, Component.translatable("gui.horizon_zero_block.ammo_making_bag.label_blaze"), 178, 58, -256);
		this.font.draw(poseStack, Component.translatable("gui.horizon_zero_block.ammo_making_bag.label_wire"), 187, 103, -13421773);
		this.font.draw(poseStack, Component.translatable("gui.horizon_zero_block.ammo_making_bag.label_chillwater"), 151, 148, -16711681);
		this.font.draw(poseStack, Component.translatable("gui.horizon_zero_block.ammo_making_bag.label_sparker"), 43, 148, -16777012);
		this.font.draw(poseStack, Component.translatable("gui.horizon_zero_block.ammo_making_bag.label_metalburn"), 7, 112, -65536);
		this.font.draw(poseStack, Component.translatable("gui.horizon_zero_block.ammo_making_bag.label_echoshell"), 7, 49, -39424);
		this.font.draw(poseStack, Component.translatable("gui.horizon_zero_block.ammo_making_bag.label_varn1"), 43, 31, -10079488);
		this.font.draw(poseStack, Component.translatable("gui.horizon_zero_block.ammo_making_bag.label_varn2"), 142, 31, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.horizon_zero_block.ammo_making_bag.label_varn3"), 178, 67, -256);
		this.font.draw(poseStack, Component.translatable("gui.horizon_zero_block.ammo_making_bag.label_varn4"), 187, 112, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.horizon_zero_block.ammo_making_bag.label_varn5"), 151, 157, -16711681);
		this.font.draw(poseStack, Component.translatable("gui.horizon_zero_block.ammo_making_bag.label_varn6"), 43, 157, -16776961);
		this.font.draw(poseStack, Component.translatable("gui.horizon_zero_block.ammo_making_bag.label_varn7"), 7, 121, -65536);
		this.font.draw(poseStack, Component.translatable("gui.horizon_zero_block.ammo_making_bag.label_varn8"), 16, 58, -26368);
		this.font.draw(poseStack, Component.translatable("gui.horizon_zero_block.ammo_making_bag.label_resource_bag"), 86, 5, -12829636);
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
