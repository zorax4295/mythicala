
package net.mcreator.mythicala.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.mythicala.init.MythicalaModSounds;

public class MamusiqueItem extends RecordItem {
	public MamusiqueItem() {
		super(0, MythicalaModSounds.REGISTRY.get(new ResourceLocation("mythicala:close_to_the_sun")),
				new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE));
	}
}
