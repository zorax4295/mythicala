
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mythicala.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.mythicala.block.entity.SolarpannelBlockEntity;
import net.mcreator.mythicala.block.entity.MoteurBlockEntity;
import net.mcreator.mythicala.block.entity.ForgeBlockEntity;
import net.mcreator.mythicala.block.entity.Cableniv1BlockEntity;
import net.mcreator.mythicala.block.entity.BatterieBlockEntity;
import net.mcreator.mythicala.MythicalaMod;

public class MythicalaModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, MythicalaMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> FORGE = register("forge", MythicalaModBlocks.FORGE, ForgeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BATTERIE = register("batterie", MythicalaModBlocks.BATTERIE, BatterieBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MOTEUR = register("moteur", MythicalaModBlocks.MOTEUR, MoteurBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SOLARPANNEL = register("solarpannel", MythicalaModBlocks.SOLARPANNEL,
			SolarpannelBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLENIV_1 = register("cableniv_1", MythicalaModBlocks.CABLENIV_1,
			Cableniv1BlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
