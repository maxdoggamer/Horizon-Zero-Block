
package net.mcreator.horizonzeroblock.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class ShockArrowItem extends Item {

	public ShockArrowItem() {
		super(new Item.Properties().tab(HorizonZeroBlockModTabs.TAB_RANGED_ITEMS).stacksTo(20).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

}
