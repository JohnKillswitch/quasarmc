package net.quasarmc.quasarmc.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

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
