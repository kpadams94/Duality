
package net.mcreator.duality.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class Molten_BarsSwordItem extends SwordItem {
	public Molten_BarsSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 323;
			}

			public float getSpeed() {
				return 7f;
			}

			public float getAttackDamageBonus() {
				return 1f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 17;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DualityModItems.DELETED_MOD_ELEMENT.get()));
			}
		}, 3, 0f, new Item.Properties());
	}
}
