
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.horizonzeroblock.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class HorizonZeroBlockModTabs {
	public static CreativeModeTab TAB_RANGED_ITEMS;
	public static CreativeModeTab TAB_MACHINES;

	public static void load() {
		TAB_RANGED_ITEMS = new CreativeModeTab("tabranged_items") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(HorizonZeroBlockModItems.FIRE_ARROW.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_MACHINES = new CreativeModeTab("tabmachines") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(HorizonZeroBlockModItems.SPARKER.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
