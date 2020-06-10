package net.fabricmc.example;

import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.model.EndermanEntityModel;

public class WaterManRenderer extends MobEntityRenderer{
    
    public WaterManRenderer(EntityRenderDispatcher entityRenderDispatcher_1) {
        super(entityRenderDispatcher_1, new EndermanEntityModel<>(), 1);
    }

}