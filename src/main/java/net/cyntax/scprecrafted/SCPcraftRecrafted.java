package net.cyntax.scprecrafted;

import net.cyntax.scprecrafted.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SCPcraftRecrafted implements ModInitializer {
	public static final String MOD_ID = "scprecrafted";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}