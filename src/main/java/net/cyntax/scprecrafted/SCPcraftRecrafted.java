package net.cyntax.scprecrafted;

import net.cyntax.scprecrafted.block.ModBlocks;
import net.cyntax.scprecrafted.entity.ModEntities;
import net.cyntax.scprecrafted.item.ModItemGroups;
import net.cyntax.scprecrafted.item.ModItems;
import net.cyntax.scprecrafted.sound.ModSounds;
import net.cyntax.scprecrafted.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SCPcraftRecrafted implements ModInitializer {
	public static final String MOD_ID = "scprecrafted";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModWorldGeneration.generateModWorldGen();
		ModSounds.registerSounds();
		ModEntities.registerModEntities();

		StrippableBlockRegistry.register(ModBlocks.BLADEWOOD_LOG, ModBlocks.STRIPPED_BLADEWOOD_LOG);
		StrippableBlockRegistry.register(ModBlocks.BLADEWOOD_WOOD, ModBlocks.STRIPPED_BLADEWOOD_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLADEWOOD_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLADEWOOD_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_BLADEWOOD_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_BLADEWOOD_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLADEWOOD_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLADEWOOD_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLADEWOOD_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLADEWOOD_DOOR, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLADEWOOD_TRAPDOOR, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLADEWOOD_LEAVES, 30, 60);
	}


}