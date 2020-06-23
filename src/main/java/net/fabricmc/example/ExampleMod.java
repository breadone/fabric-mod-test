package net.fabricmc.example;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.util.registry.Registry;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class ExampleMod implements ModInitializer {

	public static final FoodComponent fcMatoSoup = (new FoodComponent.Builder()).hunger(6).saturationModifier(2.4F).meat().build();
	public static final FoodComponent fcCheese = (new FoodComponent.Builder()).hunger(2).saturationModifier(2.4F).meat().build();
	public static final FoodComponent fctato = (new FoodComponent.Builder().hunger(2).saturationModifier(2.4F).meat().build());
	//public static final FoodComponent fcblockCheese = (new FoodComponent.Builder()).hunger(3).saturationModifier(2.4F).meat().build();

	public static final Item big_sticc = new Item(new Item.Settings().group(ItemGroup.COMBAT).maxDamage(20));
    public static final Item mato_soup = new Item(new Item.Settings().group(ItemGroup.FOOD).food(fcMatoSoup).maxCount(64));
	public static final Item cheese = new Item(new Item.Settings().group(ItemGroup.FOOD).food(fcCheese));
	//public static final Block blockCheese = new Block(FabricBlockSettings.of(Material.METAL));
	public static final Item tato = new Item(new Item.Settings().group(ItemGroup.FOOD).food(fctato));

	public static final Block blockCheese = new Block(FabricBlockSettings.of(Material.METAL));

	@Override
	public void onInitialize() {
		Registry.register(
			Registry.ITEM,
			new Identifier("modid:big_sticc"), big_sticc
			);

		Registry.register(
			Registry.ITEM,
			new Identifier("modid:mato_soup"), mato_soup
			);

		Registry.register(
			Registry.ITEM,
			new Identifier("modid:cheese"), cheese
		);

		Registry.register(Registry.BLOCK,
		new Identifier("modid:blockcheese"), blockCheese
		);

		Registry.register(Registry.ITEM,
		new Identifier("modid:blockcheese"),
		new BlockItem(blockCheese, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	} 
}
