package net.fabricmc.example;

import net.minecraft.entity.mob.EndermanEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.entity.EntityType;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityCategory;
import net.minecraft.entity.EntityDimensions;
//import net.minecraft.entity.EntityType.EntityFactory;


public class WaterManEntity extends EndermanEntity {

    WaterManEntity() {
        super(EntityType.ENDERMAN, null);
    }

    
    public static final EntityType<?> WATER_MAN =
     Registry.register(
        Registry.ENTITY_TYPE,
        new Identifier("gamer", "WATER_MAN"),
        FabricEntityTypeBuilder.create(EntityCategory.MONSTER, (EntityType.EntityFactory<?>) new WaterManEntity()).dimensions(EntityDimensions.fixed(10, 30)).build()
    ); 

    public static Item registerEntitySpawnEgg(EntityType<?> type, int col1, int col2) {
        SpawnEggItem item = new SpawnEggItem(type, col1, col2, new Item.Settings().group(ItemGroup.MISC));
        return item;
    }
    //WaterManEntity
}
