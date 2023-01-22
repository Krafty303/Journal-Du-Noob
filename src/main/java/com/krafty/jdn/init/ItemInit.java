package com.krafty.jdn.init;

import com.krafty.jdn.JournalDuNoobMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.krafty.jdn.init.BlockInit.BAICLAIR_BUSH_BLOCK;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, JournalDuNoobMod.MODID);

    public static final RegistryObject<BlockItem> BAICLAIR_ITEM = ITEMS.register("baiclair_item", () -> new BlockItem(BAICLAIR_BUSH_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));
}
