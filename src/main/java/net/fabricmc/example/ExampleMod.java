package net.fabricmc.example;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.registry.Registry;

public class ExampleMod implements ModInitializer {
	public static final Item test = new Item(new Item.Settings().group(ItemGroup.COMBAT));
	
	@Override
	public void onInitialize() {
		Registry.register(
			Registry.ITEM,
			new Identifier("gamer", "test"), test
			);
	} 
}
