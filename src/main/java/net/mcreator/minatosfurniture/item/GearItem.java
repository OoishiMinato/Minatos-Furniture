
package net.mcreator.minatosfurniture.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GearItem extends Item {
	public GearItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
