
package net.quasarmc.quasarmc.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class YhItem extends Item {
	public YhItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
