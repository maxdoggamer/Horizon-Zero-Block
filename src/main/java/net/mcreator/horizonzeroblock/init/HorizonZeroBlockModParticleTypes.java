
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.horizonzeroblock.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.horizonzeroblock.HorizonZeroBlockMod;

public class HorizonZeroBlockModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES,
			HorizonZeroBlockMod.MODID);
	public static final RegistryObject<SimpleParticleType> SPARK = REGISTRY.register("spark", () -> new SimpleParticleType(false));
}
