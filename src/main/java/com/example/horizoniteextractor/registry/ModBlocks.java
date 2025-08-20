package com.example.horizoniteextractor.registry;

import com.example.horizoniteextractor.HorizoniteExtractorMod;
import com.example.horizoniteextractor.content.HorizoniteOvenBlock;
import com.example.horizoniteextractor.content.HorizoniteOvenBlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, HorizoniteExtractorMod.MODID);

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, HorizoniteExtractorMod.MODID);

    public static final RegistryObject<Block> HORIZONITE_OVEN = BLOCKS.register("horizonite_oven",
            () -> new HorizoniteOvenBlock(BlockBehaviour.Properties.copy(Blocks.BLAST_FURNACE)));

    public static final RegistryObject<BlockEntityType<HorizoniteOvenBlockEntity>> HORIZONITE_OVEN_ENTITY =
            BLOCK_ENTITIES.register("horizonite_oven",
                    () -> BlockEntityType.Builder.of(HorizoniteOvenBlockEntity::new, HORIZONITE_OVEN.get()).build(null));
}
