
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.horizonzeroblock.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.horizonzeroblock.HorizonZeroBlockMod;

public class HorizonZeroBlockModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, HorizonZeroBlockMod.MODID);
	public static final RegistryObject<PaintingVariant> HORIZON_PAINTING = REGISTRY.register("horizon_painting", () -> new PaintingVariant(128, 64));
}
