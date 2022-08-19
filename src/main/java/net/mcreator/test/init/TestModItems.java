
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.test.item.ToxinwasteItem;
import net.mcreator.test.item.ToxinItem;
import net.mcreator.test.item.BottleToxinWaxItem;
import net.mcreator.test.item.BottleToxinItem;
import net.mcreator.test.item.AntitoxinleatherItem;
import net.mcreator.test.item.AntitoxinItem;
import net.mcreator.test.item.AntitoxicArmorItem;
import net.mcreator.test.TestMod;

public class TestModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MODID);
	public static final RegistryObject<Item> TOXIN_BUCKET = REGISTRY.register("toxin_bucket", () -> new ToxinItem());
	public static final RegistryObject<Item> BOTTLE_TOXIN = REGISTRY.register("bottle_toxin", () -> new BottleToxinItem());
	public static final RegistryObject<Item> BOTTLE_TOXIN_WAX = REGISTRY.register("bottle_toxin_wax", () -> new BottleToxinWaxItem());
	public static final RegistryObject<Item> ANTITOXIN = REGISTRY.register("antitoxin", () -> new AntitoxinItem());
	public static final RegistryObject<Item> ANTITOXINLEATHER = REGISTRY.register("antitoxinleather", () -> new AntitoxinleatherItem());
	public static final RegistryObject<Item> ANTITOXIC_ARMOR_HELMET = REGISTRY.register("antitoxic_armor_helmet",
			() -> new AntitoxicArmorItem.Helmet());
	public static final RegistryObject<Item> ANTITOXIC_ARMOR_CHESTPLATE = REGISTRY.register("antitoxic_armor_chestplate",
			() -> new AntitoxicArmorItem.Chestplate());
	public static final RegistryObject<Item> ANTITOXIC_ARMOR_LEGGINGS = REGISTRY.register("antitoxic_armor_leggings",
			() -> new AntitoxicArmorItem.Leggings());
	public static final RegistryObject<Item> ANTITOXIC_ARMOR_BOOTS = REGISTRY.register("antitoxic_armor_boots", () -> new AntitoxicArmorItem.Boots());
	public static final RegistryObject<Item> TOXINWASTE = REGISTRY.register("toxinwaste", () -> new ToxinwasteItem());
}
