package net.cyntax.scprecrafted.world.tree;

import net.cyntax.scprecrafted.SCPcraftRecrafted;
import net.cyntax.scprecrafted.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator BLADEWOOD = new SaplingGenerator(SCPcraftRecrafted.MOD_ID + ":bladewood",
            Optional.empty(), Optional.of(ModConfiguredFeatures.BLADEWOOD_KEY), Optional.empty());
}