package net.cyntax.scprecrafted.item;

import net.cyntax.scprecrafted.SCPcraftRecrafted;
import net.cyntax.scprecrafted.util.ModTags;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;

public class ModArmorMaterials {
    public static final ArmorMaterial PLATINUM_ARMOR_MATERIAL = new ArmorMaterial(25, Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 2);
        map.put(EquipmentType.LEGGINGS, 5);
        map.put(EquipmentType.CHESTPLATE, 5);
        map.put(EquipmentType.HELMET, 2);
        map.put(EquipmentType.BODY, 5);
    }), 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,1,0, ModTags.Items.PLATINUM_REPAIR,
            RegistryKey.of(RegistryKey.ofRegistry(Identifier.ofVanilla("equipment_asset")),Identifier.of(SCPcraftRecrafted.MOD_ID, "platinum")));


    public static final ArmorMaterial IRIDIUM_ARMOR_MATERIAL = new ArmorMaterial(34, Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 3);
        map.put(EquipmentType.LEGGINGS, 5);
        map.put(EquipmentType.CHESTPLATE, 8);
        map.put(EquipmentType.HELMET, 3);
        map.put(EquipmentType.BODY, 8);
    }), 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,2,0.1F, ModTags.Items.IRIDIUM_REPAIR,
            RegistryKey.of(RegistryKey.ofRegistry(Identifier.ofVanilla("equipment_asset")),Identifier.of(SCPcraftRecrafted.MOD_ID, "iridium")));

}