package com.krafty.jdn;

import com.krafty.jdn.client.models.FoxHybrideEntityModel;
import com.krafty.jdn.client.renderer.FoxHybrideEntityRenderer;
import com.krafty.jdn.init.BlockInit;
import com.krafty.jdn.init.EntityInit;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = JournalDuNoobMod.MODID,bus = Mod.EventBusSubscriber.Bus.MOD,value = Dist.CLIENT)
public class ModClientEvents {
    @SubscribeEvent
    public static void entityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(EntityInit.FOXHYBRIDE.get(), FoxHybrideEntityRenderer::new);
    }

    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(FoxHybrideEntityModel.LAYER_LOCATION,FoxHybrideEntityModel::createBodyLayer);
    }
}
