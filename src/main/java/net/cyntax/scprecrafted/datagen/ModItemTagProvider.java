package net.cyntax.scprecrafted.datagen;

import net.cyntax.scprecrafted.block.ModBlocks;
import net.cyntax.scprecrafted.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {;

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.BLADEWOOD_LOG.asItem())
                .add(ModBlocks.BLADEWOOD_WOOD.asItem())
                .add(ModBlocks.STRIPPED_BLADEWOOD_LOG.asItem())
                .add(ModBlocks.STRIPPED_BLADEWOOD_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.BLADEWOOD_PLANKS.asItem());

    }
}
