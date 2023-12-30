package net.quasarmc.quasarmc.procedures;

import net.quasarmc.quasarmc.init.QuasarmcModItems;

import net.minecraft.world.item.ItemStack;

public class SwordCraftedProcedure {
	public static void execute(ItemStack itemstack) {
		if (itemstack.getItem() == QuasarmcModItems.ONEHAND_11.get()) {
			itemstack.getOrCreateTag().putDouble("WalkSpeed", (-0.6));
			itemstack.getOrCreateTag().putDouble("PveDamage", 0);
			itemstack.getOrCreateTag().putDouble("PvpDamage", 0);
			itemstack.getOrCreateTag().putDouble("CritChance", 25);
			itemstack.getOrCreateTag().putDouble("CritDamage", 100);
		}
	}
}
