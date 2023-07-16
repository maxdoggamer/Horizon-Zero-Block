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
public class ModelStalker<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("horizon_zero_block", "model_stalker"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart Tail;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;
	public final ModelPart LeftLegFront;
	public final ModelPart RightLegFront;

	public ModelStalker(ModelPart root) {
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
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(15, 4).addBox(-4.0F, 2.0F, -9.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(15, 0).addBox(2.0F, 2.0F, -9.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
						.addBox(2.0F, 5.0F, -9.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.0F, 5.0F, -9.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 9.0F, -18.0F));
		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(44, 57).addBox(-3.0F, -23.0F, -20.0F, 6.0F, 5.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 14.0F, 19.0F, 0.48F, 0.0F, 0.0F));
		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(32, 40).addBox(1.0F, 16.0F, -23.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 41).addBox(-2.0F, 16.0F, -23.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(41, 37)
						.addBox(-2.0F, 18.0F, -23.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(41, 40).addBox(1.0F, 18.0F, -23.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 43)
						.addBox(1.0F, 20.0F, -23.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 44).addBox(-2.0F, 20.0F, -23.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 15.0F, 18.0F, -0.8727F, 0.0F, 0.0F));
		PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(32, 37).addBox(-3.0F, 26.0F, -20.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(10, 37).addBox(-3.0F, 27.0F, -21.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 37)
						.addBox(2.0F, 27.0F, -21.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 8).addBox(-3.0F, 24.0F, -20.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(15, 8)
						.addBox(2.0F, 24.0F, -20.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 40).addBox(2.0F, 26.0F, -20.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 15.0F, 18.0F, -1.2654F, 0.0F, 0.0F));
		PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(32, 37).addBox(-3.0F, -27.0F, -15.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 14.0F, 19.0F, 1.004F, -0.0234F, -0.0368F));
		PartDefinition cube_r5 = Head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(7, 51).addBox(2.0F, -27.0F, -15.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 14.0F, 19.0F, 1.004F, 0.0234F, 0.0368F));
		PartDefinition cube_r6 = Head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(50, 21).addBox(-3.0F, -9.0F, -35.0F, 6.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 14.0F, 19.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -4.0F, -17.0F, 10.0F, 7.0F, 30.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 9.0F, 0.0F));
		PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(56, 37).addBox(-4.0F, -23.0F, -17.0F, 8.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 15.0F, 0.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 13).addBox(-3.0F, -25.0F, -13.0F, 6.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 14.0F, -3.0F, -1.0036F, 0.0F, 0.0F));
		PartDefinition cube_r9 = Body.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(26, 15).addBox(-2.0F, -34.0F, -18.0F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 0).addBox(1.0F, -34.0F, -18.0F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 14.0F, -3.0F, -1.309F, 0.0F, 0.0F));
		PartDefinition cube_r10 = Body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(22, 13).addBox(-0.5F, -30.0F, -22.0F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 14.0F, -3.0F, -1.4835F, 0.0F, 0.0F));
		PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(2.0F, 9.0F, 15.0F));
		PartDefinition cube_r11 = Tail.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 37).addBox(3.0F, -21.0F, 23.0F, 4.0F, 4.0F, 24.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 16.0F, -15.0F, -0.1309F, -0.3054F, 0.0F));
		PartDefinition cube_r12 = Tail.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 0).addBox(5.0F, 12.0F, 63.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 16.0F, -15.0F, 0.3927F, -0.3054F, 0.0F));
		PartDefinition cube_r13 = Tail.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(14, 65).addBox(4.0F, -14.0F, 60.0F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 16.0F, -15.0F, 0.0F, -0.3054F, 0.0F));
		PartDefinition cube_r14 = Tail.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(50, 0).addBox(3.0F, -16.0F, 48.0F, 4.0F, 6.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 16.0F, -15.0F, 0.0F, -0.3054F, 0.0F));
		PartDefinition cube_r15 = Tail.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(32, 37).addBox(-2.0F, -17.0F, 12.0F, 4.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 15.0F, -15.0F, 0.0F, -0.1309F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0F, 7.0F, 8.0F, 0.0F, 0.0F, 0.0F));
		PartDefinition cube_r16 = RightLeg.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(69, 54).addBox(-2.0F, -9.0F, -1.0F, 3.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 3.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r17 = RightLeg.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(31, 71).addBox(-2.0F, 0.0F, -1.0F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 3.0F, -0.3491F, 0.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(5.0F, 7.0F, 8.0F));
		PartDefinition cube_r18 = LeftLeg.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(50, 0).addBox(17.0F, -9.0F, -1.0F, 3.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-18.0F, 8.0F, 3.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r19 = LeftLeg.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(56, 37).addBox(-1.0F, 0.0F, -1.0F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 3.0F, -0.3491F, 0.0F, 0.0F));
		PartDefinition LeftLegFront = partdefinition.addOrReplaceChild("LeftLegFront", CubeListBuilder.create().texOffs(0, 65).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 17.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 9.0F, -15.0F));
		PartDefinition RightLegFront = partdefinition.addOrReplaceChild("RightLegFront", CubeListBuilder.create().texOffs(0, 37).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 17.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 9.0F, -15.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLegFront.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLegFront.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.RightLegFront.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftLegFront.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
