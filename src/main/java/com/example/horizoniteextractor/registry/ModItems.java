package com.example.horizoniteextractor.registry;

import com.example.horizoniteextractor.HorizoniteExtractorMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HorizoniteExtractorMod.MODID);

    public static final RegistryObject<Item> HORIZONITE_OVEN =
            ITEMS.register("horizonite_oven",
                    () -> new BlockItem(ModBlocks.HORIZONITE_OVEN.get(), new Item.Properties()));
}
