package com.krafty.jdn.client.models;


import com.krafty.jdn.JournalDuNoobMod;
import com.krafty.jdn.entity.FoxHybrideEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class FoxHybrideEntityModel extends HumanoidModel<FoxHybrideEntity> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(JournalDuNoobMod.MODID, "foxhybride"), "main");
	private final ModelPart earLeft;
	private final ModelPart earRight;

	public FoxHybrideEntityModel(ModelPart root) {
		super(root);
		this.earLeft = root.getChild("earLeft");
		this.earRight = root.getChild("earRight");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = HumanoidModel.createMesh(CubeDeformation.NONE, 0.0F);
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition earLeft = partdefinition.addOrReplaceChild("earLeft", CubeListBuilder.create().texOffs(7, 7).addBox(0.5F, -0.8F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 0).addBox(-1.5F, 1.2F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 8).addBox(-0.5F, 0.2F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 14).addBox(-2.5F, 2.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 5).addBox(1.5F, 0.2F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(4.5F, 12.8F, 0.5F));

		PartDefinition earRight = partdefinition.addOrReplaceChild("earRight", CubeListBuilder.create().texOffs(4, 0).addBox(-1.5F, -0.8F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 11).addBox(0.5F, 1.2F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-0.5F, 0.2F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(4, 13).addBox(1.5F, 2.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 0).addBox(-2.5F, 0.2F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.5F, 12.8F, 0.5F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(FoxHybrideEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		earLeft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		earRight.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}