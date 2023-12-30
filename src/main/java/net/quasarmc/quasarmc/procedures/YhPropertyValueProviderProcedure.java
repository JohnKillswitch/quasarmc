package net.quasarmc.quasarmc.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class YhPropertyValueProviderProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.isShiftKeyDown()) {
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_SPEED).setBaseValue(15);
			return true;
		}
		return false;
	}
}
