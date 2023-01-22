// Made with Blockbench 4.6.0
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.world.entity.Entity;

public class FoxHybrideModel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart earLeft;
	private final ModelPart earRight;

	public FoxHybrideModel(ModelPart root) {
		this.earLeft = root.getChild("earLeft");
		this.earRight = root.getChild("earRight");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition earLeft = partdefinition.addOrReplaceChild("earLeft", CubeListBuilder.create().texOffs(7, 7).addBox(2.0F, -5.0F, 0.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 0).addBox(0.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 8).addBox(1.0F, -4.0F, 0.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(8, 14).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(11, 5).addBox(3.0F, -4.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 21.0F, 0.0F));

		PartDefinition earRight = partdefinition.addOrReplaceChild("earRight", CubeListBuilder.create().texOffs(4, 0).addBox(-0.3571F, -3.7143F, 0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(11, 11).addBox(1.6429F, -1.7143F, 0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.6429F, -2.7143F, 0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 13).addBox(2.6429F, -0.7143F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(8, 0).addBox(-1.3571F, -2.7143F, 0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.6429F, 19.7143F, -0.5F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		earLeft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		earRight.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}