package net.cyntax.scprecrafted.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BladewoodLeaves extends Block {
    public BladewoodLeaves(Settings settings) {
        super(settings);
    }

    @Override
    protected void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        entity.serverDamage(world.getDamageSources().cactus(), 2.0F);
    }
}
