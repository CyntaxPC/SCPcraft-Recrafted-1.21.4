package net.cyntax.scprecrafted.datagen;

import net.cyntax.scprecrafted.block.ModBlocks;
import net.cyntax.scprecrafted.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
import net.minecraft.client.data.TexturedModel;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLISTER_STEEL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PLATINUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.IRIDIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_POLISHED_DEEP_GRANITE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_POLISHED_MARBLE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool deepGranitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEP_GRANITE);
        BlockStateModelGenerator.BlockTexturePool polishedDeepGranitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_DEEP_GRANITE);
        BlockStateModelGenerator.BlockTexturePool marblePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MARBLE);
        BlockStateModelGenerator.BlockTexturePool polishedMarblePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_MARBLE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_PLATINUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_IRIDIUM_ORE);
        BlockStateModelGenerator.BlockTexturePool polishedDeepGraniteBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool crackedPolishedDeepGraniteBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool mossyPolishedDeepGraniteBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MOSSY_POLISHED_DEEP_GRANITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool polishedMarbleBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_MARBLE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool crackedPolishedMarbleBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool mossyPolishedMarbleBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MOSSY_POLISHED_MARBLE_BRICKS);


        blockStateModelGenerator.registerLog(ModBlocks.BLADEWOOD_LOG).log(ModBlocks.BLADEWOOD_LOG).wood(ModBlocks.BLADEWOOD_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_BLADEWOOD_LOG).log(ModBlocks.STRIPPED_BLADEWOOD_LOG).wood(ModBlocks.STRIPPED_BLADEWOOD_WOOD);
        BlockStateModelGenerator.BlockTexturePool bladewoodPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLADEWOOD_PLANKS);
        blockStateModelGenerator.registerSingleton(ModBlocks.BLADEWOOD_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.BLADEWOOD_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);



        deepGranitePool.stairs(ModBlocks.DEEP_GRANITE_STAIRS);
        deepGranitePool.slab(ModBlocks.DEEP_GRANITE_SLAB);
        deepGranitePool.wall(ModBlocks.DEEP_GRANITE_WALL);
        deepGranitePool.button(ModBlocks.DEEP_GRANITE_BUTTON);

        polishedDeepGranitePool.stairs(ModBlocks.POLISHED_DEEP_GRANITE_STAIRS);
        polishedDeepGranitePool.slab(ModBlocks.POLISHED_DEEP_GRANITE_SLAB);
        polishedDeepGranitePool.wall(ModBlocks.POLISHED_DEEP_GRANITE_WALL);
        polishedDeepGranitePool.pressurePlate(ModBlocks.POLISHED_DEEP_GRANITE_PRESSURE_PLATE);
        polishedDeepGraniteBricksPool.stairs(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS_STAIRS);
        polishedDeepGraniteBricksPool.slab(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS_SLAB);
        polishedDeepGraniteBricksPool.wall(ModBlocks.POLISHED_DEEP_GRANITE_BRICKS_WALL);
        crackedPolishedDeepGraniteBricksPool.stairs(ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS_STAIRS);
        crackedPolishedDeepGraniteBricksPool.slab(ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS_SLAB);
        crackedPolishedDeepGraniteBricksPool.wall(ModBlocks.CRACKED_POLISHED_DEEP_GRANITE_BRICKS_WALL);
        mossyPolishedDeepGraniteBricksPool.stairs(ModBlocks.MOSSY_POLISHED_DEEP_GRANITE_BRICKS_STAIRS);
        mossyPolishedDeepGraniteBricksPool.slab(ModBlocks.MOSSY_POLISHED_DEEP_GRANITE_BRICKS_SLAB);
        mossyPolishedDeepGraniteBricksPool.wall(ModBlocks.MOSSY_POLISHED_DEEP_GRANITE_BRICKS_WALL);

        marblePool.stairs(ModBlocks.MARBLE_STAIRS);
        marblePool.slab(ModBlocks.MARBLE_SLAB);
        marblePool.wall(ModBlocks.MARBLE_WALL);
        marblePool.button(ModBlocks.MARBLE_BUTTON);

        polishedMarblePool.stairs(ModBlocks.POLISHED_MARBLE_STAIRS);
        polishedMarblePool.slab(ModBlocks.POLISHED_MARBLE_SLAB);
        polishedMarblePool.wall(ModBlocks.POLISHED_MARBLE_WALL);
        polishedMarblePool.pressurePlate(ModBlocks.POLISHED_MARBLE_PRESSURE_PLATE);
        polishedMarbleBricksPool.stairs(ModBlocks.POLISHED_MARBLE_BRICKS_STAIRS);
        polishedMarbleBricksPool.slab(ModBlocks.POLISHED_MARBLE_BRICKS_SLAB);
        polishedMarbleBricksPool.wall(ModBlocks.POLISHED_MARBLE_BRICKS_WALL);
        crackedPolishedMarbleBricksPool.stairs(ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS_STAIRS);
        crackedPolishedMarbleBricksPool.slab(ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS_SLAB);
        crackedPolishedMarbleBricksPool.wall(ModBlocks.CRACKED_POLISHED_MARBLE_BRICKS_WALL);
        mossyPolishedMarbleBricksPool.stairs(ModBlocks.MOSSY_POLISHED_MARBLE_BRICKS_STAIRS);
        mossyPolishedMarbleBricksPool.slab(ModBlocks.MOSSY_POLISHED_MARBLE_BRICKS_SLAB);
        mossyPolishedMarbleBricksPool.wall(ModBlocks.MOSSY_POLISHED_MARBLE_BRICKS_WALL);

        bladewoodPool.stairs(ModBlocks.BLADEWOOD_STAIRS);
        bladewoodPool.slab(ModBlocks.BLADEWOOD_SLAB);
        bladewoodPool.fence(ModBlocks.BLADEWOOD_FENCE);
        bladewoodPool.fenceGate(ModBlocks.BLADEWOOD_FENCE_GATE);
        bladewoodPool.button(ModBlocks.BLADEWOOD_BUTTON);
        bladewoodPool.pressurePlate(ModBlocks.BLADEWOOD_PRESSURE_PLATE);

        blockStateModelGenerator.registerDoor(ModBlocks.BLADEWOOD_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.BLADEWOOD_TRAPDOOR);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.BLISTER_STEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_BLAST, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRIDIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.PLATINUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_IRIDIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_PLATINUM, Models.GENERATED);
        itemModelGenerator.register(ModBlocks.BLADEWOOD_SAPLING.asItem(), Models.GENERATED);

    }
}
