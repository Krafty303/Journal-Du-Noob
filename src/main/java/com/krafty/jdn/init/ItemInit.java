package com.krafty.jdn.init;

import com.krafty.jdn.JournalDuNoobMod;
import com.krafty.jdn.item.PestleItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.krafty.jdn.init.BlockInit.BAICLAIR_BUSH_BLOCK;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, JournalDuNoobMod.MODID);

    public static final RegistryObject<BlockItem> BAICLAIR_ITEM = ITEMS.register("baiclair", () -> new BlockItem(BAICLAIR_BUSH_BLOCK.get(), new Item.Properties().tab(JournalDuNoobMod.JDNCreativeTab).food((new FoodProperties.Builder()).nutrition(2).saturationMod(0.1F).build())));
    public static final RegistryObject<Item> STONE_ROD_ITEM = ITEMS.register("stone_rod", () -> new Item(new Item.Properties().tab(JournalDuNoobMod.JDNCreativeTab)));
    public static final RegistryObject<Item> PESTLE_ITEM = ITEMS.register("pestle", () -> new PestleItem(new Item.Properties().tab(JournalDuNoobMod.JDNCreativeTab)));
}
