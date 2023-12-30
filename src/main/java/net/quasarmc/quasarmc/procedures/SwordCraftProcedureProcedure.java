package net.quasarmc.quasarmc.procedures;

import net.quasarmc.quasarmc.init.QuasarmcModItems;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.EquipmentSlot;

import java.util.UUID;

public class SwordCraftProcedureProcedure {
	public static void execute(ItemStack itemstack) {
		if (itemstack.getItem() == QuasarmcModItems.ONEHAND_11.get()) {
			itemstack.getOrCreateTag().putDouble("WalkSpeed", 0.5);
			itemstack.getOrCreateTag().putDouble("PveDamage", 0);
			itemstack.getOrCreateTag().putDouble("PvpDamage", 0);
			itemstack.getOrCreateTag().putDouble("CritChance", 25);
			itemstack.getOrCreateTag().putDouble("CritDamage", 100);
		}
		if (itemstack.getOrCreateTag().getDouble("WalkSpeed") != 0) {
			(itemstack).addAttributeModifier(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED,
					(new AttributeModifier(UUID.fromString("16408662-6d2b-48d8-92f0-aae623165bbf"), "additional_walkspeed_hand", (itemstack.getOrCreateTag().getDouble("WalkSpeed")), AttributeModifier.Operation.ADDITION)), EquipmentSlot.MAINHAND);
		}
	}
}
