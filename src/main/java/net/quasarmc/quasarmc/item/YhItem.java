
package net.quasarmc.quasarmc.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class YhItem extends Item {
	public YhItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}