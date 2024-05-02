
package net.mcreator.duality.item;

import java.util.function.Consumer;
import net.minecraft.client.model.Model;

public abstract class VoidOreArmorItem extends ArmorItem {

	public VoidOreArmorItem(ArmorItem.Type type, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(ArmorItem.Type type) {
				return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 23;
			}

			@Override
			public int getDefenseForType(ArmorItem.Type type) {
				return new int[]{3, 8, 9, 3}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 14;
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
				return "void_ore_armor";
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

	public static class Helmet extends VoidOreArmorItem {

		public Helmet() {
			super(ArmorItem.Type.HELMET, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "duality:textures/models/armor/voidore_layer_1.png";
		}

	}

	public static class Chestplate extends VoidOreArmorItem {

		public Chestplate() {
			super(ArmorItem.Type.CHESTPLATE, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "duality:textures/models/armor/voidore_layer_1.png";
		}

	}

	public static class Leggings extends VoidOreArmorItem {

		public Leggings() {
			super(ArmorItem.Type.LEGGINGS, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "duality:textures/models/armor/voidore_layer_2.png";
		}

	}

	public static class Boots extends VoidOreArmorItem {

		public Boots() {
			super(ArmorItem.Type.BOOTS, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "duality:textures/models/armor/voidore_layer_1.png";
		}

	}

}
