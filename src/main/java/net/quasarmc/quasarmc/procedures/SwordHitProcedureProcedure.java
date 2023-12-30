package net.quasarmc.quasarmc.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.registries.Registries;

public class SwordHitProcedureProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity, ItemStack itemstack) {
		if (entity == null || sourceentity == null)
			return;
		double total_damage = 0;
		if (itemstack.getOrCreateTag().getDouble("PveDamage") != 0 && !(entity instanceof Player)) {
			total_damage = total_damage + itemstack.getOrCreateTag().getDouble("PveDamage");
		}
		if (itemstack.getOrCreateTag().getDouble("PvpDamage") != 0 && entity instanceof Player) {
			total_damage = total_damage + itemstack.getOrCreateTag().getDouble("PvpDamage");
		}
		if (itemstack.getOrCreateTag().getDouble("CritChance") != 0) {
			if (Mth.nextDouble(RandomSource.create(), 1, 100) <= itemstack.getOrCreateTag().getDouble("CritChance")) {
				total_damage = total_damage + (((LivingEntity) sourceentity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE).getValue() / 100) * itemstack.getOrCreateTag().getDouble("CritDamage")
						+ ((LivingEntity) sourceentity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE).getValue();
			}
		}
		if (itemstack.getOrCreateTag().getDouble("Vampirism") != 0) {
			if (sourceentity instanceof LivingEntity _entity)
				_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + (total_damage / 100) * itemstack.getOrCreateTag().getDouble("Vampirism")));
		}
		entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.PLAYER_ATTACK)), (float) total_damage);
	}
}
