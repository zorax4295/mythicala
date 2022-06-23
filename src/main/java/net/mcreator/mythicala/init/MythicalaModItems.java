
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mythicala.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.mythicala.item.ValiderregleItem;
import net.mcreator.mythicala.item.MamusiqueItem;
import net.mcreator.mythicala.item.FluxioniumItem;
import net.mcreator.mythicala.item.EpeeenfluxiumItem;
import net.mcreator.mythicala.item.DefiducreateurItem;
import net.mcreator.mythicala.MythicalaMod;

public class MythicalaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MythicalaMod.MODID);
	public static final RegistryObject<Item> FLUXIONIUM = REGISTRY.register("fluxionium", () -> new FluxioniumItem());
	public static final RegistryObject<Item> VALIDERREGLE = REGISTRY.register("validerregle", () -> new ValiderregleItem());
	public static final RegistryObject<Item> EPEEENFLUXIUM = REGISTRY.register("epeeenfluxium", () -> new EpeeenfluxiumItem());
	public static final RegistryObject<Item> MAMUSIQUE = REGISTRY.register("mamusique", () -> new MamusiqueItem());
	public static final RegistryObject<Item> FORGE = block(MythicalaModBlocks.FORGE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> DEFIDUCREATEUR = REGISTRY.register("defiducreateur", () -> new DefiducreateurItem());
	public static final RegistryObject<Item> BATTERIE = block(MythicalaModBlocks.BATTERIE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MOTEUR = block(MythicalaModBlocks.MOTEUR, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SOLARPANNEL = block(MythicalaModBlocks.SOLARPANNEL, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CABLENIV_1 = block(MythicalaModBlocks.CABLENIV_1, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
