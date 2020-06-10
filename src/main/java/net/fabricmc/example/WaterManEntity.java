package net.fabricmc.example;

import net.minecraft.entity.mob.EndermanEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.entity.EntityType;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.minecraft.util.Identifier;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityCategory;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.world.World;


public class WaterManEntity extends EndermanEntity {

    WaterManEntity() {
        super(EntityType.ENDERMAN, null);
    }

    
    public static final EntityType<?> WATER_MAN =
     Registry.register(
        Registry.ENTITY_TYPE,
        new Identifier("gamer", "WATER_MAN"),
        FabricEntityTypeBuilder.create(EntityCategory.MONSTER, (EntityType.EntityFactory<WaterManEntity>) WaterManEntity::new).dimensions(EntityDimensions.fixed(1, 3)).build()
    ); 

    public static Item registerEntitySpawnEgg(EntityType<?> type, int c1, int c2) {
        SpawnEggItem item = new SpawnEggItem(type, c1, c2, new Item.Settings().group(ItemGroup.MISC));
        return item;
    }
    
}