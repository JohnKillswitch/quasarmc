
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.quasarmc.quasarmc.init;

import net.quasarmc.quasarmc.item.YhItem;
import net.quasarmc.quasarmc.item.SpermaItem;
import net.quasarmc.quasarmc.QuasarmcMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

public class QuasarmcModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, QuasarmcMod.MODID);
	public static final RegistryObject<Item> SPERMA = REGISTRY.register("sperma", () -> new SpermaItem());
	public static final RegistryObject<Item> YH = REGISTRY.register("yh", () -> new YhItem());
}
