
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.horizonzeroblock.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.horizonzeroblock.potion.FreezeMobEffect;
import net.mcreator.horizonzeroblock.HorizonZeroBlockMod;

public class HorizonZeroBlockModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, HorizonZeroBlockMod.MODID);
	public static final RegistryObject<MobEffect> FREEZE = REGISTRY.register("freeze", () -> new FreezeMobEffect());
}
