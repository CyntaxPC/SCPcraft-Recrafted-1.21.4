package net.cyntax.scprecrafted.block;

import net.cyntax.scprecrafted.SCPcraftRecrafted;
import net.cyntax.scprecrafted.block.custom.ChairBlock;
import net.cyntax.scprecrafted.block.custom.GlassTableBlock;
import net.cyntax.scprecrafted.block.custom.TableBlock;
import net.cyntax.scprecrafted.world.tree.ModSaplingGenerators;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
 public static final Block DEEPSLATE_PLATINUM_ORE = registerBlock("deepslate_platinum_ore",
         new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "deepslate_platinum_ore")))
                 .strength(4.5f, 3)
                 .requiresTool()
                 .sounds(BlockSoundGroup.DEEPSLATE)));

 public static final Block DEEPSLATE_IRIDIUM_ORE = registerBlock("deepslate_iridium_ore",
         new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "deepslate_iridium_ore")))
                 .strength(4.5f, 3)
                 .requiresTool()
                 .sounds(BlockSoundGroup.DEEPSLATE)));

 public static final Block BLISTER_STEEL_BLOCK = registerBlock("blister_steel_block",
           new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "blister_steel_block")))
                   .strength(4f, 7)
                   .requiresTool()
                   .sounds(BlockSoundGroup.METAL)));

 public static final Block PLATINUM_BLOCK = registerBlock("platinum_block",
         new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "platinum_block")))
                 .strength(4.5f, 7)
                 .requiresTool()
                 .sounds(BlockSoundGroup.METAL)));

 public static final Block IRIDIUM_BLOCK = registerBlock("iridium_block",
         new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "iridium_block")))
                 .strength(4.5f, 7)
                 .requiresTool()
                 .sounds(BlockSoundGroup.METAL)));









 public static final Block DEEP_GRANITE = registerBlock("deep_granite",
         new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "deep_granite")))
                 .strength(2.5f, 6)
                 .requiresTool()
                 .sounds(BlockSoundGroup.STONE)));

 public static final Block POLISHED_DEEP_GRANITE = registerBlock("polished_deep_granite",
         new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "polished_deep_granite")))
                 .strength(2.5f, 6)
                 .requiresTool()
                 .sounds(BlockSoundGroup.STONE)));
 public static final Block POLISHED_DEEP_GRANITE_BRICKS = registerBlock("polished_deep_granite_bricks",
         new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "polished_deep_granite_bricks")))
                 .strength(2.5f, 6)
                 .requiresTool()
                 .sounds(BlockSoundGroup.STONE)));
 public static final Block CRACKED_POLISHED_DEEP_GRANITE_BRICKS = registerBlock("cracked_polished_deep_granite_bricks",
         new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "cracked_polished_deep_granite_bricks")))
                 .strength(2.5f, 6)
                 .requiresTool()
                 .sounds(BlockSoundGroup.STONE)));
 public static final Block MOSSY_POLISHED_DEEP_GRANITE_BRICKS = registerBlock("mossy_polished_deep_granite_bricks",
         new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "mossy_polished_deep_granite_bricks")))
                 .strength(2.5f, 6)
                 .requiresTool()
                 .sounds(BlockSoundGroup.STONE)));
 public static final Block CHISELED_POLISHED_DEEP_GRANITE_BRICKS = registerBlock("chiseled_polished_deep_granite_bricks",
         new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "chiseled_polished_deep_granite_bricks")))
                 .strength(2.5f, 6)
                 .requiresTool()
                 .sounds(BlockSoundGroup.STONE)));

 public static final Block DEEP_GRANITE_STAIRS = registerBlock("deep_granite_stairs",
         new StairsBlock(ModBlocks.DEEP_GRANITE.getDefaultState(), AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "deep_granite_stairs")))
                 .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

 public static final Block DEEP_GRANITE_SLAB = registerBlock("deep_granite_slab",
         new SlabBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "deep_granite_slab")))
                 .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

 public static final Block  DEEP_GRANITE_BUTTON = registerBlock("deep_granite_button",
         new ButtonBlock(BlockSetType.IRON, 6, AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "deep_granite_button")))
                 .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE).noCollision()));

 public static final Block DEEP_GRANITE_WALL= registerBlock("deep_granite_wall",
         new WallBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "deep_granite_wall")))
                 .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

 public static final Block POLISHED_DEEP_GRANITE_STAIRS = registerBlock("polished_deep_granite_stairs",
         new StairsBlock(ModBlocks.POLISHED_DEEP_GRANITE.getDefaultState(), AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "polished_deep_granite_stairs")))
                 .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

 public static final Block POLISHED_DEEP_GRANITE_SLAB = registerBlock("polished_deep_granite_slab",
         new SlabBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "polished_deep_granite_slab")))
                 .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

 public static final Block POLISHED_DEEP_GRANITE_WALL= registerBlock("polished_deep_granite_wall",
         new WallBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "polished_deep_granite_wall")))
                 .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

 public static final Block POLISHED_DEEP_GRANITE_PRESSURE_PLATE = registerBlock("polished_deep_granite_pressure_plate",
         new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "polished_deep_granite_pressure_plate")))
                 .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE).noCollision()));

 public static final Block POLISHED_DEEP_GRANITE_BRICKS_STAIRS = registerBlock("polished_deep_granite_bricks_stairs",
         new StairsBlock(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS.getDefaultState(), AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "polished_deep_granite_bricks_stairs")))
                 .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

 public static final Block POLISHED_DEEP_GRANITE_BRICKS_SLAB = registerBlock("polished_deep_granite_bricks_slab",
         new SlabBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "polished_deep_granite_bricks_slab")))
                 .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

 public static final Block POLISHED_DEEP_GRANITE_BRICKS_WALL= registerBlock("polished_deep_granite_bricks_wall",
         new WallBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "polished_deep_granite_bricks_wall")))
                 .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

 public static final Block CRACKED_POLISHED_DEEP_GRANITE_BRICKS_STAIRS = registerBlock("cracked_polished_deep_granite_bricks_stairs",
         new StairsBlock(ModBlocks.POLISHED_DEEP_GRANITE.getDefaultState(), AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "polished_deep_granite_bricks_stairs")))
                 .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

 public static final Block CRACKED_POLISHED_DEEP_GRANITE_BRICKS_SLAB = registerBlock("cracked_polished_deep_granite_bricks_slab",
         new SlabBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "polished_deep_granite_bricks_slab")))
                 .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

 public static final Block CRACKED_POLISHED_DEEP_GRANITE_BRICKS_WALL= registerBlock("cracked_polished_deep_granite_bricks_wall",
         new WallBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "polished_deep_granite_bricks_wall")))
                 .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

 public static final Block MOSSY_POLISHED_DEEP_GRANITE_BRICKS_STAIRS = registerBlock("mossy_polished_deep_granite_bricks_stairs",
         new StairsBlock(ModBlocks.POLISHED_DEEP_GRANITE.getDefaultState(), AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "polished_deep_granite_bricks_stairs")))
                 .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

 public static final Block MOSSY_POLISHED_DEEP_GRANITE_BRICKS_SLAB = registerBlock("mossy_polished_deep_granite_bricks_slab",
         new SlabBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "polished_deep_granite_bricks_slab")))
                 .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

 public static final Block MOSSY_POLISHED_DEEP_GRANITE_BRICKS_WALL= registerBlock("mossy_polished_deep_granite_bricks_wall",
         new WallBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "polished_deep_granite_bricks_wall")))
                 .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));











    public static final Block MARBLE = registerBlock("marble",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "marble")))
                    .strength(0.8f, 5)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_MARBLE = registerBlock("polished_marble",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "polished_marble")))
                    .strength(0.8f, 5)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_MARBLE_BRICKS = registerBlock("polished_marble_bricks",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "polished_marble_bricks")))
                    .strength(0.8f, 5)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block CRACKED_POLISHED_MARBLE_BRICKS = registerBlock("cracked_polished_marble_bricks",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "cracked_polished_marble_bricks")))
                    .strength(0.8f, 5)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block MOSSY_POLISHED_MARBLE_BRICKS = registerBlock("mossy_polished_marble_bricks",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "mossy_polished_marble_bricks")))
                    .strength(0.8f, 5)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block CHISELED_POLISHED_MARBLE_BRICKS = registerBlock("chiseled_polished_marble_bricks",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "chiseled_polished_marble_bricks")))
                    .strength(0.8f, 5)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)));

 public static final Block MARBLE_STAIRS = registerBlock("marble_stairs",
         new StairsBlock(ModBlocks.MARBLE.getDefaultState(), AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "marble_stairs")))
                 .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

 public static final Block MARBLE_SLAB = registerBlock("marble_slab",
         new SlabBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "marble_slab")))
                 .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

 public static final Block MARBLE_BUTTON = registerBlock("marble_button",
         new ButtonBlock(BlockSetType.IRON, 6, AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "marble_button")))
                 .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE).noCollision()));

 public static final Block MARBLE_WALL= registerBlock("marble_wall",
         new WallBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "marble_wall")))
                 .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

 public static final Block POLISHED_MARBLE_STAIRS = registerBlock("polished_marble_stairs",
         new StairsBlock(ModBlocks.POLISHED_MARBLE.getDefaultState(), AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "polished_marble_stairs")))
                 .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

 public static final Block POLISHED_MARBLE_SLAB = registerBlock("polished_marble_slab",
         new SlabBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "polished_marble_slab")))
                 .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

 public static final Block POLISHED_MARBLE_WALL= registerBlock("polished_marble_wall",
         new WallBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "polished_marble_wall")))
                 .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

 public static final Block POLISHED_MARBLE_PRESSURE_PLATE = registerBlock("polished_marble_pressure_plate",
         new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "polished_marble_pressure_plate")))
                 .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE).noCollision()));

 public static final Block POLISHED_MARBLE_BRICKS_STAIRS = registerBlock("polished_marble_bricks_stairs",
         new StairsBlock(ModBlocks.POLISHED_MARBLE.getDefaultState(), AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "polished_marble_brick_stairs")))
                 .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

 public static final Block POLISHED_MARBLE_BRICKS_SLAB = registerBlock("polished_marble_bricks_slab",
         new SlabBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "polished_marble_bricks_slab")))
                 .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

 public static final Block POLISHED_MARBLE_BRICKS_WALL= registerBlock("polished_marble_bricks_wall",
         new WallBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "polished_marble_bricks_wall")))
                 .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

 public static final Block CRACKED_POLISHED_MARBLE_BRICKS_STAIRS = registerBlock("cracked_polished_marble_bricks_stairs",
         new StairsBlock(ModBlocks.POLISHED_MARBLE.getDefaultState(), AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "polished_marble_brick_stairs")))
                 .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

 public static final Block CRACKED_POLISHED_MARBLE_BRICKS_SLAB = registerBlock("cracked_polished_marble_bricks_slab",
         new SlabBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "polished_marble_bricks_slab")))
                 .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

 public static final Block CRACKED_POLISHED_MARBLE_BRICKS_WALL= registerBlock("cracked_polished_marble_bricks_wall",
         new WallBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "polished_marble_bricks_wall")))
                 .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

 public static final Block MOSSY_POLISHED_MARBLE_BRICKS_STAIRS = registerBlock("mossy_polished_marble_bricks_stairs",
         new StairsBlock(ModBlocks.POLISHED_MARBLE.getDefaultState(), AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "polished_marble_brick_stairs")))
                 .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

 public static final Block MOSSY_POLISHED_MARBLE_BRICKS_SLAB = registerBlock("mossy_polished_marble_bricks_slab",
         new SlabBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "polished_marble_bricks_slab")))
                 .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));

 public static final Block MOSSY_POLISHED_MARBLE_BRICKS_WALL= registerBlock("mossy_polished_marble_bricks_wall",
         new WallBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "polished_marble_bricks_wall")))
                 .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.STONE)));










    public static final Block BLADEWOOD_LOG = registerBlock("bladewood_log",
            new PillarBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "bladewood_log")))
                    .strength(10f, 1200)
                    .requiresTool()
                    .sounds(BlockSoundGroup.CHERRY_WOOD)));

    public static final Block BLADEWOOD_WOOD = registerBlock("bladewood_wood",
            new PillarBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "bladewood_wood")))
                    .strength(10f, 1200)
                    .requiresTool()
                    .sounds(BlockSoundGroup.CHERRY_WOOD)));

    public static final Block STRIPPED_BLADEWOOD_LOG = registerBlock("stripped_bladewood_log",
            new PillarBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "stripped_bladewood_log")))
                    .strength(10f, 1200)
                    .requiresTool()
                    .sounds(BlockSoundGroup.CHERRY_WOOD)));

    public static final Block STRIPPED_BLADEWOOD_WOOD = registerBlock("stripped_bladewood_wood",
            new PillarBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "stripped_bladewood_wood")))
                    .strength(10f, 1200)
                    .requiresTool()
                    .sounds(BlockSoundGroup.CHERRY_WOOD)));

    public static final Block BLADEWOOD_PLANKS = registerBlock("bladewood_planks",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "bladewood_planks")))
                    .strength(5f, 1200)
                    .requiresTool()
                    .sounds(BlockSoundGroup.CHERRY_WOOD)));

    public static final Block BLADEWOOD_LEAVES = registerBlock("bladewood_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_LEAVES).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "bladewood_leaves")))));

    public static final Block BLADEWOOD_SAPLING = registerBlock("bladewood_sapling",
            new SaplingBlock(ModSaplingGenerators.BLADEWOOD, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "bladewood_sapling")))));

 public static final Block BLADEWOOD_STAIRS = registerBlock("bladewood_stairs",
         new StairsBlock(ModBlocks.BLADEWOOD_PLANKS.getDefaultState(), AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "bladewood_stairs")))
                 .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.CHERRY_WOOD)));

 public static final Block BLADEWOOD_SLAB = registerBlock("bladewood_slab",
         new SlabBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "bladewood_slab")))
                 .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.CHERRY_WOOD)));

 public static final Block BLADEWOOD_BUTTON = registerBlock("bladewood_button",
         new ButtonBlock(BlockSetType.CHERRY, 6, AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "bladewood_button")))
                 .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.CHERRY_WOOD).noCollision()));

 public static final Block BLADEWOOD_PRESSURE_PLATE = registerBlock("bladewood_pressure_plate",
         new PressurePlateBlock(BlockSetType.CHERRY, AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "bladewood_pressure_plate")))
                 .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.CHERRY_WOOD).noCollision()));

 public static final Block BLADEWOOD_FENCE = registerBlock("bladewood_fence",
         new FenceBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "bladewood_fence")))
                 .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.CHERRY_WOOD)));

 public static final Block BLADEWOOD_FENCE_GATE = registerBlock("bladewood_fence_gate",
         new FenceGateBlock(WoodType.CHERRY, AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "bladewood_fence_gate")))
                 .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.CHERRY_WOOD)));

 public static final Block BLADEWOOD_DOOR = registerBlock("bladewood_door",
         new DoorBlock(BlockSetType.CHERRY, AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "bladewood_door")))
                 .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.CHERRY_WOOD).nonOpaque()));

 public static final Block BLADEWOOD_TRAPDOOR = registerBlock("bladewood_trapdoor",
         new TrapdoorBlock(BlockSetType.CHERRY, AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "bladewood_trapdoor")))
                 .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.CHERRY_WOOD).nonOpaque()));










 public static final Block OAK_CHAIR = registerBlock("oak_chair",
         new ChairBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "oak_chair")))
                 .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.WOOD)));
 public static final Block BIRCH_CHAIR = registerBlock("birch_chair",
         new ChairBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "birch_chair")))
                 .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.WOOD)));
 public static final Block SPRUCE_CHAIR = registerBlock("spruce_chair",
         new ChairBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "spruce_chair")))
                 .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.WOOD)));
 public static final Block JUNGLE_CHAIR = registerBlock("jungle_chair",
         new ChairBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "jungle_chair")))
                 .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.WOOD)));
 public static final Block DARK_OAK_CHAIR = registerBlock("dark_oak_chair",
         new ChairBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "oak_chair")))
                 .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.WOOD)));
 public static final Block ACACIA_CHAIR = registerBlock("acacia_chair",
         new ChairBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "acacia_chair")))
                 .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.WOOD)));
 public static final Block CHERRY_CHAIR = registerBlock("cherry_chair",
         new ChairBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "cherry_chair")))
                 .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.WOOD)));
 public static final Block MANGROVE_CHAIR = registerBlock("mangrove_chair",
         new ChairBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "mangrove_chair")))
                 .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.WOOD)));
 public static final Block BLADEWOOD_CHAIR = registerBlock("bladewood_chair",
         new ChairBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "bladewood_chair")))
                 .nonOpaque().strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.CHERRY_WOOD)));
 public static final Block WARPED_CHAIR = registerBlock("warped_chair",
         new ChairBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "warped_chair")))
                 .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.NETHER_WOOD)));
 public static final Block CRIMSON_CHAIR = registerBlock("crimson_chair",
         new ChairBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "crimson_chair")))
                 .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.NETHER_WOOD)));


 public static final Block OAK_TABLE = registerBlock("oak_table",
         new TableBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "oak_table")))
                 .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.WOOD)));
 public static final Block BIRCH_TABLE = registerBlock("birch_table",
         new TableBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "birch_table")))
                 .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.WOOD)));
 public static final Block SPRUCE_TABLE = registerBlock("spruce_table",
         new TableBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "spruce_table")))
                 .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.WOOD)));
 public static final Block JUNGLE_TABLE = registerBlock("jungle_table",
         new TableBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "jungle_table")))
                 .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.WOOD)));
 public static final Block DARK_OAK_TABLE = registerBlock("dark_oak_table",
         new TableBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "dark_oak_table")))
                 .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.WOOD)));
 public static final Block ACACIA_TABLE = registerBlock("acacia_table",
         new TableBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "acacia_table")))
                 .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.WOOD)));
 public static final Block CHERRY_TABLE = registerBlock("cherry_table",
         new TableBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "cherry_table")))
                 .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.WOOD)));
 public static final Block MANGROVE_TABLE = registerBlock("mangrove_table",
         new TableBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "mangrove_table")))
                 .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.WOOD)));
 public static final Block BLADEWOOD_TABLE = registerBlock("bladewood_table",
         new TableBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "bladewood_table")))
                 .nonOpaque().strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.CHERRY_WOOD)));
 public static final Block WARPED_TABLE = registerBlock("warped_table",
         new TableBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "warped_table")))
                 .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.NETHER_WOOD)));
 public static final Block CRIMSON_TABLE = registerBlock("crimson_table",
         new TableBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "crimson_table")))
                 .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.NETHER_WOOD)));
 public static final Block GLASS_TABLE = registerBlock("glass_table",
         new GlassTableBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "glass_table")))
                 .nonOpaque().strength(1.0f, 1).sounds(BlockSoundGroup.GLASS)));


    public static final Block REINFORCED_GLASS = registerBlock("reinforced_glass",
            new TranslucentBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "reinforced_glass")))
                    .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.GLASS).nonOpaque()));
    public static final Block REINFORCED_GLASS_PANE = registerBlock("reinforced_glass_pane",
            new PaneBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, "reinforced_glass_pane")))
                    .strength(2.5f, 6).requiresTool().sounds(BlockSoundGroup.GLASS).nonOpaque()));








    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(SCPcraftRecrafted.MOD_ID, name), block);
    }
    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID, name),
                new BlockItem(block, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID, name))).useBlockPrefixedTranslationKey()));
    }
    public static void registerModBlocks() {
        SCPcraftRecrafted.LOGGER.info("Registering modded blocks for " + SCPcraftRecrafted.MOD_ID);
    }
}
