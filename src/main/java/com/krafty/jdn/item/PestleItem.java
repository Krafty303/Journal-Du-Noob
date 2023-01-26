package com.krafty.jdn.item;

import com.krafty.jdn.init.ItemInit;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.IFluidTank;
import net.minecraftforge.fluids.capability.IFluidHandler;
import net.minecraftforge.fluids.capability.templates.FluidTank;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.launch.platform.container.IContainerHandle;

public class PestleItem extends Item implements IFluidHandler, ICapabilityProvider {
    private FluidTank bowl = new FluidTank(300, (fluidStack) -> !fluidStack.getFluid().isSame(Fluids.LAVA));

    @Override
    public int getUseDuration(ItemStack p_41454_) {
        return 40;
    }

    @Override
    public UseAnim getUseAnimation(ItemStack p_41452_) {
        return UseAnim.NONE;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level worldIn, Player playerIn, InteractionHand handIn) {
        ItemStack itemstack = playerIn.getItemInHand(handIn);
        InteractionResultHolder<ItemStack> FAIL = new InteractionResultHolder<>(InteractionResult.FAIL, itemstack);
        System.out.println("Clic droit avec un pilon");
        InteractionHand otherHand = handIn == InteractionHand.MAIN_HAND ? InteractionHand.OFF_HAND : InteractionHand.MAIN_HAND;
        if (playerIn.getItemInHand(otherHand).getItem() == ItemInit.BAICLAIR_ITEM.get()) {
            System.out.println("Préparation de jus de baiclair...");
            return new InteractionResultHolder<>(InteractionResult.PASS, itemstack);
        }

        return FAIL;
    }

    @Override
    public ItemStack finishUsingItem(ItemStack p_41409_, Level p_41410_, LivingEntity p_41411_) {
        System.out.println("Fin du clic droit avec un pilon");
        return super.finishUsingItem(p_41409_, p_41410_, p_41411_);
    }

    public PestleItem(Properties p_41383_) {
        super(p_41383_);
    }

    @Override
    public int getTanks() {
        return bowl.getTanks();
    }

    @Override
    public @NotNull FluidStack getFluidInTank(int tank) {
        return this.bowl.getFluidInTank(tank);
    }

    @Override
    public int getTankCapacity(int tank) {
        return bowl.getTankCapacity(tank);
    }

    @Override
    public boolean isFluidValid(int tank, @NotNull FluidStack stack) {
        return !stack.getFluid().isSame(Fluids.LAVA);
    }

    @Override
    public int fill(FluidStack resource, FluidAction action) {
        return bowl.fill(resource, action);
    }

    @Override
    public @NotNull FluidStack drain(FluidStack resource, FluidAction action) {
        return bowl.drain(resource, action);
    }

    @Override
    public @NotNull FluidStack drain(int maxDrain, FluidAction action) {
        return bowl.drain(maxDrain, action);
    }

    @Override
    public @NotNull Component getDescription() {
        return Component.translatable("Capacité (en millibucket) : " + bowl.getTankCapacity(0) + "\nNom du fluide contenu : " + bowl.getFluid().getFluid().getFluidType() + "\nQuantité de fluide contenu (en millibucket) : " + bowl.getFluidAmount()).setStyle(Style.EMPTY.withBold(true).withColor(45467));
    }

    @Override
    public @NotNull <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
        return null;
    }
}
