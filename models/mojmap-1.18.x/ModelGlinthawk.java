// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelGlinthawk<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "glinthawk"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart LeftWing;
	private final ModelPart RightWing;
	private final ModelPart Tail;
	private final ModelPart LeftLeg;
	private final ModelPart RightLeg;

	public ModelGlinthawk(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.LeftWing = root.getChild("LeftWing");
		this.RightWing = root.getChild("RightWing");
		this.Tail = root.getChild("Tail");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(32, 34)
						.addBox(-2.0F, -3.0F, -8.0F, 4.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(20, 56)
						.addBox(-1.0F, -1.0F, -9.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 9.0F, -2.0F));

		PartDefinition cube_r1 = Head
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(82, 0).addBox(-0.5F, -20.0F, 2.0F, 1.0F, 2.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 15.0F, 2.0F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(82, 0)
						.addBox(-0.5F, -14.0F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(82, 0)
						.addBox(-0.5F, -14.0F, -8.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(82, 0)
						.addBox(-0.5F, -14.0F, -12.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(82, 0)
						.addBox(-0.5F, -16.0F, -11.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 0)
						.addBox(-0.5F, -14.0F, -6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 0)
						.addBox(-0.5F, -14.0F, -10.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 0)
						.addBox(-0.5F, -16.0F, -13.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 0)
						.addBox(-0.5F, -16.0F, -9.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 42)
						.addBox(-1.0F, -15.0F, -13.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 15.0F, 2.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Head
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(74, 0).addBox(-0.5F, -1.0F, 18.0F, 1.0F, 2.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 15.0F, 2.0F, 2.5307F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(51, 48).addBox(2.0F, -16.0F, -9.0F, 1.0F, 2.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 15.0F, 2.0F, 0.2182F, -0.0873F, 0.0F));

		PartDefinition cube_r5 = Head.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 54).addBox(-3.0F, -16.0F, -9.0F, 1.0F, 2.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 15.0F, 2.0F, 0.2182F, 0.0873F, 0.0F));

		PartDefinition cube_r6 = Head
				.addOrReplaceChild("cube_r6",
						CubeListBuilder.create().texOffs(14, 44).addBox(-1.0F, -19.0F, -14.0F, 2.0F, 2.0F, 10.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 15.0F, 2.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(48, 31)
						.addBox(-2.0F, 0.0F, -7.0F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(38, 47)
						.addBox(-2.0F, -3.0F, -7.0F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 11.0F, 4.0F));

		PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(29, 11)
						.addBox(-3.0F, -3.0F, 16.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(41, 11)
						.addBox(1.0F, -3.0F, 16.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.0F, -4.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -16.0F, -8.0F, 6.0F, 5.0F, 17.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.0F, -4.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition LeftWing = partdefinition.addOrReplaceChild("LeftWing", CubeListBuilder.create(),
				PartPose.offset(3.0F, 10.0F, 6.0F));

		PartDefinition cube_r9 = LeftWing.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(0, 33).addBox(5.0F, -14.0F, -2.0F, 12.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 14.0F, -6.0F, -0.3054F, 0.0F, -0.3927F));

		PartDefinition cube_r10 = LeftWing.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(29, 0).addBox(8.0F, -19.75F, -4.0F, 12.0F, 1.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 14.0F, -6.0F, -0.3054F, 0.0F, 0.0873F));

		PartDefinition RightWing = partdefinition.addOrReplaceChild("RightWing", CubeListBuilder.create(),
				PartPose.offset(-3.0F, 10.0F, 6.0F));

		PartDefinition cube_r11 = RightWing.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(0, 22).addBox(-21.0F, -20.0F, -4.0F, 12.0F, 1.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 14.0F, -6.0F, -0.3054F, 0.0F, -0.0873F));

		PartDefinition cube_r12 = RightWing.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(34, 22).addBox(-18.0F, -14.0F, -2.0F, 12.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 14.0F, -6.0F, -0.3054F, 0.0F, 0.3927F));

		PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(),
				PartPose.offset(-0.5F, 13.0F, 13.0F));

		PartDefinition cube_r13 = Tail.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(6, 9)
						.addBox(-1.0F, -14.0F, 17.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(46, 11)
						.addBox(-2.0F, -14.0F, 8.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(53, 41)
						.addBox(-5.0F, -14.0F, 13.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(38, 57)
						.addBox(1.0F, -14.0F, 13.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 11.0F, -13.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(10, 4)
						.addBox(0.5F, 12.0F, -3.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 14)
						.addBox(0.5F, 13.0F, -5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 13)
						.addBox(0.0F, 12.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, 10.0F, 8.0F));

		PartDefinition cube_r14 = LeftLeg.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(0, 22).addBox(6.0F, -11.0F, 11.0F, 2.0F, 6.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, 14.0F, -8.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r15 = LeftLeg.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(56, 59).addBox(6.0F, -13.0F, 5.0F, 2.0F, 10.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, 14.0F, -8.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r16 = LeftLeg.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(10, 0)
						.addBox(-11.0F, -2.0F, 2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(37, 11)
						.addBox(-11.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, 14.0F, -8.0F, 0.0F, 0.3491F, 0.0F));

		PartDefinition cube_r17 = LeftLeg.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(32, 37)
						.addBox(-5.0F, -1.0F, 6.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 33)
						.addBox(-5.0F, -2.0F, 8.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, 14.0F, -8.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(34, 26)
						.addBox(-1.5F, 12.0F, -3.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 42)
						.addBox(-1.5F, 13.0F, -5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 33)
						.addBox(-2.0F, 12.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 10.0F, 8.0F));

		PartDefinition cube_r18 = RightLeg.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(29, 0).addBox(-9.0F, -11.0F, 11.0F, 2.0F, 6.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, 14.0F, -8.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r19 = RightLeg.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, -13.0F, 5.0F, 2.0F, 10.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, 14.0F, -8.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r20 = RightLeg.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(0, 37)
						.addBox(-11.0F, -2.0F, 2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 31)
						.addBox(-11.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, 14.0F, -8.0F, 0.0F, 0.3491F, 0.0F));

		PartDefinition cube_r21 = RightLeg.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(0, 42)
						.addBox(-5.0F, -1.0F, 6.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(34, 22)
						.addBox(-5.0F, -2.0F, 8.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, 14.0F, -8.0F, 0.0F, -0.3491F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftWing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightWing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftWing.yRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightWing.yRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}