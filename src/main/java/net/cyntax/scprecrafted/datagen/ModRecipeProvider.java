package net.cyntax.scprecrafted.datagen;

import net.cyntax.scprecrafted.block.ModBlocks;
import net.cyntax.scprecrafted.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate(){
                List<ItemConvertible> PLATINUM_SMELTABLES = List.of(ModItems.RAW_PLATINUM, ModBlocks.DEEPSLATE_PLATINUM_ORE);
                List<ItemConvertible> IRIDIUM_SMELTABLES = List.of(ModItems.RAW_IRIDIUM, ModBlocks.DEEPSLATE_IRIDIUM_ORE);
                List<ItemConvertible> STEEL_BLASTABLES = List.of(ModItems.IRON_BLAST);

                List<ItemConvertible> DEEP_GRANITE_BRICK_SMELTABLES = List.of(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS);
                List<ItemConvertible> POLISHED_DEEP_GRANITE_BRICK_SLAB_SMELTABLES = List.of(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS_SLAB);
                List<ItemConvertible> POLISHED_DEEP_GRANITE_BRICK_STAIR_SMELTABLES = List.of(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS_STAIRS);
                List<ItemConvertible> POLISHED_DEEP_GRANITE_BRICK_WALL_SMELTABLES = List.of(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS_WALL);

                List<ItemConvertible> MARBLE_BRICK_SMELTABLES = List.of(ModBlocks.POLISHED_MARBLE_BRICKS);
                List<ItemConvertible> POLISHED_MARBLE_BRICK_SLAB_SMELTABLES = List.of(ModBlocks.POLISHED_MARBLE_BRICKS_SLAB);
                List<ItemConvertible> POLISHED_MARBLE_BRICK_STAIR_SMELTABLES = List.of(ModBlocks.POLISHED_MARBLE_BRICKS_STAIRS);
                List<ItemConvertible> POLISHED_MARBLE_BRICK_WALL_SMELTABLES = List.of(ModBlocks.POLISHED_MARBLE_BRICKS_WALL);


                offerSmelting(PLATINUM_SMELTABLES, RecipeCategory.MISC, ModItems.PLATINUM_INGOT, 0.3f, 200, "platinum_ingot");
                offerBlasting(PLATINUM_SMELTABLES, RecipeCategory.MISC, ModItems.PLATINUM_INGOT, 0.3f, 100, "platinum_ingot");
                offerSmelting(IRIDIUM_SMELTABLES, RecipeCategory.MISC, ModItems.IRIDIUM_INGOT, 0.3f, 200, "iridium_ingot");
                offerBlasting(IRIDIUM_SMELTABLES, RecipeCategory.MISC, ModItems.IRIDIUM_INGOT, 0.3f, 100, "iridium_ingot");
                offerBlasting(STEEL_BLASTABLES, RecipeCategory.MISC, ModItems.BLISTER_STEEL_INGOT, 0.5f, 100, "blister_steel_ingot");

                offerSmelting(DEEP_GRANITE_BRICK_SMELTABLES, RecipeCategory.MISC, ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS, 0.15f, 200, "cracked_polished_deep_granite_bricks");
                offerBlasting(DEEP_GRANITE_BRICK_SMELTABLES, RecipeCategory.MISC, ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS, 0.15f, 100, "cracked_polished_deep_granite_bricks");
                offerSmelting(POLISHED_DEEP_GRANITE_BRICK_SLAB_SMELTABLES, RecipeCategory.MISC, ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS_SLAB, 0.3f, 200, "cracked_polished_deep_granite_bricks_slab");
                offerSmelting(POLISHED_DEEP_GRANITE_BRICK_STAIR_SMELTABLES, RecipeCategory.MISC, ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS_STAIRS, 0.3f, 100, "cracked_polished_deep_granite_bricks_stairs");
                offerSmelting(POLISHED_DEEP_GRANITE_BRICK_WALL_SMELTABLES, RecipeCategory.MISC, ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS_WALL, 0.3f, 100, "cracked_polished_deep_granite_bricks_wall");
                offerBlasting(POLISHED_DEEP_GRANITE_BRICK_SLAB_SMELTABLES, RecipeCategory.MISC, ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS_SLAB, 0.3f, 200, "cracked_polished_deep_granite_bricks_slab");
                offerBlasting(POLISHED_DEEP_GRANITE_BRICK_STAIR_SMELTABLES, RecipeCategory.MISC, ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS_STAIRS, 0.3f, 100, "cracked_polished_deep_granite_bricks_stairs");
                offerBlasting(POLISHED_DEEP_GRANITE_BRICK_WALL_SMELTABLES, RecipeCategory.MISC, ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS_WALL, 0.3f, 100, "cracked_polished_deep_granite_bricks_wall");

                offerSmelting(MARBLE_BRICK_SMELTABLES, RecipeCategory.MISC, ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS, 0.15f, 200, "cracked_polished_marble_bricks");
                offerBlasting(MARBLE_BRICK_SMELTABLES, RecipeCategory.MISC, ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS, 0.15f, 100, "cracked_polished_marble_bricks");
                offerSmelting(POLISHED_MARBLE_BRICK_SLAB_SMELTABLES, RecipeCategory.MISC, ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS_SLAB, 0.3f, 200, "cracked_polished_marble_bricks_slab");
                offerSmelting(POLISHED_MARBLE_BRICK_STAIR_SMELTABLES, RecipeCategory.MISC, ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS_STAIRS, 0.3f, 100, "cracked_polished_marble_bricks_stairs");
                offerSmelting(POLISHED_MARBLE_BRICK_WALL_SMELTABLES, RecipeCategory.MISC, ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS_WALL, 0.3f, 100, "cracked_polished_marble_bricks_wall");
                offerBlasting(POLISHED_MARBLE_BRICK_SLAB_SMELTABLES, RecipeCategory.MISC, ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS_SLAB, 0.3f, 200, "cracked_polished_marble_bricks_slab");
                offerBlasting(POLISHED_MARBLE_BRICK_STAIR_SMELTABLES, RecipeCategory.MISC, ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS_STAIRS, 0.3f, 100, "cracked_polished_marble_bricks_stairs");
                offerBlasting(POLISHED_MARBLE_BRICK_WALL_SMELTABLES, RecipeCategory.MISC, ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS_WALL, 0.3f, 100, "cracked_polished_marble_bricks_wall");

                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModItems.PLATINUM_INGOT, RecipeCategory.DECORATIONS, ModBlocks.PLATINUM_BLOCK);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModItems.IRIDIUM_INGOT, RecipeCategory.DECORATIONS, ModBlocks.IRIDIUM_BLOCK);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModItems.BLISTER_STEEL_INGOT, RecipeCategory.DECORATIONS, ModBlocks.BLISTER_STEEL_BLOCK);

                createShapeless(RecipeCategory.MISC, ModItems.IRON_BLAST, 1)
                        .input(Items.CHARCOAL)
                        .input(Items.RAW_IRON)
                        .criterion(hasItem(Items.RAW_IRON), conditionsFromItem(Items.RAW_IRON))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModBlocks.POLISHED_DEEP_GRANITE, 4)
                        .pattern("XX ")
                        .pattern("XX ")
                        .pattern("   ")
                        .input('X', ModBlocks.DEEP_GRANITE)
                        .criterion(hasItem(ModBlocks.DEEP_GRANITE), conditionsFromItem(ModBlocks.DEEP_GRANITE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModBlocks.POLISHED_DEEP_GRANITE_BRICKS, 4)
                        .pattern("XX ")
                        .pattern("XX ")
                        .pattern("   ")
                        .input('X', ModBlocks.POLISHED_DEEP_GRANITE)
                        .criterion(hasItem(ModBlocks.POLISHED_DEEP_GRANITE), conditionsFromItem(ModBlocks.POLISHED_DEEP_GRANITE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModBlocks.CHISELED_POLISHED_DEEP_GRANITE_BRICKS, 1)
                        .pattern("X  ")
                        .pattern("X  ")
                        .pattern("   ")
                        .input('X', ModBlocks.POLISHED_DEEP_GRANITE_BRICKS_SLAB)
                        .criterion(hasItem(ModBlocks.POLISHED_DEEP_GRANITE), conditionsFromItem(ModBlocks.POLISHED_DEEP_GRANITE))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModBlocks.MOSSY_POLISHED_DEEP_GRANITE_BRICKS, 1)
                        .input(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS)
                        .input(Blocks.VINE)
                        .criterion(hasItem(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS), conditionsFromItem(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS))
                        .offerTo(exporter,"mossy_deep_granite_from_vine");

                createShapeless(RecipeCategory.MISC, ModBlocks.MOSSY_POLISHED_DEEP_GRANITE_BRICKS, 1)
                        .input(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS)
                        .input(Blocks.MOSS_BLOCK)
                        .criterion(hasItem(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS), conditionsFromItem(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS))
                        .offerTo(exporter,"mossy_deep_granite_from_moss");

                createButtonRecipe(ModBlocks.DEEP_GRANITE_BUTTON, Ingredient.ofItem(ModBlocks.DEEP_GRANITE))
                        .criterion(hasItem(ModBlocks.DEEP_GRANITE), conditionsFromItem(ModBlocks.DEEP_GRANITE))
                        .offerTo(exporter);
                offerWallRecipe(RecipeCategory.MISC, ModBlocks.DEEP_GRANITE_WALL, ModBlocks.DEEP_GRANITE);
                offerSlabRecipe(RecipeCategory.MISC, ModBlocks.DEEP_GRANITE_SLAB, ModBlocks.DEEP_GRANITE);
                createStairsRecipe(ModBlocks.DEEP_GRANITE_STAIRS, Ingredient.ofItem(ModBlocks.DEEP_GRANITE))
                        .criterion(hasItem(ModBlocks.DEEP_GRANITE), conditionsFromItem(ModBlocks.DEEP_GRANITE))
                        .offerTo(exporter);

                offerPressurePlateRecipe(ModBlocks.POLISHED_DEEP_GRANITE_PRESSURE_PLATE, ModBlocks.POLISHED_DEEP_GRANITE);
                offerWallRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_DEEP_GRANITE_WALL, ModBlocks.POLISHED_DEEP_GRANITE);
                offerSlabRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_DEEP_GRANITE_SLAB, ModBlocks.POLISHED_DEEP_GRANITE);
                createStairsRecipe(ModBlocks.POLISHED_DEEP_GRANITE_STAIRS, Ingredient.ofItem(ModBlocks.POLISHED_DEEP_GRANITE))
                        .criterion(hasItem(ModBlocks.POLISHED_DEEP_GRANITE), conditionsFromItem(ModBlocks.POLISHED_DEEP_GRANITE))
                        .offerTo(exporter);

                offerWallRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_DEEP_GRANITE_BRICKS_WALL, ModBlocks.POLISHED_DEEP_GRANITE_BRICKS);
                offerSlabRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_DEEP_GRANITE_BRICKS_SLAB, ModBlocks.POLISHED_DEEP_GRANITE_BRICKS);
                createStairsRecipe(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS_STAIRS, Ingredient.ofItem(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS))
                        .criterion(hasItem(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS), conditionsFromItem(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS))
                        .offerTo(exporter);

                offerWallRecipe(RecipeCategory.MISC, ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS_WALL, ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS);
                offerSlabRecipe(RecipeCategory.MISC, ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS_SLAB, ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS);
                createStairsRecipe(ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS_STAIRS, Ingredient.ofItem(ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS))
                        .criterion(hasItem(ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS), conditionsFromItem(ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS))
                        .offerTo(exporter);

                offerWallRecipe(RecipeCategory.MISC, ModBlocks.MOSSY_POLISHED_DEEP_GRANITE_BRICKS_WALL, ModBlocks.MOSSY_POLISHED_DEEP_GRANITE_BRICKS);
                offerSlabRecipe(RecipeCategory.MISC, ModBlocks.MOSSY_POLISHED_DEEP_GRANITE_BRICKS_SLAB, ModBlocks.MOSSY_POLISHED_DEEP_GRANITE_BRICKS);
                createStairsRecipe(ModBlocks.MOSSY_POLISHED_DEEP_GRANITE_BRICKS_STAIRS, Ingredient.ofItem(ModBlocks.MOSSY_POLISHED_DEEP_GRANITE_BRICKS))
                        .criterion(hasItem(ModBlocks.MOSSY_POLISHED_DEEP_GRANITE_BRICKS), conditionsFromItem(ModBlocks.MOSSY_POLISHED_DEEP_GRANITE_BRICKS))
                        .offerTo(exporter);



                createShaped(RecipeCategory.MISC, ModBlocks.POLISHED_MARBLE, 4)
                        .pattern("XX ")
                        .pattern("XX ")
                        .pattern("   ")
                        .input('X', ModBlocks.MARBLE)
                        .criterion(hasItem(ModBlocks.MARBLE), conditionsFromItem(ModBlocks.MARBLE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModBlocks.POLISHED_MARBLE_BRICKS, 4)
                        .pattern("XX ")
                        .pattern("XX ")
                        .pattern("   ")
                        .input('X', ModBlocks.POLISHED_MARBLE)
                        .criterion(hasItem(ModBlocks.POLISHED_MARBLE), conditionsFromItem(ModBlocks.POLISHED_MARBLE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModBlocks.CHISELED_POLISHED_MARBLE_BRICKS, 1)
                        .pattern("X  ")
                        .pattern("X  ")
                        .pattern("   ")
                        .input('X', ModBlocks.POLISHED_MARBLE_BRICKS_SLAB)
                        .criterion(hasItem(ModBlocks.POLISHED_MARBLE), conditionsFromItem(ModBlocks.POLISHED_MARBLE))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModBlocks.MOSSY_POLISHED_MARBLE_BRICKS, 1)
                        .input(ModBlocks.POLISHED_MARBLE_BRICKS)
                        .input(Blocks.VINE)
                        .criterion(hasItem(ModBlocks.POLISHED_MARBLE_BRICKS), conditionsFromItem(ModBlocks.POLISHED_MARBLE_BRICKS))
                        .offerTo(exporter,"mossy_marble_from_vine");

                createShapeless(RecipeCategory.MISC, ModBlocks.MOSSY_POLISHED_MARBLE_BRICKS, 1)
                        .input(ModBlocks.POLISHED_MARBLE_BRICKS)
                        .input(Blocks.MOSS_BLOCK)
                        .criterion(hasItem(ModBlocks.POLISHED_MARBLE_BRICKS), conditionsFromItem(ModBlocks.POLISHED_MARBLE_BRICKS))
                        .offerTo(exporter,"mossy_marble_from_moss");

                createButtonRecipe(ModBlocks.MARBLE_BUTTON, Ingredient.ofItem(ModBlocks.MARBLE))
                        .criterion(hasItem(ModBlocks.MARBLE), conditionsFromItem(ModBlocks.MARBLE))
                        .offerTo(exporter);
                offerWallRecipe(RecipeCategory.MISC, ModBlocks.MARBLE_WALL, ModBlocks.MARBLE);
                offerSlabRecipe(RecipeCategory.MISC, ModBlocks.MARBLE_SLAB, ModBlocks.MARBLE);
                createStairsRecipe(ModBlocks.MARBLE_STAIRS, Ingredient.ofItem(ModBlocks.MARBLE))
                        .criterion(hasItem(ModBlocks.MARBLE), conditionsFromItem(ModBlocks.MARBLE))
                        .offerTo(exporter);

                offerPressurePlateRecipe(ModBlocks.POLISHED_MARBLE_PRESSURE_PLATE, ModBlocks.POLISHED_MARBLE);
                offerWallRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_MARBLE_WALL, ModBlocks.POLISHED_MARBLE);
                offerSlabRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_MARBLE_SLAB, ModBlocks.POLISHED_MARBLE);
                createStairsRecipe(ModBlocks.POLISHED_MARBLE_STAIRS, Ingredient.ofItem(ModBlocks.POLISHED_MARBLE))
                        .criterion(hasItem(ModBlocks.POLISHED_MARBLE), conditionsFromItem(ModBlocks.POLISHED_MARBLE))
                        .offerTo(exporter);

                offerWallRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_MARBLE_BRICKS_WALL, ModBlocks.POLISHED_MARBLE_BRICKS);
                offerSlabRecipe(RecipeCategory.MISC, ModBlocks.POLISHED_MARBLE_BRICKS_SLAB, ModBlocks.POLISHED_MARBLE_BRICKS);
                createStairsRecipe(ModBlocks.POLISHED_MARBLE_BRICKS_STAIRS, Ingredient.ofItem(ModBlocks.POLISHED_MARBLE_BRICKS))
                        .criterion(hasItem(ModBlocks.POLISHED_MARBLE_BRICKS), conditionsFromItem(ModBlocks.POLISHED_MARBLE_BRICKS))
                        .offerTo(exporter);

                offerWallRecipe(RecipeCategory.MISC, ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS_WALL, ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS);
                offerSlabRecipe(RecipeCategory.MISC, ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS_SLAB, ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS);
                createStairsRecipe(ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS_STAIRS, Ingredient.ofItem(ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS))
                        .criterion(hasItem(ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS), conditionsFromItem(ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS))
                        .offerTo(exporter);

                offerWallRecipe(RecipeCategory.MISC, ModBlocks.MOSSY_POLISHED_MARBLE_BRICKS_WALL, ModBlocks.MOSSY_POLISHED_MARBLE_BRICKS);
                offerSlabRecipe(RecipeCategory.MISC, ModBlocks.MOSSY_POLISHED_MARBLE_BRICKS_SLAB, ModBlocks.MOSSY_POLISHED_MARBLE_BRICKS);
                createStairsRecipe(ModBlocks.MOSSY_POLISHED_MARBLE_BRICKS_STAIRS, Ingredient.ofItem(ModBlocks.MOSSY_POLISHED_MARBLE_BRICKS))
                        .criterion(hasItem(ModBlocks.MOSSY_POLISHED_MARBLE_BRICKS), conditionsFromItem(ModBlocks.MOSSY_POLISHED_MARBLE_BRICKS))
                        .offerTo(exporter);



                createShapeless(RecipeCategory.MISC, ModBlocks.BLADEWOOD_PLANKS, 4)
                        .input(ModBlocks.BLADEWOOD_LOG)
                        .criterion(hasItem(ModBlocks.BLADEWOOD_LOG), conditionsFromItem(ModBlocks.BLADEWOOD_LOG))
                        .offerTo(exporter,"bw_planks_from_log");
                createShapeless(RecipeCategory.MISC, ModBlocks.BLADEWOOD_PLANKS, 4)
                        .input(ModBlocks.STRIPPED_BLADEWOOD_LOG)
                        .criterion(hasItem(ModBlocks.STRIPPED_BLADEWOOD_LOG), conditionsFromItem(ModBlocks.STRIPPED_BLADEWOOD_LOG))
                        .offerTo(exporter,"bw_planks_from_stripped_log");
                createShapeless(RecipeCategory.MISC, ModBlocks.BLADEWOOD_PLANKS, 4)
                        .input(ModBlocks.BLADEWOOD_WOOD)
                        .criterion(hasItem(ModBlocks.BLADEWOOD_WOOD), conditionsFromItem(ModBlocks.BLADEWOOD_WOOD))
                        .offerTo(exporter,"bw_planks_from_wood");
                createShapeless(RecipeCategory.MISC, ModBlocks.BLADEWOOD_PLANKS, 4)
                        .input(ModBlocks.STRIPPED_BLADEWOOD_WOOD)
                        .criterion(hasItem(ModBlocks.STRIPPED_BLADEWOOD_WOOD), conditionsFromItem(ModBlocks.STRIPPED_BLADEWOOD_WOOD))
                        .offerTo(exporter,"bw_planks_from_stripped_wood");

                createDoorRecipe(ModBlocks.BLADEWOOD_DOOR, Ingredient.ofItem(ModBlocks.BLADEWOOD_PLANKS))
                        .criterion(hasItem(ModBlocks.BLADEWOOD_PLANKS), conditionsFromItem(ModBlocks.BLADEWOOD_PLANKS))
                        .offerTo(exporter);

                createTrapdoorRecipe(ModBlocks.BLADEWOOD_TRAPDOOR, Ingredient.ofItem(ModBlocks.BLADEWOOD_PLANKS))
                        .criterion(hasItem(ModBlocks.BLADEWOOD_PLANKS), conditionsFromItem(ModBlocks.BLADEWOOD_PLANKS))
                        .offerTo(exporter);

                createButtonRecipe(ModBlocks.BLADEWOOD_BUTTON, Ingredient.ofItem(ModBlocks.BLADEWOOD_PLANKS))
                        .criterion(hasItem(ModBlocks.BLADEWOOD_PLANKS), conditionsFromItem(ModBlocks.BLADEWOOD_PLANKS))
                        .offerTo(exporter);

                offerPressurePlateRecipe(ModBlocks.BLADEWOOD_PRESSURE_PLATE, ModBlocks.BLADEWOOD_PLANKS);
                createFenceRecipe(ModBlocks.BLADEWOOD_FENCE, Ingredient.ofItem(ModBlocks.BLADEWOOD_PLANKS))
                        .criterion(hasItem(ModBlocks.BLADEWOOD_PLANKS), conditionsFromItem(ModBlocks.BLADEWOOD_PLANKS))
                        .offerTo(exporter);

                createFenceGateRecipe(ModBlocks.BLADEWOOD_FENCE_GATE, Ingredient.ofItem(ModBlocks.BLADEWOOD_PLANKS))
                        .criterion(hasItem(ModBlocks.BLADEWOOD_PLANKS), conditionsFromItem(ModBlocks.BLADEWOOD_PLANKS))
                        .offerTo(exporter);

                offerSlabRecipe(RecipeCategory.MISC, ModBlocks.BLADEWOOD_SLAB, ModBlocks.BLADEWOOD_PLANKS);
                createStairsRecipe(ModBlocks.BLADEWOOD_STAIRS, Ingredient.ofItem(ModBlocks.BLADEWOOD_PLANKS))
                        .criterion(hasItem(ModBlocks.BLADEWOOD_PLANKS), conditionsFromItem(ModBlocks.BLADEWOOD_PLANKS))
                        .offerTo(exporter);



                createShaped(RecipeCategory.MISC, ModBlocks.OAK_TABLE, 2)
                        .pattern("WWW")
                        .pattern("X X")
                        .pattern("X X")
                        .input('X', Items.IRON_INGOT)
                        .input('W', Blocks.OAK_PLANKS)
                        .criterion(hasItem(Blocks.OAK_PLANKS), conditionsFromItem(Blocks.OAK_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModBlocks.BIRCH_TABLE, 2)
                        .pattern("WWW")
                        .pattern("X X")
                        .pattern("X X")
                        .input('X', Items.IRON_INGOT)
                        .input('W', Blocks.BIRCH_PLANKS)
                        .criterion(hasItem(Blocks.BIRCH_PLANKS), conditionsFromItem(Blocks.BIRCH_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModBlocks.SPRUCE_TABLE, 2)
                        .pattern("WWW")
                        .pattern("X X")
                        .pattern("X X")
                        .input('X', Items.IRON_INGOT)
                        .input('W', Blocks.SPRUCE_PLANKS)
                        .criterion(hasItem(Blocks.SPRUCE_PLANKS), conditionsFromItem(Blocks.SPRUCE_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModBlocks.JUNGLE_TABLE, 2)
                        .pattern("WWW")
                        .pattern("X X")
                        .pattern("X X")
                        .input('X', Items.IRON_INGOT)
                        .input('W', Blocks.JUNGLE_PLANKS)
                        .criterion(hasItem(Blocks.JUNGLE_PLANKS), conditionsFromItem(Blocks.JUNGLE_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModBlocks.DARK_OAK_TABLE, 2)
                        .pattern("WWW")
                        .pattern("X X")
                        .pattern("X X")
                        .input('X', Items.IRON_INGOT)
                        .input('W', Blocks.DARK_OAK_PLANKS)
                        .criterion(hasItem(Blocks.DARK_OAK_PLANKS), conditionsFromItem(Blocks.DARK_OAK_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModBlocks.ACACIA_TABLE, 2)
                        .pattern("WWW")
                        .pattern("X X")
                        .pattern("X X")
                        .input('X', Items.IRON_INGOT)
                        .input('W', Blocks.ACACIA_PLANKS)
                        .criterion(hasItem(Blocks.ACACIA_PLANKS), conditionsFromItem(Blocks.ACACIA_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModBlocks.CHERRY_TABLE, 2)
                        .pattern("WWW")
                        .pattern("X X")
                        .pattern("X X")
                        .input('X', Items.IRON_INGOT)
                        .input('W', Blocks.CHERRY_PLANKS)
                        .criterion(hasItem(Blocks.CHERRY_PLANKS), conditionsFromItem(Blocks.CHERRY_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModBlocks.MANGROVE_TABLE, 2)
                        .pattern("WWW")
                        .pattern("X X")
                        .pattern("X X")
                        .input('X', Items.IRON_INGOT)
                        .input('W', Blocks.MANGROVE_PLANKS)
                        .criterion(hasItem(Blocks.MANGROVE_PLANKS), conditionsFromItem(Blocks.MANGROVE_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModBlocks.BLADEWOOD_TABLE, 2)
                        .pattern("WWW")
                        .pattern("X X")
                        .pattern("X X")
                        .input('X', Items.IRON_INGOT)
                        .input('W', ModBlocks.BLADEWOOD_PLANKS)
                        .criterion(hasItem(ModBlocks.BLADEWOOD_PLANKS), conditionsFromItem(ModBlocks.BLADEWOOD_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModBlocks.WARPED_TABLE, 2)
                        .pattern("WWW")
                        .pattern("X X")
                        .pattern("X X")
                        .input('X', Items.IRON_INGOT)
                        .input('W', Blocks.WARPED_PLANKS)
                        .criterion(hasItem(Blocks.WARPED_PLANKS), conditionsFromItem(Blocks.WARPED_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModBlocks.CRIMSON_TABLE, 2)
                        .pattern("WWW")
                        .pattern("X X")
                        .pattern("X X")
                        .input('X', Items.IRON_INGOT)
                        .input('W', Blocks.CRIMSON_PLANKS)
                        .criterion(hasItem(Blocks.CRIMSON_PLANKS), conditionsFromItem(Blocks.CRIMSON_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModBlocks.GLASS_TABLE, 2)
                        .pattern("WWW")
                        .pattern("X X")
                        .pattern("X X")
                        .input('X', Items.IRON_INGOT)
                        .input('W', Blocks.GLASS)
                        .criterion(hasItem(Blocks.GLASS), conditionsFromItem(Blocks.GLASS))
                        .offerTo(exporter);



                createShaped(RecipeCategory.MISC, ModBlocks.OAK_CHAIR, 2)
                        .pattern("W  ")
                        .pattern("WW ")
                        .pattern("XX ")
                        .input('X', Items.IRON_INGOT)
                        .input('W', Blocks.OAK_PLANKS)
                        .criterion(hasItem(Blocks.OAK_PLANKS), conditionsFromItem(Blocks.OAK_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModBlocks.BIRCH_CHAIR, 2)
                        .pattern("W  ")
                        .pattern("WW ")
                        .pattern("XX ")
                        .input('X', Items.IRON_INGOT)
                        .input('W', Blocks.BIRCH_PLANKS)
                        .criterion(hasItem(Blocks.BIRCH_PLANKS), conditionsFromItem(Blocks.BIRCH_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModBlocks.SPRUCE_CHAIR, 2)
                        .pattern("W  ")
                        .pattern("WW ")
                        .pattern("XX ")
                        .input('X', Items.IRON_INGOT)
                        .input('W', Blocks.SPRUCE_PLANKS)
                        .criterion(hasItem(Blocks.SPRUCE_PLANKS), conditionsFromItem(Blocks.SPRUCE_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModBlocks.JUNGLE_CHAIR, 2)
                        .pattern("W  ")
                        .pattern("WW ")
                        .pattern("XX ")
                        .input('X', Items.IRON_INGOT)
                        .input('W', Blocks.JUNGLE_PLANKS)
                        .criterion(hasItem(Blocks.JUNGLE_PLANKS), conditionsFromItem(Blocks.JUNGLE_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModBlocks.DARK_OAK_CHAIR, 2)
                        .pattern("W  ")
                        .pattern("WW ")
                        .pattern("XX ")
                        .input('X', Items.IRON_INGOT)
                        .input('W', Blocks.DARK_OAK_PLANKS)
                        .criterion(hasItem(Blocks.DARK_OAK_PLANKS), conditionsFromItem(Blocks.DARK_OAK_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModBlocks.ACACIA_CHAIR, 2)
                        .pattern("W  ")
                        .pattern("WW ")
                        .pattern("XX ")
                        .input('X', Items.IRON_INGOT)
                        .input('W', Blocks.ACACIA_PLANKS)
                        .criterion(hasItem(Blocks.ACACIA_PLANKS), conditionsFromItem(Blocks.ACACIA_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModBlocks.CHERRY_CHAIR, 2)
                        .pattern("W  ")
                        .pattern("WW ")
                        .pattern("XX ")
                        .input('X', Items.IRON_INGOT)
                        .input('W', Blocks.CHERRY_PLANKS)
                        .criterion(hasItem(Blocks.CHERRY_PLANKS), conditionsFromItem(Blocks.CHERRY_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModBlocks.MANGROVE_CHAIR, 2)
                        .pattern("W  ")
                        .pattern("WW ")
                        .pattern("XX ")
                        .input('X', Items.IRON_INGOT)
                        .input('W', Blocks.MANGROVE_PLANKS)
                        .criterion(hasItem(Blocks.MANGROVE_PLANKS), conditionsFromItem(Blocks.MANGROVE_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModBlocks.BLADEWOOD_CHAIR, 2)
                        .pattern("W  ")
                        .pattern("WW ")
                        .pattern("XX ")
                        .input('X', Items.IRON_INGOT)
                        .input('W', ModBlocks.BLADEWOOD_PLANKS)
                        .criterion(hasItem(ModBlocks.BLADEWOOD_PLANKS), conditionsFromItem(ModBlocks.BLADEWOOD_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModBlocks.WARPED_CHAIR, 2)
                        .pattern("W  ")
                        .pattern("WW ")
                        .pattern("XX ")
                        .input('X', Items.IRON_INGOT)
                        .input('W', Blocks.WARPED_PLANKS)
                        .criterion(hasItem(Blocks.WARPED_PLANKS), conditionsFromItem(Blocks.WARPED_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModBlocks.CRIMSON_CHAIR, 2)
                        .pattern("W  ")
                        .pattern("WW ")
                        .pattern("XX ")
                        .input('X', Items.IRON_INGOT)
                        .input('W', Blocks.CRIMSON_PLANKS)
                        .criterion(hasItem(Blocks.CRIMSON_PLANKS), conditionsFromItem(Blocks.CRIMSON_PLANKS))
                        .offerTo(exporter);



                createShaped(RecipeCategory.MISC, ModBlocks.REINFORCED_GLASS, 4)
                        .pattern("PGP")
                        .pattern("GIG")
                        .pattern("PGP")
                        .input('P', ModItems.PLATINUM_INGOT)
                        .input('G', Blocks.GLASS)
                        .input('I', Blocks.IRON_BARS)
                        .criterion(hasItem(ModItems.PLATINUM_INGOT), conditionsFromItem(ModItems.PLATINUM_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModBlocks.REINFORCED_GLASS_PANE, 16)
                        .pattern("   ")
                        .pattern("GGG")
                        .pattern("GGG")
                        .input('G', ModBlocks.REINFORCED_GLASS)
                        .criterion(hasItem(ModBlocks.REINFORCED_GLASS), conditionsFromItem(ModBlocks.REINFORCED_GLASS))
                        .offerTo(exporter);








                createShaped(RecipeCategory.MISC, ModItems.PLATINUM_SWORD, 1)
                        .pattern(" I ")
                        .pattern(" I ")
                        .pattern(" S ")
                        .input('I', ModItems.PLATINUM_INGOT)
                        .input('S', Items.STICK)
                        .criterion(hasItem(ModItems.PLATINUM_INGOT), conditionsFromItem(ModItems.PLATINUM_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.PLATINUM_PICKAXE, 1)
                        .pattern("III")
                        .pattern(" S ")
                        .pattern(" S ")
                        .input('I', ModItems.PLATINUM_INGOT)
                        .input('S', Items.STICK)
                        .criterion(hasItem(ModItems.PLATINUM_INGOT), conditionsFromItem(ModItems.PLATINUM_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.PLATINUM_SHOVEL, 1)
                        .pattern(" I ")
                        .pattern(" S ")
                        .pattern(" S ")
                        .input('I', ModItems.PLATINUM_INGOT)
                        .input('S', Items.STICK)
                        .criterion(hasItem(ModItems.PLATINUM_INGOT), conditionsFromItem(ModItems.PLATINUM_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.PLATINUM_AXE, 1)
                        .pattern(" II")
                        .pattern(" SI")
                        .pattern(" S ")
                        .input('I', ModItems.PLATINUM_INGOT)
                        .input('S', Items.STICK)
                        .criterion(hasItem(ModItems.PLATINUM_INGOT), conditionsFromItem(ModItems.PLATINUM_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.PLATINUM_HOE, 1)
                        .pattern(" II")
                        .pattern(" S ")
                        .pattern(" S ")
                        .input('I', ModItems.PLATINUM_INGOT)
                        .input('S', Items.STICK)
                        .criterion(hasItem(ModItems.PLATINUM_INGOT), conditionsFromItem(ModItems.PLATINUM_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.IRIDIUM_SWORD, 1)
                        .pattern(" I ")
                        .pattern(" I ")
                        .pattern(" S ")
                        .input('I', ModItems.IRIDIUM_INGOT)
                        .input('S', Items.STICK)
                        .criterion(hasItem(ModItems.IRIDIUM_INGOT), conditionsFromItem(ModItems.IRIDIUM_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.IRIDIUM_PICKAXE, 1)
                        .pattern("III")
                        .pattern(" S ")
                        .pattern(" S ")
                        .input('I', ModItems.IRIDIUM_INGOT)
                        .input('S', Items.STICK)
                        .criterion(hasItem(ModItems.IRIDIUM_INGOT), conditionsFromItem(ModItems.IRIDIUM_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.IRIDIUM_SHOVEL, 1)
                        .pattern(" I ")
                        .pattern(" S ")
                        .pattern(" S ")
                        .input('I', ModItems.IRIDIUM_INGOT)
                        .input('S', Items.STICK)
                        .criterion(hasItem(ModItems.IRIDIUM_INGOT), conditionsFromItem(ModItems.IRIDIUM_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.IRIDIUM_AXE, 1)
                        .pattern(" II")
                        .pattern(" SI")
                        .pattern(" S ")
                        .input('I', ModItems.IRIDIUM_INGOT)
                        .input('S', Items.STICK)
                        .criterion(hasItem(ModItems.IRIDIUM_INGOT), conditionsFromItem(ModItems.IRIDIUM_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.IRIDIUM_HOE, 1)
                        .pattern(" II")
                        .pattern(" S ")
                        .pattern(" S ")
                        .input('I', ModItems.IRIDIUM_INGOT)
                        .input('S', Items.STICK)
                        .criterion(hasItem(ModItems.IRIDIUM_INGOT), conditionsFromItem(ModItems.IRIDIUM_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.BLADEWOOD_SWORD, 1)
                        .pattern(" I ")
                        .pattern(" I ")
                        .pattern(" S ")
                        .input('I', ModBlocks.BLADEWOOD_PLANKS)
                        .input('S', Items.STICK)
                        .criterion(hasItem(ModBlocks.BLADEWOOD_PLANKS), conditionsFromItem(ModBlocks.BLADEWOOD_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.BLADEWOOD_PICKAXE, 1)
                        .pattern("III")
                        .pattern(" S ")
                        .pattern(" S ")
                        .input('I', ModBlocks.BLADEWOOD_PLANKS)
                        .input('S', Items.STICK)
                        .criterion(hasItem(ModBlocks.BLADEWOOD_PLANKS), conditionsFromItem(ModBlocks.BLADEWOOD_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.BLADEWOOD_SHOVEL, 1)
                        .pattern(" I ")
                        .pattern(" S ")
                        .pattern(" S ")
                        .input('I', ModBlocks.BLADEWOOD_PLANKS)
                        .input('S', Items.STICK)
                        .criterion(hasItem(ModBlocks.BLADEWOOD_PLANKS), conditionsFromItem(ModBlocks.BLADEWOOD_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.BLADEWOOD_AXE, 1)
                        .pattern(" II")
                        .pattern(" SI")
                        .pattern(" S ")
                        .input('I', ModBlocks.BLADEWOOD_PLANKS)
                        .input('S', Items.STICK)
                        .criterion(hasItem(ModBlocks.BLADEWOOD_PLANKS), conditionsFromItem(ModBlocks.BLADEWOOD_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.BLADEWOOD_HOE, 1)
                        .pattern(" II")
                        .pattern(" S ")
                        .pattern(" S ")
                        .input('I', ModBlocks.BLADEWOOD_PLANKS)
                        .input('S', Items.STICK)
                        .criterion(hasItem(ModBlocks.BLADEWOOD_PLANKS), conditionsFromItem(ModBlocks.BLADEWOOD_PLANKS))
                        .offerTo(exporter);











            }
        };
    }

    @Override
    public String getName() {
        return "SCPcraft Recipes";
    }
}
