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

// Made with Blockbench 4.4.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelTallneck<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("horizon_zero_block", "model_tallneck"),
			"main");
	public final ModelPart Head;
	public final ModelPart Neck;
	public final ModelPart Body;
	public final ModelPart LeftLeg;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg2;
	public final ModelPart RightLeg2;

	public ModelTallneck(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Neck = root.getChild("Neck");
		this.Body = root.getChild("Body");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg2 = root.getChild("LeftLeg2");
		this.RightLeg2 = root.getChild("RightLeg2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 243).addBox(-75.0F, -356.0F, 10.0F, 142.0F, 9.0F, 129.0F, new CubeDeformation(0.0F))
						.texOffs(0, 312).addBox(3.0F, -387.0F, 33.0F, 10.0F, 35.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(17.0F, -381.0F, 33.0F, 4.0F, 25.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 289)
						.addBox(5.0F, -356.0F, 2.0F, 50.0F, 12.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 266)
						.addBox(-80.0F, -356.0F, 2.0F, 50.0F, 12.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 243)
						.addBox(-36.0F, -356.0F, 25.0F, 50.0F, 12.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Neck = partdefinition.addOrReplaceChild("Neck",
				CubeListBuilder.create().texOffs(405, 126).addBox(5.0F, -324.0F, -9.0F, 10.0F, 6.0F, 57.0F, new CubeDeformation(0.0F))
						.texOffs(405, 63).addBox(5.0F, -280.0F, -2.0F, 10.0F, 6.0F, 57.0F, new CubeDeformation(0.0F)).texOffs(320, 381)
						.addBox(5.0F, -224.0F, 5.0F, 10.0F, 6.0F, 57.0F, new CubeDeformation(0.0F)).texOffs(397, 387)
						.addBox(-17.0F, -303.0F, -7.0F, 10.0F, 6.0F, 57.0F, new CubeDeformation(0.0F)).texOffs(385, 0)
						.addBox(-17.0F, -250.0F, 2.0F, 10.0F, 6.0F, 57.0F, new CubeDeformation(0.0F)).texOffs(186, 381)
						.addBox(-17.0F, -197.0F, 4.0F, 10.0F, 6.0F, 57.0F, new CubeDeformation(0.0F)).texOffs(328, 104)
						.addBox(4.0F, -185.0F, 8.0F, 10.0F, 6.0F, 57.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = Neck.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 381).addBox(-17.0F, -349.0F, 61.0F, 32.0F, 198.0F, 30.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0436F, 0.0F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-34.0F, -165.0F, -90.0F, 66.0F, 52.0F, 191.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(124, 381).addBox(-39.0F, -140.0F, -85.0F, 10.0F, 140.0F, 21.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(323, 0).addBox(27.0F, -140.0F, -85.0F, 10.0F, 140.0F, 21.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition LeftLeg2 = partdefinition.addOrReplaceChild("LeftLeg2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-39.0F, -152.0F, 46.0F, 10.0F, 152.0F, 30.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition RightLeg2 = partdefinition.addOrReplaceChild("RightLeg2",
				CubeListBuilder.create().texOffs(80, 0).addBox(27.0F, -152.0F, 46.0F, 10.0F, 152.0F, 30.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Neck.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.RightLeg2.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftLeg2.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
