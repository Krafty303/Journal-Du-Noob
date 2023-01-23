package com.krafty.jdn;

import com.krafty.jdn.init.BlockInit;
import com.krafty.jdn.init.EntityInit;
import com.krafty.jdn.init.ItemInit;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;

@Mod(JournalDuNoobMod.MODID)
public class JournalDuNoobMod {
    public static final String MODID = "jdn";
    public static final CreativeModeTab JDNCreativeTab = new CreativeModeTab("tabjdn") {
        @Override
        public ItemStack makeIcon() {
            return ItemInit.BAICLAIR_ITEM.get().getDefaultInstance();
        }
    };

    public JournalDuNoobMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        BlockInit.BLOCKS.register(bus);
        ItemInit.ITEMS.register(bus);
        EntityInit.ENTITIES.register(bus);
    }
}
