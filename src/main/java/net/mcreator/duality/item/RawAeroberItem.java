
package net.mcreator.duality.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RawAeroberItem extends Item {
	public RawAeroberItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
