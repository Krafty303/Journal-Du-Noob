package com.krafty.jdn.init;

import com.krafty.jdn.JournalDuNoobMod;
import com.krafty.jdn.block.BaiclairBushBlock;
import com.krafty.jdn.block.modified_vanilla.SweetBerryBushBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, JournalDuNoobMod.MODID);
    public static final DeferredRegister<Block> BLOCKS_VANILLA = DeferredRegister.create(ForgeRegistries.BLOCKS, "minecraft");

    public static final RegistryObject<BaiclairBushBlock> BAICLAIR_BUSH_BLOCK = BLOCKS.register("baiclair_bush", () -> new BaiclairBushBlock());
    public static final RegistryObject<SweetBerryBushBlock> SWEET_BERRY_BUSH_BLOCK = BLOCKS_VANILLA.register("sweet_berry_bush", () -> new SweetBerryBushBlock());
}
