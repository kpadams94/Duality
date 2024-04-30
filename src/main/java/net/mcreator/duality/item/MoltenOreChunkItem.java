
package net.mcreator.duality.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MoltenOreChunkItem extends Item {
	public MoltenOreChunkItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
