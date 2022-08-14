// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelStrider<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "strider"), "main");
	private final ModelPart LeftLeg2;
	private final ModelPart RightLeg2;
	private final ModelPart LeftLeg;
	private final ModelPart RightLeg;
	private final ModelPart Body;
	private final ModelPart Neck;
	private final ModelPart Head;
	private final ModelPart bb_main;

	public ModelStrider(ModelPart root) {
		this.LeftLeg2 = root.getChild("LeftLeg2");
		this.RightLeg2 = root.getChild("RightLeg2");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
		this.Body = root.getChild("Body");
		this.Neck = root.getChild("Neck");
		this.Head = root.getChild("Head");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition LeftLeg2 = partdefinition.addOrReplaceChild("LeftLeg2", CubeListBuilder.create().texOffs(60, 51)
				.addBox(0.0F, 5.964F, -20.3499F, 2.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, 10.0F, 9.0F));

		PartDefinition cube_r1 = LeftLeg2.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(22, 51).addBox(-1.0F, 0.0F, -2.0F, 3.0F, 8.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, -18.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition RightLeg2 = partdefinition.addOrReplaceChild("RightLeg2", CubeListBuilder.create()
				.texOffs(14, 60).addBox(-10.0F, 5.964F, -20.3499F, 2.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, 10.0F, 9.0F));

		PartDefinition cube_r2 = RightLeg2.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 52).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 8.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -2.0F, -18.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(),
				PartPose.offset(4.0F, 10.0F, 9.0F));

		PartDefinition cube_r3 = LeftLeg
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(58, 39).addBox(0.0F, -0.9772F, -1.4771F, 2.0F, 9.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r4 = LeftLeg
				.addOrReplaceChild("cube_r4",
						CubeListBuilder.create().texOffs(56, 0).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 8.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(),
				PartPose.offset(4.0F, 10.0F, 9.0F));

		PartDefinition cube_r5 = RightLeg.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(36, 51).addBox(-2.0F, -0.9772F, -1.4771F, 2.0F, 9.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, 6.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r6 = RightLeg
				.addOrReplaceChild("cube_r6",
						CubeListBuilder.create().texOffs(52, 14).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 8.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-8.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(),
				PartPose.offset(4.0F, 10.0F, 9.0F));

		PartDefinition cube_r7 = Body
				.addOrReplaceChild("cube_r7",
						CubeListBuilder.create().texOffs(26, 39).addBox(-6.0F, -11.0F, -3.0F, 4.0F, 4.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(59, 62).addBox(-2.0F, 0.0F, 0.0F, 3.0F, 11.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -7.0F, 2.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Body.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(24, 63).addBox(-1.0F, 0.0F, 0.0F, 3.0F, 11.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -7.0F, 2.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r10 = Body
				.addOrReplaceChild("cube_r10",
						CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, -21.0F, -3.0F, 10.0F, 23.0F, 10.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition Neck = partdefinition.addOrReplaceChild("Neck", CubeListBuilder.create(),
				PartPose.offset(-2.0F, 3.0F, 18.0F));

		PartDefinition cube_r11 = Neck.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(25, 18).addBox(-2.0F, -4.0F, -12.0F, 6.0F, 6.0F, 15.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 4.0F, -30.0F, -0.7418F, 0.0F, 0.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 25.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r12 = Head.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(48, 49)
						.addBox(-2.0F, 0.0F, 1.0F, 4.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 39)
						.addBox(-2.0F, 8.0F, -3.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 0)
						.addBox(-3.0F, -4.0F, -6.0F, 6.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 33)
						.addBox(-3.0F, -4.0F, -4.0F, 6.0F, 12.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -21.0F, -23.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(92, 0)
				.addBox(-4.0F, -22.0F, -9.0F, 8.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		LeftLeg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Neck.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.RightLeg2.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftLeg2.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}