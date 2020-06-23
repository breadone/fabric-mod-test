package net.fabricmc.example;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.mixin.object.builder.MaterialBuilderAccessor;
import net.minecraft.util.registry.Registry;
import net.minecraft.item.FoodComponent;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;

public class ExampleMod implements ModInitializer {

	public static final FoodComponent fcMatoSoup = (new FoodComponent.Builder()).hunger(6).saturationModifier(2.4F).meat().build();
	public static final FoodComponent fcCheese = (new FoodComponent.Builder()).hunger(2).saturationModifier(2.4F).meat().build();
	public static final FoodComponent fcblockCheese = (new FoodComponent.Builder()).hunger(3).saturationModifier(2.4F).meat().build();
	
	//public static final MaterialColor;
	//public static final Material cblockCheese = (new Material().METAL;

	public static final Item big_sticc = new Item(new Item.Settings().group(ItemGroup.COMBAT).maxDamage(20));
    public static final Item mato_soup = new Item(new Item.Settings().group(ItemGroup.FOOD).food(fcMatoSoup).maxCount(64));
	public static final Item cheese = new Item(new Item.Settings().group(ItemGroup.FOOD).food(fcCheese));
	//public static final Block blockCheese = new Block(new Block.Settings().of(material));

	@Override
	public void onInitialize() {
		Registry.register(
			Registry.ITEM,
			new Identifier("breadmod:big_sticc"), big_sticc
			);

		Registry.register(
			Registry.ITEM,
			new Identifier("breadmod:mato_soup"), mato_soup
			);

		Registry.register(
			Registry.ITEM,
			new Identifier("breadmod:cheese"), cheese
		);
	} 
}
