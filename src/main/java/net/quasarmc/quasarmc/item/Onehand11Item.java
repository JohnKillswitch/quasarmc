
package net.quasarmc.quasarmc.item;

import net.quasarmc.quasarmc.procedures.SwordHitProcedureProcedure;
import net.quasarmc.quasarmc.procedures.SwordCraftedProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;

public class Onehand11Item extends PickaxeItem {
	public Onehand11Item() {
		super(new Tier() {
			public int getUses() {
				return 420;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 4.2f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 1, -3.1f, new Item.Properties());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		SwordHitProcedureProcedure.execute(entity.level(), entity, sourceentity, itemstack);
		return retval;
	}

	@Override
	public void onCraftedBy(ItemStack itemstack, Level world, Player entity) {
		super.onCraftedBy(itemstack, world, entity);
		SwordCraftedProcedure.execute(itemstack);
	}
}
