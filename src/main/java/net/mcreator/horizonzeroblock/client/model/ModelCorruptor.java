package net.mcreator.horizonzeroblock.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelCorruptor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("horizon_zero_block", "model_corruptor"),
			"main");
	public final ModelPart Body;
	public final ModelPart Sting;
	public final ModelPart LeftLegFront;
	public final ModelPart RightLegFront;
	public final ModelPart LeftLegBack;
	public final ModelPart RightLegBack;

	public ModelCorruptor(ModelPart root) {
		this.Body = root.getChild("Body");
		this.Sting = root.getChild("Sting");
		this.LeftLegFront = root.getChild("LeftLegFront");
		this.RightLegFront = root.getChild("RightLegFront");
		this.LeftLegBack = root.getChild("LeftLegBack");
		this.RightLegBack = root.getChild("RightLegBack");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(82, 0).addBox(-9.0F, -7.0F, -8.0F, 18.0F, 17.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(32, 91).addBox(-3.0F, -14.0F, -24.0F, 6.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 115)
						.addBox(-5.0F, -16.0F, -20.0F, 10.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 50).addBox(-10.0F, -19.0F, -16.0F,
								20.0F, 8.0F, 33.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.3054F, 0.0F, 0.0F));
		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(108, 99).addBox(2.0F, -32.0F, 2.0F, 10.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(82, 0)
						.addBox(5.0F, -32.0F, 5.0F, 4.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(40, 115).addBox(-12.0F, -32.0F, 2.0F, 10.0F, 8.0F, 10.0F, new CubeDeformation(0.0F))
						.texOffs(136, 134).addBox(-9.0F, -32.0F, 5.0F, 4.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 0).addBox(-11.0F, -14.0F, -14.0F, 22.0F, 12.0F, 38.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.48F, 0.0F, 0.0F));
		PartDefinition Sting = partdefinition.addOrReplaceChild("Sting", CubeListBuilder.create(), PartPose.offset(0.0F, -14.0F, 17.0F));
		PartDefinition cube_r5 = Sting.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(78, 99).addBox(-3.0F, 41.0F, -55.0F, 6.0F, 3.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 18.0F, -17.0F, -2.4435F, 0.0F, 0.0F));
		PartDefinition cube_r6 = Sting.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(112, 117).addBox(-3.0F, 55.0F, -45.0F, 6.0F, 3.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 18.0F, -17.0F, -2.7053F, 0.0F, 0.0F));
		PartDefinition cube_r7 = Sting.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(73, 50).addBox(-4.0F, 62.0F, 0.0F, 8.0F, 8.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 18.0F, -17.0F, 2.7053F, 0.0F, 0.0F));
		PartDefinition cube_r8 = Sting.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(90, 75).addBox(-4.0F, 55.0F, 16.0F, 8.0F, 8.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 18.0F, -17.0F, 2.2253F, 0.0F, 0.0F));
		PartDefinition cube_r9 = Sting.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(0, 91).addBox(-4.0F, 34.0F, 33.0F, 8.0F, 8.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 18.0F, -17.0F, 1.6144F, 0.0F, 0.0F));
		PartDefinition cube_r10 = Sting.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(48, 91).addBox(-4.0F, 5.0F, 35.0F, 8.0F, 8.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 18.0F, -17.0F, 0.9599F, 0.0F, 0.0F));
		PartDefinition cube_r11 = Sting.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(107, 37).addBox(-4.0F, -12.0F, 24.0F, 8.0F, 8.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 18.0F, -17.0F, 0.48F, 0.0F, 0.0F));
		PartDefinition LeftLegFront = partdefinition.addOrReplaceChild("LeftLegFront",
				CubeListBuilder.create().texOffs(24, 50).addBox(22.1924F, 4.0F, -0.7071F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 11.0F, -8.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r12 = LeftLegFront.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(0, 0).addBox(-18.0F, -21.0F, -2.0F, 6.0F, 24.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.1924F, 13.0F, -0.7071F, 0.0F, 0.0F, 1.0472F));
		PartDefinition cube_r13 = LeftLegFront.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(120, 134).addBox(28.0F, -18.0F, -16.0F, 4.0F, 18.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.8076F, 13.0F, 14.2929F, 0.0F, 0.0F, -0.2618F));
		PartDefinition RightLegFront = partdefinition.addOrReplaceChild("RightLegFront",
				CubeListBuilder.create().texOffs(24, 0).addBox(-24.364F, 5.0F, -0.7071F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.0F, 10.0F, -9.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r14 = RightLegFront.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(0, 50).addBox(12.0F, -24.0F, -2.0F, 6.0F, 24.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.364F, 14.0F, -0.7071F, 0.0F, 0.0F, -1.0472F));
		PartDefinition cube_r15 = RightLegFront.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(36, 133).addBox(-35.0F, -18.0F, -16.0F, 4.0F, 18.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.636F, 14.0F, 14.2929F, 0.0F, 0.0F, 0.2618F));
		PartDefinition LeftLegBack = partdefinition.addOrReplaceChild("LeftLegBack",
				CubeListBuilder.create().texOffs(24, 22).addBox(21.6066F, 4.0F, -2.1213F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 11.0F, 9.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r16 = LeftLegBack.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(80, 120).addBox(-18.0F, -19.0F, -2.0F, 6.0F, 24.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.6066F, 13.0F, -2.1213F, 0.0F, 0.0F, 1.0472F));
		PartDefinition cube_r17 = LeftLegBack.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(104, 134).addBox(26.0F, -18.0F, 14.0F, 4.0F, 18.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.3934F, 13.0F, -17.1213F, 0.0F, 0.0F, -0.2618F));
		PartDefinition RightLegBack = partdefinition.addOrReplaceChild("RightLegBack",
				CubeListBuilder.create().texOffs(24, 11).addBox(-24.8995F, 4.0F, -1.4142F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, 11.0F, 8.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r18 = RightLegBack.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(122, 58).addBox(14.0F, -21.0F, -2.0F, 6.0F, 24.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.8995F, 13.0F, -1.4142F, 0.0F, 0.0F, -1.0472F));
		PartDefinition cube_r19 = RightLegBack.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(52, 133).addBox(-32.0F, -18.0F, 14.0F, 4.0F, 18.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.1005F, 13.0F, -16.4142F, 0.0F, 0.0F, 0.2618F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Sting.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLegFront.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLegFront.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLegBack.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLegBack.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.RightLegFront.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftLegBack.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.LeftLegFront.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightLegBack.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
