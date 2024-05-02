
package net.mcreator.duality.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class MoltenOreChunkItem extends Item {
	public MoltenOreChunkItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}