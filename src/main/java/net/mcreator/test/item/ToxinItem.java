
package net.mcreator.test.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BucketItem;

import net.mcreator.test.init.TestModFluids;

public class ToxinItem extends BucketItem {
	public ToxinItem() {
		super(TestModFluids.TOXIN, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.EPIC).tab(CreativeModeTab.TAB_MISC));
	}
}
