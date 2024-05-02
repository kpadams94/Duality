
package net.mcreator.duality.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class VoidOreSwordItem extends SwordItem {
	public VoidOreSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 441;
			}

			public float getSpeed() {
				return 8f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 21;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DualityModItems.VOID_ORE.get()));
			}
		}, 3, 1f, new Item.Properties());
	}
}
