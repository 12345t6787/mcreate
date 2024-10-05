
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraft.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class Minecraft3ModTabs {
	public static CreativeModeTab TAB_MIENCRAFT_3;

	public static void load() {
		TAB_MIENCRAFT_3 = new CreativeModeTab("tabmiencraft_3") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.MUSIC_DISC_5);
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
