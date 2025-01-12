package net.cyntax.scprecrafted.item;

import net.cyntax.scprecrafted.SCPcraftRecrafted;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item BLISTER_STEEL_INGOT=registerItem("blister_steel_ingot",new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID,"blister_steel_ingot")))));
    public static final Item IRON_BLAST=registerItem("iron_blast",new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID,"iron_blast")))));
    public static final Item RAW_PLATINUM=registerItem("raw_platinum",new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID,"raw_platinum")))));
    public static final Item PLATINUM_INGOT=registerItem("platinum_ingot",new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID,"platinum_ingot")))));
    public static final Item RAW_IRIDIUM=registerItem("raw_iridium",new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID,"raw_iridium")))));
    public static final Item IRIDIUM_INGOT=registerItem("iridium_ingot",new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID,"iridium_ingot")))));










    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SCPcraftRecrafted.LOGGER.info("Registering modded items for " + SCPcraftRecrafted.MOD_ID);
    }
}
