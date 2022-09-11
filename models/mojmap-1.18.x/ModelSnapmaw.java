// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelSnapmaw<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "snapmaw"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart Tail;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;
	private final ModelPart LeftLegFront;
	private final ModelPart RightLegFront;

	public ModelSnapmaw(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.Tail = root.getChild("Tail");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.LeftLegFront = root.getChild("LeftLegFront");
		this.RightLegFront = root.getChild("RightLegFront");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(),
				PartPose.offset(0.0F, 15.0F, -16.0F));

		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(32, 37).addBox(-3.0F, -18.0F, -30.0F, 6.0F, 6.0F, 16.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 15.0F, 17.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(42, 44)
						.addBox(-2.5F, 31.0F, -18.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(11, 22)
						.addBox(-2.5F, 25.0F, -18.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(9, 37)
						.addBox(-2.5F, 35.0F, -18.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(41, 37)
						.addBox(-2.5F, 33.0F, -18.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 47)
						.addBox(-2.5F, 29.0F, -18.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 20.0F, 9.0F, -1.6144F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(22, 7)
						.addBox(-2.5F, 29.0F, -30.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(22, 11)
						.addBox(-2.5F, 31.0F, -30.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 20.0F, 9.0F, -1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(9, 48)
						.addBox(-2.5F, 15.0F, -25.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.5F, 15.0F, -23.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
						.addBox(-2.5F, 17.0F, -23.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(17, 2)
						.addBox(-2.5F, 19.0F, -23.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(15, 22)
						.addBox(-2.5F, 21.0F, -23.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 42)
						.addBox(-2.5F, 21.0F, -25.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 40)
						.addBox(-2.5F, 19.0F, -25.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 50)
						.addBox(-2.5F, 17.0F, -25.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 20.0F, 9.0F, -1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Head
				.addOrReplaceChild("cube_r5",
						CubeListBuilder.create().texOffs(0, 23).addBox(-2.5F, -32.0F, 0.0F, 1.0F, 1.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(2.0F, 20.0F, 9.0F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Head
				.addOrReplaceChild("cube_r6",
						CubeListBuilder.create().texOffs(4, 23).addBox(-2.5F, -28.0F, -17.0F, 1.0F, 1.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(2.0F, 20.0F, 9.0F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Head.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(26, 11).addBox(-2.5F, -3.0F, -33.0F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 20.0F, 9.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r8 = Head.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 16).addBox(-2.5F, -23.0F, -25.0F, 1.0F, 2.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 19.0F, 10.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Head.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(50, 0).addBox(-1.0F, -14.0F, -43.0F, 2.0F, 2.0F, 18.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 15.0F, 12.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-5.0F, -3.0F, -17.0F, 10.0F, 7.0F, 30.0F, new CubeDeformation(0.0F)).texOffs(0, 52)
						.addBox(0.0F, -7.0F, 6.0F, 0.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(50, 8)
						.addBox(0.0F, -7.0F, -1.0F, 0.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(50, 4)
						.addBox(0.0F, -7.0F, -8.0F, 0.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(32, 41)
						.addBox(0.0F, -7.0F, -15.0F, 0.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 15.0F, 0.0F));

		PartDefinition cube_r10 = Body.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -25.0F, -13.0F, 6.0F, 11.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 15.0F, -3.0F, -1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r11 = Body.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(0, 16).addBox(-5.0F, -25.0F, -17.0F, 2.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 23.0F, -11.0F, -0.4608F, 0.1393F, 0.2727F));

		PartDefinition cube_r12 = Body.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(22, 0).addBox(3.0F, -25.0F, -17.0F, 2.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 23.0F, -11.0F, -0.4608F, -0.1393F, -0.2727F));

		PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(),
				PartPose.offset(0.0F, 15.0F, 14.0F));

		PartDefinition cube_r13 = Tail.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(11, 14)
						.addBox(5.0F, -24.0F, 40.0F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 22)
						.addBox(5.0F, -24.0F, 33.0F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(10, 22)
						.addBox(5.0F, -24.0F, 26.0F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 37)
						.addBox(3.0F, -21.0F, 23.0F, 4.0F, 4.0F, 24.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 17.0F, -14.0F, -0.1309F, -0.3054F, 0.0F));

		PartDefinition cube_r14 = Tail.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(32, 45)
						.addBox(0.0F, -20.0F, 23.0F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(11, 7)
						.addBox(0.0F, -20.0F, 12.0F, 0.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(40, 59)
						.addBox(-2.0F, -17.0F, 12.0F, 4.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 16.0F, -14.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-5.0F, 14.0F, 8.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r15 = RightLeg.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(50, 20).addBox(2.015F, 8.6971F, -8.2889F, 2.0F, 7.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.0F, 0.0F, 0.6109F, 0.0F, 0.6109F));

		PartDefinition cube_r16 = RightLeg
				.addOrReplaceChild("cube_r16",
						CubeListBuilder.create().texOffs(12, 37).addBox(4.3623F, 2.4995F, -2.0F, 3.0F, 8.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.8727F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(),
				PartPose.offset(5.0F, 14.0F, 8.0F));

		PartDefinition cube_r17 = LeftLeg.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(20, 19).addBox(0.0F, 4.0F, -5.0F, 2.0F, 7.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, 0.0F, -0.6109F));

		PartDefinition cube_r18 = LeftLeg
				.addOrReplaceChild("cube_r18",
						CubeListBuilder.create().texOffs(0, 37).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 8.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.8727F));

		PartDefinition LeftLegFront = partdefinition.addOrReplaceChild("LeftLegFront", CubeListBuilder.create()
				.texOffs(60, 37).addBox(1.0F, 6.0F, -4.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 15.0F, -15.0F));

		PartDefinition cube_r19 = LeftLegFront
				.addOrReplaceChild("cube_r19",
						CubeListBuilder.create().texOffs(60, 20).addBox(1.0F, 7.0F, -4.0F, 1.0F, 2.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3491F, 0.0F));

		PartDefinition cube_r20 = LeftLegFront
				.addOrReplaceChild("cube_r20",
						CubeListBuilder.create().texOffs(60, 44).addBox(1.0F, 7.0F, -5.0F, 1.0F, 2.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r21 = LeftLegFront.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(0, 48).addBox(-1.0F, 2.0F, -4.0F, 3.0F, 6.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.483F, -0.05F, -0.121F));

		PartDefinition cube_r22 = LeftLegFront.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(50, 0).addBox(-1.0F, -2.0F, -1.0F, 3.0F, 6.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3897F, -0.05F, -0.121F));

		PartDefinition RightLegFront = partdefinition.addOrReplaceChild("RightLegFront", CubeListBuilder.create()
				.texOffs(0, 65).addBox(-2.0F, 6.0F, -3.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 15.0F, -15.0F));

		PartDefinition cube_r23 = RightLegFront
				.addOrReplaceChild("cube_r23",
						CubeListBuilder.create().texOffs(64, 59).addBox(-2.0F, 7.0F, -4.0F, 1.0F, 2.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.6981F, 0.0F));

		PartDefinition cube_r24 = RightLegFront
				.addOrReplaceChild("cube_r24",
						CubeListBuilder.create().texOffs(10, 65).addBox(-1.0F, 7.0F, -2.0F, 1.0F, 2.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.6109F, 0.0F));

		PartDefinition cube_r25 = RightLegFront.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(32, 37).addBox(-2.0F, 2.0F, -4.0F, 3.0F, 6.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4394F, 0.05F, 0.121F));

		PartDefinition cube_r26 = RightLegFront.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(12, 48).addBox(-2.0F, -2.0F, -1.0F, 3.0F, 6.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3897F, 0.05F, 0.121F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLegFront.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLegFront.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.RightLegFront.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftLegFront.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}