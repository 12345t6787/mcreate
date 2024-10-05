
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.minecraft.item.Clock18Item;
import net.mcreator.minecraft.Minecraft3Mod;

public class Minecraft3ModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, Minecraft3Mod.MODID);
	public static final RegistryObject<Item> CLOCK_18 = REGISTRY.register("clock_18", () -> new Clock18Item());
}
