
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.duality.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.duality.DualityMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DualityModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DualityMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(DualityModBlocks.AEROBER_BLOCK.get().asItem());
			tabData.accept(DualityModBlocks.DENSE_ORE.get().asItem());
			tabData.accept(DualityModBlocks.DENSE_BLOCK.get().asItem());
			tabData.accept(DualityModBlocks.MOLTEN_BARS_BLOCK.get().asItem());
			tabData.accept(DualityModBlocks.VOID_ORE_ORE.get().asItem());
			tabData.accept(DualityModBlocks.VOID_ORE_BLOCK.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(DualityModItems.AEROBER_SWORD.get());
			tabData.accept(DualityModItems.AEROBER_ARMOR_HELMET.get());
			tabData.accept(DualityModItems.AEROBER_ARMOR_CHESTPLATE.get());
			tabData.accept(DualityModItems.AEROBER_ARMOR_LEGGINGS.get());
			tabData.accept(DualityModItems.AEROBER_ARMOR_BOOTS.get());
			tabData.accept(DualityModItems.DENSE_SWORD.get());
			tabData.accept(DualityModItems.DENSE_ARMOR_HELMET.get());
			tabData.accept(DualityModItems.DENSE_ARMOR_CHESTPLATE.get());
			tabData.accept(DualityModItems.DENSE_ARMOR_LEGGINGS.get());
			tabData.accept(DualityModItems.DENSE_ARMOR_BOOTS.get());
			tabData.accept(DualityModItems.MOLTEN_BARS_SWORD.get());
			tabData.accept(DualityModItems.MOLTEN_BARS_ARMOR_HELMET.get());
			tabData.accept(DualityModItems.MOLTEN_BARS_ARMOR_CHESTPLATE.get());
			tabData.accept(DualityModItems.MOLTEN_BARS_ARMOR_LEGGINGS.get());
			tabData.accept(DualityModItems.MOLTEN_BARS_ARMOR_BOOTS.get());
			tabData.accept(DualityModItems.VOID_ORE_SWORD.get());
			tabData.accept(DualityModItems.VOID_ORE_ARMOR_HELMET.get());
			tabData.accept(DualityModItems.VOID_ORE_ARMOR_CHESTPLATE.get());
			tabData.accept(DualityModItems.VOID_ORE_ARMOR_LEGGINGS.get());
			tabData.accept(DualityModItems.VOID_ORE_ARMOR_BOOTS.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(DualityModItems.AEROBER_INGOT.get());
			tabData.accept(DualityModItems.RAW_AEROBER.get());
			tabData.accept(DualityModItems.DENSE_INGOT.get());
			tabData.accept(DualityModItems.MOLTEN_BARS_INGOT.get());
			tabData.accept(DualityModItems.MOLTEN_ORE_CHUNK.get());
			tabData.accept(DualityModItems.VOID_ORE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(DualityModBlocks.AEROBER_ORE.get().asItem());
			tabData.accept(DualityModBlocks.MOLTEN_BARS_ORE.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(DualityModItems.AEROBER_PICKAXE.get());
			tabData.accept(DualityModItems.AEROBER_AXE.get());
			tabData.accept(DualityModItems.AEROBER_SHOVEL.get());
			tabData.accept(DualityModItems.AEROBER_HOE.get());
			tabData.accept(DualityModItems.DENSE_PICKAXE.get());
			tabData.accept(DualityModItems.DENSE_AXE.get());
			tabData.accept(DualityModItems.DENSE_SHOVEL.get());
			tabData.accept(DualityModItems.DENSE_HOE.get());
			tabData.accept(DualityModItems.MOLTEN_BARS_PICKAXE.get());
			tabData.accept(DualityModItems.MOLTEN_BARS_AXE.get());
			tabData.accept(DualityModItems.MOLTEN_BARS_SHOVEL.get());
			tabData.accept(DualityModItems.MOLTEN_BARS_HOE.get());
			tabData.accept(DualityModItems.VOID_ORE_PICKAXE.get());
			tabData.accept(DualityModItems.VOID_ORE_AXE.get());
			tabData.accept(DualityModItems.VOID_ORE_SHOVEL.get());
			tabData.accept(DualityModItems.VOID_ORE_HOE.get());
		}
	}
}
