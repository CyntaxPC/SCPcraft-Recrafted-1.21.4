package net.cyntax.scprecrafted.item;

import net.cyntax.scprecrafted.SCPcraftRecrafted;
import net.cyntax.scprecrafted.block.ModBlocks;
import net.cyntax.scprecrafted.item.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup SCPCRAFT_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(SCPcraftRecrafted.MOD_ID, "scpcraft_blocks_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.BLISTER_STEEL_BLOCK))
                    .displayName(Text.translatable("itemgroup.scprecrafted.scprecrafted_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BLISTER_STEEL_BLOCK);
                        entries.add(ModBlocks.MARBLE);
                        entries.add(ModBlocks.POLISHED_MARBLE);
                        entries.add(ModBlocks.DEEP_GRANITE);
                        entries.add(ModBlocks.POLISHED_DEEP_GRANITE);
                        entries.add(ModBlocks.DEEPSLATE_PLATINUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_IRIDIUM_ORE);
                        entries.add(ModBlocks.PLATINUM_BLOCK);
                        entries.add(ModBlocks.IRIDIUM_BLOCK);
                        entries.add(ModBlocks.BLADEWOOD_LOG);
                        entries.add(ModBlocks.BLADEWOOD_WOOD);
                        entries.add(ModBlocks.STRIPPED_BLADEWOOD_LOG);
                        entries.add(ModBlocks.STRIPPED_BLADEWOOD_WOOD);
                        entries.add(ModBlocks.BLADEWOOD_LEAVES);
                        entries.add(ModBlocks.BLADEWOOD_SAPLING);
                        entries.add(ModBlocks.BLADEWOOD_PLANKS);



                        entries.add(ModBlocks.BLADEWOOD_STAIRS);
                        entries.add(ModBlocks.BLADEWOOD_SLAB);
                        entries.add(ModBlocks.BLADEWOOD_FENCE);
                        entries.add(ModBlocks.BLADEWOOD_FENCE_GATE);
                        entries.add(ModBlocks.BLADEWOOD_BUTTON);
                        entries.add(ModBlocks.BLADEWOOD_PRESSURE_PLATE);
                        entries.add(ModBlocks.BLADEWOOD_DOOR);
                        entries.add(ModBlocks.BLADEWOOD_TRAPDOOR);

                        entries.add(ModBlocks.DEEP_GRANITE_STAIRS);
                        entries.add(ModBlocks.DEEP_GRANITE_SLAB);
                        entries.add(ModBlocks.DEEP_GRANITE_WALL);
                        entries.add(ModBlocks.DEEP_GRANITE_BUTTON);

                        entries.add(ModBlocks.MARBLE_STAIRS);
                        entries.add(ModBlocks.MARBLE_SLAB);
                        entries.add(ModBlocks.MARBLE_WALL);
                        entries.add(ModBlocks.MARBLE_BUTTON);

                        entries.add(ModBlocks.POLISHED_DEEP_GRANITE_STAIRS);
                        entries.add(ModBlocks.POLISHED_DEEP_GRANITE_SLAB);
                        entries.add(ModBlocks.POLISHED_DEEP_GRANITE_WALL);
                        entries.add(ModBlocks.POLISHED_DEEP_GRANITE_PRESSURE_PLATE);

                        entries.add(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS);
                        entries.add(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS_STAIRS);
                        entries.add(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS_SLAB);
                        entries.add(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS_WALL);
                        entries.add(ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS);
                        entries.add(ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS_STAIRS);
                        entries.add(ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS_SLAB);
                        entries.add(ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS_WALL);
                        entries.add(ModBlocks.MOSSY_POLISHED_DEEP_GRANITE_BRICKS);
                        entries.add(ModBlocks.MOSSY_POLISHED_DEEP_GRANITE_BRICKS_STAIRS);
                        entries.add(ModBlocks.MOSSY_POLISHED_DEEP_GRANITE_BRICKS_SLAB);
                        entries.add(ModBlocks.MOSSY_POLISHED_DEEP_GRANITE_BRICKS_WALL);
                        entries.add(ModBlocks.CHISELED_POLISHED_DEEP_GRANITE_BRICKS);

                        entries.add(ModBlocks.POLISHED_MARBLE_STAIRS);
                        entries.add(ModBlocks.POLISHED_MARBLE_SLAB);
                        entries.add(ModBlocks.POLISHED_MARBLE_WALL);
                        entries.add(ModBlocks.POLISHED_MARBLE_PRESSURE_PLATE);

                        entries.add(ModBlocks.POLISHED_MARBLE_BRICKS);
                        entries.add(ModBlocks.POLISHED_MARBLE_BRICKS_STAIRS);
                        entries.add(ModBlocks.POLISHED_MARBLE_BRICKS_SLAB);
                        entries.add(ModBlocks.POLISHED_MARBLE_BRICKS_WALL);
                        entries.add(ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS);
                        entries.add(ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS_STAIRS);
                        entries.add(ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS_SLAB);
                        entries.add(ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS_WALL);
                        entries.add(ModBlocks.MOSSY_POLISHED_MARBLE_BRICKS);
                        entries.add(ModBlocks.MOSSY_POLISHED_MARBLE_BRICKS_STAIRS);
                        entries.add(ModBlocks.MOSSY_POLISHED_MARBLE_BRICKS_SLAB);
                        entries.add(ModBlocks.MOSSY_POLISHED_MARBLE_BRICKS_WALL);
                        entries.add(ModBlocks.CHISELED_POLISHED_MARBLE_BRICKS);

                    }).build());

    public static final ItemGroup SCPCRAFT_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(SCPcraftRecrafted.MOD_ID, "scpcraft_items_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.IRON_BLAST))
                    .displayName(Text.translatable("itemgroup.scprecrafted.scprecrafted_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.IRON_BLAST);
                        entries.add(ModItems.BLISTER_STEEL_INGOT);
                        entries.add(ModItems.RAW_PLATINUM);
                        entries.add(ModItems.PLATINUM_INGOT);
                        entries.add(ModItems.RAW_IRIDIUM);
                        entries.add(ModItems.IRIDIUM_INGOT);

                    }).build());

    public static void registerItemGroups() {
        SCPcraftRecrafted.LOGGER.info("Registering Item Groups for " + SCPcraftRecrafted.MOD_ID);
    }
}
