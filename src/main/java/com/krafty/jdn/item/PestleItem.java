package com.krafty.jdn.item;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.capability.IFluidHandlerItem;
import org.jetbrains.annotations.NotNull;

public class PestleItem extends Item implements IFluidHandlerItem {
    private FluidStack fluidStack;
    int tankCapacity = 300;

    @Override
    public InteractionResultHolder<ItemStack> use(Level worldIn, Player playerIn, InteractionHand handIn) {
        ItemStack itemstack = playerIn.getItemInHand(handIn);
        InteractionResultHolder<ItemStack> FAIL = new InteractionResultHolder<>(InteractionResult.FAIL, itemstack);


        return FAIL;
    }

    public PestleItem(Properties p_41383_) {
        super(p_41383_);
    }

    @Override
    public @NotNull ItemStack getContainer() {
        return null;
    }

    @Override
    public int getTanks() {
        return tankCapacity - fluidStack.getAmount();
    }

    @Override
    public @NotNull FluidStack getFluidInTank(int tank) {
        return fluidStack;
    }

    @Override
    public int getTankCapacity(int tank) {
        return 300;
    }

    @Override
    public boolean isFluidValid(int tank, @NotNull FluidStack stack) {
        return false;
    }

    @Override
    public int fill(FluidStack resource, FluidAction action) {
        return 0;
    }

    @Override
    public @NotNull FluidStack drain(FluidStack resource, FluidAction action) {
        return null;
    }

    @Override
    public @NotNull FluidStack drain(int maxDrain, FluidAction action) {
        return null;
    }
}
