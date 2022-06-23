
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mythicala.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.mythicala.block.SolarpannelBlock;
import net.mcreator.mythicala.block.MoteurBlock;
import net.mcreator.mythicala.block.ForgeBlock;
import net.mcreator.mythicala.block.Cableniv1Block;
import net.mcreator.mythicala.block.BatterieBlock;
import net.mcreator.mythicala.MythicalaMod;

public class MythicalaModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MythicalaMod.MODID);
	public static final RegistryObject<Block> FORGE = REGISTRY.register("forge", () -> new ForgeBlock());
	public static final RegistryObject<Block> BATTERIE = REGISTRY.register("batterie", () -> new BatterieBlock());
	public static final RegistryObject<Block> MOTEUR = REGISTRY.register("moteur", () -> new MoteurBlock());
	public static final RegistryObject<Block> SOLARPANNEL = REGISTRY.register("solarpannel", () -> new SolarpannelBlock());
	public static final RegistryObject<Block> CABLENIV_1 = REGISTRY.register("cableniv_1", () -> new Cableniv1Block());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			SolarpannelBlock.registerRenderLayer();
			Cableniv1Block.registerRenderLayer();
		}
	}
}
