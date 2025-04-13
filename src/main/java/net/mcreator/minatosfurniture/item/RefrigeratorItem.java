
package net.mcreator.minatosfurniture.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.minatosfurniture.procedures.RefrigeratorburotukuwoYoukuritukusitatokiProcedure;

public class RefrigeratorItem extends Item {
	public RefrigeratorItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		RefrigeratorburotukuwoYoukuritukusitatokiProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getClickedFace(), context.getPlayer(),
				context.getItemInHand());
		return InteractionResult.SUCCESS;
	}
}
