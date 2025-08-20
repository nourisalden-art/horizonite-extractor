package com.example.horizoniteextractor.content;

import com.example.horizoniteextractor.registry.ModBlocks;
import com.legacy.blue_skies.block_entity.HorizoniteForgeBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.wrapper.SidedInvWrapper;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class HorizoniteOvenBlockEntity extends HorizoniteForgeBlockEntity {

    private LazyOptional<IItemHandlerModifiable>[] sidedHandlers =
            SidedInvWrapper.create(this, Direction.UP, Direction.DOWN, Direction.NORTH);

    public HorizoniteOvenBlockEntity(BlockPos pos, BlockState state) {
        super(pos, state);
    }

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
        if (cap == ForgeCapabilities.ITEM_HANDLER && side != null) {
            if (side == Direction.UP) {
                return sidedHandlers[0].cast(); // Top: insert input
            } else if (side == Direction.DOWN) {
                return sidedHandlers[1].cast(); // Bottom: extract output
            } else {
                return sidedHandlers[2].cast(); // Sides: extract input
            }
        }
        return super.getCapability(cap, side);
    }

    @Override
    public void invalidateCaps() {
        super.invalidateCaps();
        for (LazyOptional<IItemHandlerModifiable> h : sidedHandlers) h.invalidate();
    }

    @Override
    public void reviveCaps() {
        super.reviveCaps();
        sidedHandlers = SidedInvWrapper.create(this, Direction.UP, Direction.DOWN, Direction.NORTH);
    }
}
