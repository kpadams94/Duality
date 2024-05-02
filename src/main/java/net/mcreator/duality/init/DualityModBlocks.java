
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.duality.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.duality.block.VoidOreOreBlock;
import net.mcreator.duality.block.VoidOreBlockBlock;
import net.mcreator.duality.block.TestiesBlock;
import net.mcreator.duality.block.TestBlock1Block;
import net.mcreator.duality.block.Molten_BarsOreBlock;
import net.mcreator.duality.block.Molten_BarsBlockBlock;
import net.mcreator.duality.block.DenseOreBlock;
import net.mcreator.duality.block.DenseBlockBlock;
import net.mcreator.duality.block.AeroberOreBlock;
import net.mcreator.duality.block.AeroberBlockBlock;
import net.mcreator.duality.DualityMod;

public class DualityModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DualityMod.MODID);
	public static final RegistryObject<Block> AEROBER_ORE = REGISTRY.register("aerober_ore", () -> new AeroberOreBlock());
	public static final RegistryObject<Block> AEROBER_BLOCK = REGISTRY.register("aerober_block", () -> new AeroberBlockBlock());
	public static final RegistryObject<Block> DENSE_ORE = REGISTRY.register("dense_ore", () -> new DenseOreBlock());
	public static final RegistryObject<Block> DENSE_BLOCK = REGISTRY.register("dense_block", () -> new DenseBlockBlock());
	public static final RegistryObject<Block> MOLTEN_BARS_ORE = REGISTRY.register("molten_bars_ore", () -> new Molten_BarsOreBlock());
	public static final RegistryObject<Block> MOLTEN_BARS_BLOCK = REGISTRY.register("molten_bars_block", () -> new Molten_BarsBlockBlock());
	public static final RegistryObject<Block> VOID_ORE_ORE = REGISTRY.register("void_ore_ore", () -> new VoidOreOreBlock());
	public static final RegistryObject<Block> VOID_ORE_BLOCK = REGISTRY.register("void_ore_block", () -> new VoidOreBlockBlock());
	public static final RegistryObject<Block> TEST_BLOCK_1 = REGISTRY.register("test_block_1", () -> new TestBlock1Block());
	public static final RegistryObject<Block> TESTIES = REGISTRY.register("testies", () -> new TestiesBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
