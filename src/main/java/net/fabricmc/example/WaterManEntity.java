package net.fabricmc.example;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.mob.EndermanEntity;
import net.minecraft.util.Identifier;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.*;
import net.minecraft.entity.EntityCategory;
import net.minecraft.entity.*;
import net.*;
import net.minecraft.util.registry.Registry;


public class WaterManEntity extends EndermanEntity {

    WaterManEntity() {
        //super();
        super(null, null);
    }

    /*
    public static final EntityType<WaterManEntity> WATER_MAN =
    Registry.register(
        Registry.ENTITY_TYPE,
        new Identifier("wiki_entity", "waterman"),
        FabricEntityTypeBuilder.create(EntityCategory.MONSTER,
        (EntityType.EntityFactory<WaterManEntity>) WaterManEntity::new)
    );
    */
}