package com.krafty.jdn.client.renderer;

import com.krafty.jdn.JournalDuNoobMod;
import com.krafty.jdn.client.models.FoxHybrideEntityModel;
import com.krafty.jdn.entity.FoxHybrideEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class FoxHybrideEntityRenderer extends MobRenderer<FoxHybrideEntity, FoxHybrideEntityModel> {
    private static final ResourceLocation TEXTURE_RED = new ResourceLocation(JournalDuNoobMod.MODID,"textures/entities/foxhybride_red_entity.png");
    private static final ResourceLocation TEXTURE_ARTIC = new ResourceLocation(JournalDuNoobMod.MODID,"textures/entities/foxhybride_artic_entity.png");

    public FoxHybrideEntityRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new FoxHybrideEntityModel(ctx.bakeLayer(FoxHybrideEntityModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(FoxHybrideEntity entity) {
        return entity.isRed() ? TEXTURE_RED : TEXTURE_ARTIC;
    }
}
