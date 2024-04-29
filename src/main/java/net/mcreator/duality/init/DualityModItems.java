
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

import net.mcreator.duality.item.RawAeroberItem;
import net.mcreator.duality.item.DenseSwordItem;
import net.mcreator.duality.item.DenseShovelItem;
import net.mcreator.duality.item.DensePickaxeItem;
import net.mcreator.duality.item.DenseIngotItem;
import net.mcreator.duality.item.DenseHoeItem;
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

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
