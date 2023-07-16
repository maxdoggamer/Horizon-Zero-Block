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

// Made with Blockbench 4.4.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelScrapper<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("horizon_zero_block", "model_scrapper"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart LeftLeg;
	public final ModelPart RightLeg;
	public final ModelPart RightLeg2;
	public final ModelPart LeftLeg2;

	public ModelScrapper(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
		this.RightLeg2 = root.getChild("RightLeg2");
		this.LeftLeg2 = root.getChild("LeftLeg2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.5F, 8.0F, -13.0F));
		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(78, 22).addBox(-3.0F, -25.0F, -24.0F, 7.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(42, 46).addBox(4.0F, -18.0F, -35.0F, 2.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(88, 89)
						.addBox(3.0F, -19.0F, -37.0F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(42, 44).addBox(4.0F, -18.0F, -36.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(92, 63)
						.addBox(5.0F, -19.0F, -37.0F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(88, 12).addBox(-3.0F, -19.0F, -37.0F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(17, 0)
						.addBox(-4.0F, -18.0F, -36.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(92, 73).addBox(-5.0F, -19.0F, -37.0F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(58, 22)
						.addBox(-5.0F, -18.0F, -35.0F, 2.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 62).addBox(-3.0F, -23.0F, -30.0F, 7.0F, 8.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 16.0F, 13.0F, 0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(38, 94).addBox(7.0F, -25.0F, -26.0F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 16.0F, 13.0F, 0.3518F, 0.123F, 0.045F));
		PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(50, 94).addBox(-7.0F, -25.0F, -26.0F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 16.0F, 13.0F, 0.3518F, -0.123F, -0.045F));
		PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(48, 0).addBox(-3.0F, -23.0F, -22.0F, 7.0F, 9.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(12, 93)
				.addBox(0.0F, -28.0F, -20.0F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(26, 94).addBox(0.0F, -28.0F, -13.0F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 16.0F, 13.0F, 0.2618F, 0.0F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, 5.0F, 0.0F));
		PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(75, 0).addBox(-3.0F, -6.0F, 9.0F, 7.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(36, 65).addBox(-3.0F, -6.0F, 6.0F, 7.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(62, 41).addBox(-3.0F, -10.0F, -9.0F, 7.0F, 5.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(62, 95).addBox(-1.0F, -6.0F, -6.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 35)
				.addBox(-6.0F, -3.0F, -15.0F, 13.0F, 11.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-5.0F, 0.0F, -14.0F, 11.0F, 9.0F, 26.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(0, 18).addBox(0.0F, 14.0F, 5.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 8.0F, 8.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition cube_r8 = LeftLeg.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(49, 79).addBox(7.0F, -15.0F, 10.0F, 4.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 90).addBox(8.0F, -4.0F, 15.0F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, 16.0F, -8.0F, 0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r9 = LeftLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(85, 57).addBox(8.0F, 6.0F, 10.0F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, 16.0F, -8.0F, 1.309F, 0.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(25, 62).addBox(-5.0F, 14.0F, 5.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 8.0F, 8.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition cube_r10 = RightLeg.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(31, 79).addBox(-10.0F, -15.0F, 10.0F, 4.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(87, 41).addBox(-10.0F, -4.0F, 15.0F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 16.0F, -8.0F, 0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r11 = RightLeg.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(19, 87).addBox(-10.0F, 6.0F, 10.0F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 16.0F, -8.0F, 1.309F, 0.0F, 0.0F));
		PartDefinition RightLeg2 = partdefinition.addOrReplaceChild("RightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0F, 7.0F, -8.0F, -0.5672F, 0.0F, 0.0873F));
		PartDefinition cube_r12 = RightLeg2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(68, 65).addBox(-11.0F, -16.0F, 9.0F, 5.0F, 11.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 16.0F, -8.0F, 0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r13 = RightLeg2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(67, 83).addBox(-10.0F, -2.0F, 12.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 16.0F, -8.0F, 0.6981F, 0.0F, 0.0F));
		PartDefinition cube_r14 = RightLeg2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(81, 83).addBox(-10.0F, -12.0F, 9.0F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 16.0F, -8.0F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r15 = RightLeg2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 81).addBox(-11.0F, 5.0F, 6.0F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 16.0F, -8.0F, 0.5672F, 0.0F, 0.0F));
		PartDefinition LeftLeg2 = partdefinition.addOrReplaceChild("LeftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(11.0F, 7.0F, -8.0F, -0.5672F, 0.0F, -0.0873F));
		PartDefinition cube_r16 = LeftLeg2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 0).addBox(-11.0F, -16.0F, 9.0F, 5.0F, 11.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 16.0F, -8.0F, 0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r17 = LeftLeg2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 35).addBox(-10.0F, -2.0F, 12.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 16.0F, -8.0F, 0.6981F, 0.0F, 0.0F));
		PartDefinition cube_r18 = LeftLeg2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(48, 0).addBox(-10.0F, -12.0F, 9.0F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 16.0F, -8.0F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r19 = LeftLeg2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(42, 35).addBox(-11.0F, 5.0F, 6.0F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 16.0F, -8.0F, 0.5672F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.RightLeg2.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftLeg2.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
