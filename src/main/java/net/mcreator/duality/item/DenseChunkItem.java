
package net.mcreator.duality.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class DenseChunkItem extends Item {
	public DenseChunkItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}