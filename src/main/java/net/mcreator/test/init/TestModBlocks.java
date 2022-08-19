
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.test.block.ToxinwastePortalBlock;
import net.mcreator.test.block.ToxinBlock;
import net.mcreator.test.TestMod;

public class TestModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TestMod.MODID);
	public static final RegistryObject<Block> TOXIN = REGISTRY.register("toxin", () -> new ToxinBlock());
	public static final RegistryObject<Block> TOXINWASTE_PORTAL = REGISTRY.register("toxinwaste_portal", () -> new ToxinwastePortalBlock());
}
