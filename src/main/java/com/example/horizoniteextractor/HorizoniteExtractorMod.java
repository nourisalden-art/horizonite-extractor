package com.example.horizoniteextractor;

import com.example.horizoniteextractor.registry.ModBlocks;
import com.example.horizoniteextractor.registry.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;

@Mod(HorizoniteExtractorMod.MODID)
public class HorizoniteExtractorMod {
    public static final String MODID = "horizoniteextractor";

    public HorizoniteExtractorMod() {
        IEventBus bus = net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext.get().getModEventBus();
        ModBlocks.BLOCKS.register(bus);
        ModBlocks.BLOCK_ENTITIES.register(bus);
        ModItems.ITEMS.register(bus);
    }
}
