
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.duality.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.duality.item.VoidOreSwordItem;
import net.mcreator.duality.item.VoidOreShovelItem;
import net.mcreator.duality.item.VoidOrePickaxeItem;
import net.mcreator.duality.item.VoidOreItem;
import net.mcreator.duality.item.VoidOreHoeItem;
import net.mcreator.duality.item.VoidOreAxeItem;
import net.mcreator.duality.item.VoidOreArmorItem;
import net.mcreator.duality.item.RawAeroberItem;
import net.mcreator.duality.item.Molten_BarsSwordItem;
import net.mcreator.duality.item.Molten_BarsShovelItem;
import net.mcreator.duality.item.Molten_BarsPickaxeItem;
import net.mcreator.duality.item.Molten_BarsIngotItem;
import net.mcreator.duality.item.Molten_BarsHoeItem;
import net.mcreator.duality.item.Molten_BarsAxeItem;
import net.mcreator.duality.item.Molten_BarsArmorItem;
import net.mcreator.duality.item.MoltenOreChunkItem;
import net.mcreator.duality.item.DenseSwordItem;
import net.mcreator.duality.item.DenseShovelItem;
import net.mcreator.duality.item.DensePickaxeItem;
import net.mcreator.duality.item.DenseIngotItem;
import net.mcreator.duality.item.DenseHoeItem;
import net.mcreator.duality.item.DenseChunkItem;
import net.mcreator.duality.item.DenseAxeItem;
import net.mcreator.duality.item.DenseArmorItem;
import net.mcreator.duality.item.AeroberSwordItem;
import net.mcreator.duality.item.AeroberShovelItem;
import net.mcreator.duality.item.AeroberPickaxeItem;
import net.mcreator.duality.item.AeroberIngotItem;
import net.mcreator.duality.item.AeroberHoeItem;
import net.mcreator.duality.item.AeroberAxeItem;
import net.mcreator.duality.item.AeroberArmorItem;
import net.mcreator.duality.DualityMod;

public class DualityModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DualityMod.MODID);
	public static final RegistryObject<Item> AEROBER_INGOT = REGISTRY.register("aerober_ingot", () -> new AeroberIngotItem());
	public static final RegistryObject<Item> AEROBER_ORE = block(DualityModBlocks.AEROBER_ORE);
	public static final RegistryObject<Item> AEROBER_BLOCK = block(DualityModBlocks.AEROBER_BLOCK);
	public static final RegistryObject<Item> AEROBER_PICKAXE = REGISTRY.register("aerober_pickaxe", () -> new AeroberPickaxeItem());
	public static final RegistryObject<Item> AEROBER_AXE = REGISTRY.register("aerober_axe", () -> new AeroberAxeItem());
	public static final RegistryObject<Item> AEROBER_SWORD = REGISTRY.register("aerober_sword", () -> new AeroberSwordItem());
	public static final RegistryObject<Item> AEROBER_SHOVEL = REGISTRY.register("aerober_shovel", () -> new AeroberShovelItem());
	public static final RegistryObject<Item> AEROBER_HOE = REGISTRY.register("aerober_hoe", () -> new AeroberHoeItem());
	public static final RegistryObject<Item> AEROBER_ARMOR_HELMET = REGISTRY.register("aerober_armor_helmet", () -> new AeroberArmorItem.Helmet());
	public static final RegistryObject<Item> AEROBER_ARMOR_CHESTPLATE = REGISTRY.register("aerober_armor_chestplate", () -> new AeroberArmorItem.Chestplate());
	public static final RegistryObject<Item> AEROBER_ARMOR_LEGGINGS = REGISTRY.register("aerober_armor_leggings", () -> new AeroberArmorItem.Leggings());
	public static final RegistryObject<Item> AEROBER_ARMOR_BOOTS = REGISTRY.register("aerober_armor_boots", () -> new AeroberArmorItem.Boots());
	public static final RegistryObject<Item> RAW_AEROBER = REGISTRY.register("raw_aerober", () -> new RawAeroberItem());
	public static final RegistryObject<Item> DENSE_INGOT = REGISTRY.register("dense_ingot", () -> new DenseIngotItem());
	public static final RegistryObject<Item> DENSE_ORE = block(DualityModBlocks.DENSE_ORE);
	public static final RegistryObject<Item> DENSE_BLOCK = block(DualityModBlocks.DENSE_BLOCK);
	public static final RegistryObject<Item> DENSE_PICKAXE = REGISTRY.register("dense_pickaxe", () -> new DensePickaxeItem());
	public static final RegistryObject<Item> DENSE_AXE = REGISTRY.register("dense_axe", () -> new DenseAxeItem());
	public static final RegistryObject<Item> DENSE_SWORD = REGISTRY.register("dense_sword", () -> new DenseSwordItem());
	public static final RegistryObject<Item> DENSE_SHOVEL = REGISTRY.register("dense_shovel", () -> new DenseShovelItem());
	public static final RegistryObject<Item> DENSE_HOE = REGISTRY.register("dense_hoe", () -> new DenseHoeItem());
	public static final RegistryObject<Item> DENSE_ARMOR_HELMET = REGISTRY.register("dense_armor_helmet", () -> new DenseArmorItem.Helmet());
	public static final RegistryObject<Item> DENSE_ARMOR_CHESTPLATE = REGISTRY.register("dense_armor_chestplate", () -> new DenseArmorItem.Chestplate());
	public static final RegistryObject<Item> DENSE_ARMOR_LEGGINGS = REGISTRY.register("dense_armor_leggings", () -> new DenseArmorItem.Leggings());
	public static final RegistryObject<Item> DENSE_ARMOR_BOOTS = REGISTRY.register("dense_armor_boots", () -> new DenseArmorItem.Boots());
	public static final RegistryObject<Item> VOID_ORE_SHOVEL = REGISTRY.register("void_ore_shovel", () -> new VoidOreShovelItem());
	public static final RegistryObject<Item> MOLTEN_BARS_SHOVEL = REGISTRY.register("molten_bars_shovel", () -> new Molten_BarsShovelItem());
	public static final RegistryObject<Item> VOID_ORE_ARMOR_HELMET = REGISTRY.register("void_ore_armor_helmet", () -> new VoidOreArmorItem.Helmet());
	public static final RegistryObject<Item> VOID_ORE_ARMOR_CHESTPLATE = REGISTRY.register("void_ore_armor_chestplate", () -> new VoidOreArmorItem.Chestplate());
	public static final RegistryObject<Item> VOID_ORE_ARMOR_LEGGINGS = REGISTRY.register("void_ore_armor_leggings", () -> new VoidOreArmorItem.Leggings());
	public static final RegistryObject<Item> VOID_ORE_ARMOR_BOOTS = REGISTRY.register("void_ore_armor_boots", () -> new VoidOreArmorItem.Boots());
	public static final RegistryObject<Item> MOLTEN_ORE_CHUNK = REGISTRY.register("molten_ore_chunk", () -> new MoltenOreChunkItem());
	public static final RegistryObject<Item> VOID_ORE_ORE = block(DualityModBlocks.VOID_ORE_ORE);
	public static final RegistryObject<Item> MOLTEN_BARS_HOE = REGISTRY.register("molten_bars_hoe", () -> new Molten_BarsHoeItem());
	public static final RegistryObject<Item> VOID_ORE_PICKAXE = REGISTRY.register("void_ore_pickaxe", () -> new VoidOrePickaxeItem());
	public static final RegistryObject<Item> MOLTEN_BARS_SWORD = REGISTRY.register("molten_bars_sword", () -> new Molten_BarsSwordItem());
	public static final RegistryObject<Item> MOLTEN_BARS_AXE = REGISTRY.register("molten_bars_axe", () -> new Molten_BarsAxeItem());
	public static final RegistryObject<Item> VOID_ORE = REGISTRY.register("void_ore", () -> new VoidOreItem());
	public static final RegistryObject<Item> VOID_ORE_HOE = REGISTRY.register("void_ore_hoe", () -> new VoidOreHoeItem());
	public static final RegistryObject<Item> DENSE_CHUNK = REGISTRY.register("dense_chunk", () -> new DenseChunkItem());
	public static final RegistryObject<Item> VOID_ORE_AXE = REGISTRY.register("void_ore_axe", () -> new VoidOreAxeItem());
	public static final RegistryObject<Item> VOID_ORE_SWORD = REGISTRY.register("void_ore_sword", () -> new VoidOreSwordItem());
	public static final RegistryObject<Item> MOLTEN_BARS_BLOCK = block(DualityModBlocks.MOLTEN_BARS_BLOCK);
	public static final RegistryObject<Item> MOLTEN_BARS_ARMOR_HELMET = REGISTRY.register("molten_bars_armor_helmet", () -> new Molten_BarsArmorItem.Helmet());
	public static final RegistryObject<Item> MOLTEN_BARS_ARMOR_CHESTPLATE = REGISTRY.register("molten_bars_armor_chestplate", () -> new Molten_BarsArmorItem.Chestplate());
	public static final RegistryObject<Item> MOLTEN_BARS_ARMOR_LEGGINGS = REGISTRY.register("molten_bars_armor_leggings", () -> new Molten_BarsArmorItem.Leggings());
	public static final RegistryObject<Item> MOLTEN_BARS_ARMOR_BOOTS = REGISTRY.register("molten_bars_armor_boots", () -> new Molten_BarsArmorItem.Boots());
	public static final RegistryObject<Item> MOLTEN_BARS_PICKAXE = REGISTRY.register("molten_bars_pickaxe", () -> new Molten_BarsPickaxeItem());
	public static final RegistryObject<Item> MOLTEN_BARS_ORE = block(DualityModBlocks.MOLTEN_BARS_ORE);
	public static final RegistryObject<Item> MOLTEN_BARS_INGOT = REGISTRY.register("molten_bars_ingot", () -> new Molten_BarsIngotItem());
	public static final RegistryObject<Item> VOID_ORE_BLOCK = block(DualityModBlocks.VOID_ORE_BLOCK);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
