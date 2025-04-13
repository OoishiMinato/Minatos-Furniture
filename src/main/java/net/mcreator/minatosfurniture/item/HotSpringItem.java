
package net.mcreator.minatosfurniture.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.minatosfurniture.init.MinatoFurnitureModFluids;

public class HotSpringItem extends BucketItem {
	public HotSpringItem() {
		super(MinatoFurnitureModFluids.HOT_SPRING, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
