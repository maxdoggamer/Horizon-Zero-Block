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
public class ModelWatcher<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("horizon_zero_block", "model_watcher"), "main");
	public final ModelPart Head;
	public final ModelPart Neck;
	public final ModelPart Body;
	public final ModelPart Left_Leg;
	public final ModelPart Right_Leg;
	public final ModelPart Tail;

	public ModelWatcher(ModelPart root) {
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
				CubeListBuilder.create().texOffs(0, 52).addBox(-3.0F, -5.0F, -10.0F, 6.0F, 6.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(45, 0).addBox(-4.0F, -6.0F, -8.0F, 8.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(29, 27)
						.addBox(1.0F, 1.0F, -6.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 0).addBox(-2.0F, 1.0F, -6.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -8.0F, 0.0F, 2.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -13.0F, -22.0F));
		PartDefinition Neck = partdefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(30, 32).addBox(-2.0F, -2.0F, -19.0F, 4.0F, 4.0F, 20.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, -11.0F, -0.9163F, 0.0F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(34, 56).addBox(-4.0F, -9.0F, -2.0F, 8.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.0F, 0.0F));
		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -5.0F, -13.0F, 12.0F, 6.0F, 21.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3491F, 0.0F, 0.0F));
		PartDefinition Left_Leg = partdefinition.addOrReplaceChild("Left_Leg", CubeListBuilder.create(), PartPose.offset(-6.0F, 9.0F, -1.0F));
		PartDefinition cube_r2 = Left_Leg.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 9).addBox(-1.0F, 0.1648F, -1.1991F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -1.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r3 = Left_Leg.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(8, 27).addBox(-1.0F, 0.211F, -0.6025F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 6.0F, 3.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition Right_Leg = partdefinition.addOrReplaceChild("Right_Leg", CubeListBuilder.create(), PartPose.offset(6.0F, 9.0F, -1.0F));
		PartDefinition cube_r4 = Right_Leg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(8, 9).addBox(-1.0F, 0.1648F, -1.1991F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -1.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r5 = Right_Leg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 27).addBox(-1.0F, -0.755F, -0.8613F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 7.0F, 3.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r6 = Tail.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 27).addBox(-2.0F, -1.0F, 0.0F, 4.0F, 4.0F, 21.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -17.0F, 8.0F, -0.3927F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Neck.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Left_Leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Right_Leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.Right_Leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.Left_Leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
