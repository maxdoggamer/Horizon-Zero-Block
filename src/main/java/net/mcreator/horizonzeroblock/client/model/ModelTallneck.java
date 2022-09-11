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
public class ModelTallneck<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("horizon_zero_block", "model_tallneck"),
			"main");
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;
	public final ModelPart RightLeg2;
	public final ModelPart LeftLeg2;
	public final ModelPart Body;
	public final ModelPart Neck;
	public final ModelPart Head;

	public ModelTallneck(ModelPart root) {
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg2 = root.getChild("RightLeg2");
		this.LeftLeg2 = root.getChild("LeftLeg2");
		this.Body = root.getChild("Body");
		this.Neck = root.getChild("Neck");
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(98, 171).addBox(-3.0F, -2.0F, -4.0F, 3.0F, 54.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 54)
						.addBox(-1.5F, 56.0F, -7.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(26, 54)
						.addBox(-2.0F, 55.0F, -5.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-10.0F, -33.0F, 40.0F));
		PartDefinition cube_r1 = RightLeg.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(26, 33).addBox(-7.25F, -1.0F, -5.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 57.0F, -4.0F, 0.0F, 0.5672F, 0.0F));
		PartDefinition cube_r2 = RightLeg.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 31).addBox(-2.5F, -1.0F, -1.5F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 57.0F, -4.0F, 0.0F, -0.3054F, 0.0F));
		PartDefinition cube_r3 = RightLeg.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 63).addBox(-6.0F, -1.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 57.0F, -4.0F, 0.0F, 0.3054F, 0.0F));
		PartDefinition cube_r4 = RightLeg.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(26, 63).addBox(-5.0F, -8.0F, -0.5F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 57.0F, -4.0F, -0.3491F, 0.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(76, 171).addBox(0.0F, -2.0F, -4.0F, 3.0F, 54.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 22)
						.addBox(0.5F, 56.0F, -7.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.0F, 55.0F, -5.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(7.0F, -33.0F, 40.0F));
		PartDefinition cube_r5 = LeftLeg.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 9).addBox(-7.25F, -1.0F, -5.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 57.0F, -4.0F, 0.0F, 0.5672F, 0.0F));
		PartDefinition cube_r6 = LeftLeg.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(26, 0).addBox(-2.5F, -1.0F, -1.5F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 57.0F, -4.0F, 0.0F, -0.3054F, 0.0F));
		PartDefinition cube_r7 = LeftLeg.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(26, 9).addBox(-6.0F, -1.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 57.0F, -4.0F, 0.0F, 0.3054F, 0.0F));
		PartDefinition cube_r8 = LeftLeg.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(26, 22).addBox(-5.0F, -8.0F, -0.5F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 57.0F, -4.0F, -0.3491F, 0.0F, 0.0F));
		PartDefinition RightLeg2 = partdefinition.addOrReplaceChild("RightLeg2",
				CubeListBuilder.create().texOffs(159, 136).addBox(-3.0F, -4.0F, -5.0F, 3.0F, 64.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-10.0F, -36.0F, -2.0F));
		PartDefinition LeftLeg2 = partdefinition.addOrReplaceChild("LeftLeg2",
				CubeListBuilder.create().texOffs(50, 160).addBox(0.0F, -4.0F, -5.0F, 3.0F, 64.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.0F, -36.0F, -2.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(-2.0F, -35.0F, 0.0F));
		PartDefinition cube_r9 = Body.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(50, 125).addBox(1.0F, -56.0F, 40.0F, 4.0F, 4.0F, 31.0F, new CubeDeformation(0.0F)).texOffs(89, 136)
						.addBox(-9.0F, -56.0F, 40.0F, 4.0F, 4.0F, 31.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 59.0F, 0.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r10 = Body.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(93, 54).addBox(1.0F, -61.0F, -88.0F, 4.0F, 4.0F, 37.0F, new CubeDeformation(0.0F)).texOffs(109, 95)
						.addBox(-9.0F, -61.0F, -88.0F, 4.0F, 4.0F, 37.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 59.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r11 = Body.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(0, 54).addBox(-12.0F, -73.0F, -17.0F, 20.0F, 18.0F, 53.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 59.0F, 0.0F, -0.1745F, 0.0F, 0.0F));
		PartDefinition Neck = partdefinition.addOrReplaceChild("Neck",
				CubeListBuilder.create().texOffs(164, 56).addBox(0.0F, -67.0F, 10.0F, 3.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(0, 76)
						.addBox(0.0F, -42.0F, 9.0F, 3.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(0, 54)
						.addBox(0.0F, -15.0F, 5.0F, 3.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(154, 95)
						.addBox(-7.0F, -79.0F, 10.0F, 3.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(0, 22)
						.addBox(-7.0F, -88.0F, 21.0F, 3.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.0F, -88.0F, 21.0F, 3.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(150, 22)
						.addBox(-7.0F, -54.0F, 10.0F, 3.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(138, 54)
						.addBox(-7.0F, -28.0F, 7.0F, 3.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -45.0F, 1.0F));
		PartDefinition cube_r12 = Neck.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(0, 125).addBox(-8.0F, -151.0F, -17.0F, 12.0F, 96.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 64.0F, 0.0F, -0.1309F, 0.0F, 0.0F));
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-24.0F, -3.0F, -33.0F, 50.0F, 4.0F, 50.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, -131.0F, 10.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Neck.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.RightLeg2.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftLeg2.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
