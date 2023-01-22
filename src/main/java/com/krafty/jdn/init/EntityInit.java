package com.krafty.jdn.init;

import com.krafty.jdn.JournalDuNoobMod;
import com.krafty.jdn.entity.FoxHybrideEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityInit {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, JournalDuNoobMod.MODID);

    public static final RegistryObject<EntityType<FoxHybrideEntity>> FOXHYBRIDE = ENTITIES.register("foxhybride",() -> EntityType.Builder.of(FoxHybrideEntity::new, MobCategory.CREATURE).build(new ResourceLocation(JournalDuNoobMod.MODID,"foxhybride").toString()));

    public static AttributeSupplier getAttributes() {
        return null;
    }
}
