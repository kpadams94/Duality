
package net.mcreator.duality.item;

import java.util.function.Consumer;
import net.minecraft.client.model.Model;

public abstract class Molten_BarsArmorItem extends ArmorItem {

	public Molten_BarsArmorItem(ArmorItem.Type type, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(ArmorItem.Type type) {
				return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 18;
			}

			@Override
			public int getDefenseForType(ArmorItem.Type type) {
				return new int[]{2, 6, 7, 2}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 11;
			}

			@Override
			public SoundEvent getEquipSound() {
				return SoundEvents.EMPTY;
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DualityModItems.DELETED_MOD_ELEMENT.get()));
			}

			@Override
			public String getName() {
				return "molten_bars_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, type, properties);
	}

	public static class Helmet extends Molten_BarsArmorItem {

		public Helmet() {
			super(ArmorItem.Type.HELMET, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "duality:textures/models/armor/molten_bars_layer_1.png";
		}

	}

	public static class Chestplate extends Molten_BarsArmorItem {

		public Chestplate() {
			super(ArmorItem.Type.CHESTPLATE, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "duality:textures/models/armor/molten_bars_layer_1.png";
		}

	}

	public static class Leggings extends Molten_BarsArmorItem {

		public Leggings() {
			super(ArmorItem.Type.LEGGINGS, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "duality:textures/models/armor/molten_bars_layer_2.png";
		}

	}

	public static class Boots extends Molten_BarsArmorItem {

		public Boots() {
			super(ArmorItem.Type.BOOTS, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "duality:textures/models/armor/molten_bars_layer_1.png";
		}

	}

}
