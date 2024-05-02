
package net.mcreator.duality.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class VoidOreItem extends Item {
	public VoidOreItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
