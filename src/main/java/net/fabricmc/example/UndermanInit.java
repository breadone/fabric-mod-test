package net.fabricmc.example;

import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.EntityType;
import net.minecraft.util.registry.Registry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.util.Identifier;
import net.minecraft.entity.EntityCategory;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.mob.MobEntity;


public class UndermanInit implements ModInitializer{

    public static final EntityType<postnutclarity> PNC = Registry.register(
        Registry.ENTITY_TYPE,
        new Identifier("entitytesting", "underman"),
        FabricEntityTypeBuilder.create(EntityCategory.MONSTER, postnutclarity::new).dimensions(EntityDimensions.fixed(3f, 1f)).build()
);

@Override
public void onInitialize() {
    FabricDefaultAttributeRegistry.register(PNC, postnutclarity.createMobAttributes());
}


}