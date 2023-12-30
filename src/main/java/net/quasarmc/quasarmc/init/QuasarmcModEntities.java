
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.quasarmc.quasarmc.init;

import net.quasarmc.quasarmc.entity.SpermaEntity;
import net.quasarmc.quasarmc.QuasarmcMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class QuasarmcModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, QuasarmcMod.MODID);
	public static final RegistryObject<EntityType<SpermaEntity>> SPERMA = register("projectile_sperma",
			EntityType.Builder.<SpermaEntity>of(SpermaEntity::new, MobCategory.MISC).setCustomClientFactory(SpermaEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}
}
