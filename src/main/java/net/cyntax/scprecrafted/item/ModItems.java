package net.cyntax.scprecrafted.item;

import net.cyntax.scprecrafted.SCPcraftRecrafted;
import net.cyntax.scprecrafted.sound.ModSounds;
import net.minecraft.item.*;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RAW_PLATINUM=registerItem("raw_platinum",new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID,"raw_platinum")))));
    public static final Item PLATINUM_INGOT=registerItem("platinum_ingot",new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID,"platinum_ingot")))));
    public static final Item RAW_IRIDIUM=registerItem("raw_iridium",new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID,"raw_iridium")))));
    public static final Item IRIDIUM_INGOT=registerItem("iridium_ingot",new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID,"iridium_ingot")))));
    public static final Item BLISTER_STEEL_INGOT=registerItem("blister_steel_ingot",new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID,"blister_steel_ingot")))));
    public static final Item IRON_BLAST=registerItem("iron_blast",new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID,"iron_blast")))));



    public static final Item GENDER_SWITCHER_MUSIC_DISC=registerItem("gender_switcher_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.GENDER_SWITCHER_SONG_KEY).maxCount(1)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID,"gender_switcher_music_disc")))));
    public static final Item BURNING_MAN_MUSIC_DISC=registerItem("burning_man_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.BURNING_MAN_SONG_KEY).maxCount(1)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID,"burning_man_music_disc")))));
    public static final Item EYEPODS_MUSIC_DISC=registerItem("eyepods_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.EYEPODS_SONG_KEY).maxCount(1)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID,"eyepods_music_disc")))));
    public static final Item RED_ICE_MUSIC_DISC=registerItem("red_ice_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.RED_ICE_SONG_KEY).maxCount(1)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID,"red_ice_music_disc")))));
    public static final Item SWAMP_WOMAN_MUSIC_DISC=registerItem("swamp_woman_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.SWAMP_WOMAN_SONG_KEY).maxCount(1)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID,"swamp_woman_music_disc")))));
    public static final Item UNSEEN_MOLD_MUSIC_DISC=registerItem("unseen_mold_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.UNSEEN_MOLD_SONG_KEY).maxCount(1)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID,"unseen_mold_music_disc")))));
    public static final Item DARK_FORM_MUSIC_DISC=registerItem("dark_form_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.DARK_FORM_SONG_KEY).maxCount(1)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID,"dark_form_music_disc")))));
    public static final Item TELEKILL_ALLOY_MUSIC_DISC=registerItem("telekill_alloy_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.TELEKILL_ALLOY_SONG_KEY).maxCount(1)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID,"telekill_alloy_music_disc")))));
    public static final Item SKELETON_KEY_MUSIC_DISC=registerItem("skeleton_key_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.SKELETON_KEY_SONG_KEY).maxCount(1)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID,"skeleton_key_music_disc")))));
    public static final Item SUPER_BALL_MUSIC_DISC=registerItem("super_ball_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.SUPER_BALL_SONG_KEY).maxCount(1)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID,"super_ball_music_disc")))));
    public static final Item FOUNTAIN_OF_YOUTH_MUSIC_DISC=registerItem("fountain_of_youth_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.FOUNTAIN_OF_YOUTH_SONG_KEY).maxCount(1)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID,"fountain_of_youth_music_disc")))));
    public static final Item EVERYTHING_TREE_MUSIC_DISC=registerItem("everything_tree_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.EVERYTHING_TREE_SONG_KEY).maxCount(1)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID,"everything_tree_music_disc")))));
    public static final Item REWIND_MAN_MUSIC_DISC=registerItem("rewind_man_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.REWIND_MAN_SONG_KEY).maxCount(1)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID,"rewind_man_music_disc")))));
    public static final Item SONG_OF_GENESIS_MUSIC_DISC=registerItem("song_of_genesis_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.SONG_OF_GENESIS_SONG_KEY).maxCount(1)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID,"song_of_genesis_music_disc")))));
    public static final Item EYE_SPIDERS_MUSIC_DISC=registerItem("eye_spiders_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.EYE_SPIDERS_SONG_KEY).maxCount(1)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID,"eye_spiders_music_disc")))));
    public static final Item LIVING_ROOM_MUSIC_DISC=registerItem("living_room_music_disc", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.LIVING_ROOM_SONG_KEY).maxCount(1)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID,"living_room_music_disc")))));



    public static final Item PLATINUM_SWORD = registerItem("platinum_sword",
            new SwordItem(ModToolMaterials.PLATINUM, 3, -2.4f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID, "platinum_sword")))));
    public static final Item PLATINUM_PICKAXE = registerItem("platinum_pickaxe",
            new PickaxeItem(ModToolMaterials.PLATINUM, 1, -2.8f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID, "platinum_pickaxe")))));
    public static final Item PLATINUM_SHOVEL = registerItem("platinum_shovel",
            new ShovelItem(ModToolMaterials.PLATINUM, 1.5f, -3.0f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID, "platinum_shovel")))));
    public static final Item PLATINUM_AXE = registerItem("platinum_axe",
            new AxeItem(ModToolMaterials.PLATINUM, 6, -3.2f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID, "platinum_axe")))));
    public static final Item PLATINUM_HOE = registerItem("platinum_hoe",
            new HoeItem(ModToolMaterials.PLATINUM, 0, -3f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID, "platinum_hoe")))));

    public static final Item IRIDIUM_SWORD = registerItem("iridium_sword",
            new SwordItem(ModToolMaterials.IRIDIUM, 3, -2.4f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID, "iridium_sword")))));
    public static final Item IRIDIUM_PICKAXE = registerItem("iridium_pickaxe",
            new PickaxeItem(ModToolMaterials.IRIDIUM, 1, -2.8f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID, "iridium_pickaxe")))));
    public static final Item IRIDIUM_SHOVEL = registerItem("iridium_shovel",
            new ShovelItem(ModToolMaterials.IRIDIUM, 1.5f, -3.0f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID, "iridium_shovel")))));
    public static final Item IRIDIUM_AXE = registerItem("iridium_axe",
            new AxeItem(ModToolMaterials.IRIDIUM, 6, -3.2f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID, "iridium_axe")))));
    public static final Item IRIDIUM_HOE = registerItem("iridium_hoe",
            new HoeItem(ModToolMaterials.IRIDIUM, 0, -3f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID, "iridium_hoe")))));

    public static final Item BLADEWOOD_SWORD = registerItem("bladewood_sword",
            new SwordItem(ModToolMaterials.BLADEWOOD, 3, -2.4f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID, "bladewood_sword")))));
    public static final Item BLADEWOOD_PICKAXE = registerItem("bladewood_pickaxe",
            new PickaxeItem(ModToolMaterials.BLADEWOOD, 1, -2.8f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID, "bladewood_pickaxe")))));
    public static final Item BLADEWOOD_SHOVEL = registerItem("bladewood_shovel",
            new ShovelItem(ModToolMaterials.BLADEWOOD, 1.5f, -3.0f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID, "bladewood_shovel")))));
    public static final Item BLADEWOOD_AXE = registerItem("bladewood_axe",
            new AxeItem(ModToolMaterials.BLADEWOOD, 6, -3.2f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID, "bladewood_axe")))));
    public static final Item BLADEWOOD_HOE = registerItem("bladewood_hoe",
            new HoeItem(ModToolMaterials.BLADEWOOD, 0, -3f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID, "bladewood_hoe")))));



    public static final Item PLATINUM_HELMET = registerItem("platinum_helmet",
            new ArmorItem(ModArmorMaterials.PLATINUM_ARMOR_MATERIAL, EquipmentType.HELMET, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID, "platinum_helmet")))
                    .maxDamage(EquipmentType.HELMET.getMaxDamage(22))));
    public static final Item PLATINUM_CHESTPLATE = registerItem("platinum_chestplate",
            new ArmorItem(ModArmorMaterials.PLATINUM_ARMOR_MATERIAL, EquipmentType.CHESTPLATE, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID, "platinum_chestplate")))
                    .maxDamage(EquipmentType.HELMET.getMaxDamage(22))));
    public static final Item PLATINUM_LEGGINGS = registerItem("platinum_leggings",
            new ArmorItem(ModArmorMaterials.PLATINUM_ARMOR_MATERIAL, EquipmentType.LEGGINGS, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID, "platinum_leggings")))
                    .maxDamage(EquipmentType.HELMET.getMaxDamage(22))));
    public static final Item PLATINUM_BOOTS = registerItem("platinum_boots",
            new ArmorItem(ModArmorMaterials.PLATINUM_ARMOR_MATERIAL, EquipmentType.BOOTS, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID, "platinum_boots")))
                    .maxDamage(EquipmentType.HELMET.getMaxDamage(22))));

    public static final Item IRIDIUM_HELMET = registerItem("iridium_helmet",
            new ArmorItem(ModArmorMaterials.IRIDIUM_ARMOR_MATERIAL, EquipmentType.HELMET, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID, "iridium_helmet")))
                    .maxDamage(EquipmentType.HELMET.getMaxDamage(35))));
    public static final Item IRIDIUM_CHESTPLATE = registerItem("iridium_chestplate",
            new ArmorItem(ModArmorMaterials.IRIDIUM_ARMOR_MATERIAL, EquipmentType.CHESTPLATE, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID, "iridium_chestplate")))
                    .maxDamage(EquipmentType.HELMET.getMaxDamage(35))));
    public static final Item IRIDIUM_LEGGINGS = registerItem("iridium_leggings",
            new ArmorItem(ModArmorMaterials.IRIDIUM_ARMOR_MATERIAL, EquipmentType.LEGGINGS, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID, "iridium_leggings")))
                    .maxDamage(EquipmentType.HELMET.getMaxDamage(35))));
    public static final Item IRIDIUM_BOOTS = registerItem("iridium_boots",
            new ArmorItem(ModArmorMaterials.IRIDIUM_ARMOR_MATERIAL, EquipmentType.BOOTS, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID, "iridium_boots")))
                    .maxDamage(EquipmentType.HELMET.getMaxDamage(35))));






    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SCPcraftRecrafted.MOD_ID, name), item);
    }
    public static void registerModItems() {
        SCPcraftRecrafted.LOGGER.info("Registering modded items for " + SCPcraftRecrafted.MOD_ID);
    }
}
