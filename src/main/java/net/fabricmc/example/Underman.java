package net.fabricmc.example;

import net.minecraft.entity.mob.MobEntityWithAi;
import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public class Underman extends MobEntityWithAi {

    public Underman(EntityType<? extends MobEntityWithAi> entityType, World world) {
        super(entityType, world);
    }

    

}