package com.krafty.jdn.block;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class BaiclairBushBlock extends BushBlock {
    public BaiclairBushBlock() {
        super(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH));
    }
}
