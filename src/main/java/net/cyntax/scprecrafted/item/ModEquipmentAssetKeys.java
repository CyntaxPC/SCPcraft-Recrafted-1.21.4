package net.cyntax.scprecrafted.item;

import net.cyntax.scprecrafted.SCPcraftRecrafted;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModEquipmentAssetKeys {
    private static final RegistryKey<? extends Registry<EquipmentAsset>> REGISTRY_KEY = RegistryKey.ofRegistry(Identifier.ofVanilla("equipment_asset"));
    public static final RegistryKey<EquipmentAsset> PLATINUM = of("platinum");
    public static final RegistryKey<EquipmentAsset> IRIDIUM = of("iridium");

    private static RegistryKey<EquipmentAsset> of(String name) {
        return RegistryKey.of(REGISTRY_KEY, Identifier.of(SCPcraftRecrafted.MOD_ID, name));
    }
}