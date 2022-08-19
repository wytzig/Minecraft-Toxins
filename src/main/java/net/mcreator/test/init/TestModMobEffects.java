
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.test.potion.ToxineffectMobEffect;
import net.mcreator.test.TestMod;

public class TestModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, TestMod.MODID);
	public static final RegistryObject<MobEffect> TOXINEFFECT = REGISTRY.register("toxineffect", () -> new ToxineffectMobEffect());
}
