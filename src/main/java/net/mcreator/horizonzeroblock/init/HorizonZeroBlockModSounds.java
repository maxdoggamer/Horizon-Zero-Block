
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.horizonzeroblock.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.horizonzeroblock.HorizonZeroBlockMod;

public class HorizonZeroBlockModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, HorizonZeroBlockMod.MODID);
	public static final RegistryObject<SoundEvent> SOUNDBLAST = REGISTRY.register("soundblast", () -> new SoundEvent(new ResourceLocation("horizon_zero_block", "soundblast")));
}
