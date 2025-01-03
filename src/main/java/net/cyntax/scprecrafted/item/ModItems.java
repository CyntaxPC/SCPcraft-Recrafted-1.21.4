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










    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SCPcraftRecrafted.LOGGER.info("Registering modded items for " + SCPcraftRecrafted.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries ->{
            fabricItemGroupEntries.add(BLISTER_STEEL_INGOT);
        } );
    }
}
