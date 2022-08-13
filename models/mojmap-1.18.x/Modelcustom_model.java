// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcustom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart Head;
	private final ModelPart Neck;
	private final ModelPart Body;
	private final ModelPart Left_Leg;
	private final ModelPart Right_Leg;
	private final ModelPart Tail;

	public Modelcustom_model(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Neck = root.getChild("Neck");
		this.Body = root.getChild("Body");
		this.Left_Leg = root.getChild("Left_Leg");
		this.Right_Leg = root.getChild("Right_Leg");
		this.Tail = root.getChild("Tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 52)
						.addBox(-3.0F, -5.0F, -10.0F, 6.0F, 6.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(45, 0)
						.addBox(-4.0F, -6.0F, -8.0F, 8.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(29, 27)
						.addBox(1.0F, 1.0F, -6.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 0)
						.addBox(-2.0F, 1.0F, -6.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -8.0F, 0.0F, 2.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -13.0F, -22.0F));

		PartDefinition Neck = partdefinition.addOrReplaceChild("Neck",
				CubeListBuilder.create().texOffs(30, 32).addBox(-2.0F, -2.0F, -19.0F, 4.0F, 4.0F, 20.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, -11.0F, -0.9163F, 0.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(34, 56).addBox(
				-4.0F, -9.0F, -2.0F, 8.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.0F, 0.0F));

		PartDefinition cube_r1 = Body
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -5.0F, -13.0F, 12.0F, 6.0F, 21.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Left_Leg = partdefinition.addOrReplaceChild("Left_Leg", CubeListBuilder.create(),
				PartPose.offset(-6.0F, 9.0F, -1.0F));

		PartDefinition cube_r2 = Left_Leg.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 9).addBox(-1.0F, 0.1648F, -1.1991F, 2.0F, 9.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -1.0F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Left_Leg.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(8, 27).addBox(-1.0F, 0.211F, -0.6025F, 2.0F, 9.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 6.0F, 3.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Right_Leg = partdefinition.addOrReplaceChild("Right_Leg", CubeListBuilder.create(),
				PartPose.offset(6.0F, 9.0F, -1.0F));

		PartDefinition cube_r4 = Right_Leg
				.addOrReplaceChild("cube_r4",
						CubeListBuilder.create().texOffs(8, 9).addBox(-1.0F, 0.1648F, -1.1991F, 2.0F, 9.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(1.0F, -1.0F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Right_Leg
				.addOrReplaceChild("cube_r5",
						CubeListBuilder.create().texOffs(0, 27).addBox(-1.0F, -0.755F, -0.8613F, 2.0F, 9.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(1.0F, 7.0F, 3.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r6 = Tail.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 27).addBox(-2.0F, -1.0F, 0.0F, 4.0F, 4.0F, 21.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -17.0F, 8.0F, -0.3927F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Neck.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Left_Leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Right_Leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}