
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.horizonzeroblock.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.horizonzeroblock.world.features.plants.TallFolliageFeature;
import net.mcreator.horizonzeroblock.world.features.plants.RidgeWoodBrushFeature;
import net.mcreator.horizonzeroblock.world.features.plants.MedicinalWildEmberFeature;
import net.mcreator.horizonzeroblock.world.features.plants.MedicinalWaterweedFeature;
import net.mcreator.horizonzeroblock.world.features.plants.MedicinalValeysBrushFeature;
import net.mcreator.horizonzeroblock.world.features.plants.MedicinalThawOmenFeature;
import net.mcreator.horizonzeroblock.world.features.plants.MedicinalSkybrushFeature;
import net.mcreator.horizonzeroblock.world.features.plants.MedicinalSalvebrushFeature;
import net.mcreator.horizonzeroblock.world.features.plants.MedicinalOchrebloomFeature;
import net.mcreator.horizonzeroblock.world.features.plants.MedicinalHintergoldFeature;
import net.mcreator.horizonzeroblock.world.features.plants.MedicinalGreyOmenFeature;
import net.mcreator.horizonzeroblock.world.features.plants.MedicinalFreshSalvebrushFeature;
import net.mcreator.horizonzeroblock.world.features.plants.MedicinalBrightOmenFeature;
import net.mcreator.horizonzeroblock.HorizonZeroBlockMod;

@Mod.EventBusSubscriber
public class HorizonZeroBlockModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, HorizonZeroBlockMod.MODID);
	public static final RegistryObject<Feature<?>> MEDICINAL_BRIGHT_OMEN = REGISTRY.register("medicinal_bright_omen", MedicinalBrightOmenFeature::feature);
	public static final RegistryObject<Feature<?>> MEDICINAL_FRESH_SALVEBRUSH = REGISTRY.register("medicinal_fresh_salvebrush", MedicinalFreshSalvebrushFeature::feature);
	public static final RegistryObject<Feature<?>> MEDICINAL_GREY_OMEN = REGISTRY.register("medicinal_grey_omen", MedicinalGreyOmenFeature::feature);
	public static final RegistryObject<Feature<?>> MEDICINAL_HINTERGOLD = REGISTRY.register("medicinal_hintergold", MedicinalHintergoldFeature::feature);
	public static final RegistryObject<Feature<?>> MEDICINAL_OCHREBLOOM = REGISTRY.register("medicinal_ochrebloom", MedicinalOchrebloomFeature::feature);
	public static final RegistryObject<Feature<?>> MEDICINAL_SALVEBRUSH = REGISTRY.register("medicinal_salvebrush", MedicinalSalvebrushFeature::feature);
	public static final RegistryObject<Feature<?>> MEDICINAL_SKYBRUSH = REGISTRY.register("medicinal_skybrush", MedicinalSkybrushFeature::feature);
	public static final RegistryObject<Feature<?>> MEDICINAL_THAW_OMEN = REGISTRY.register("medicinal_thaw_omen", MedicinalThawOmenFeature::feature);
	public static final RegistryObject<Feature<?>> MEDICINAL_VALEYS_BRUSH = REGISTRY.register("medicinal_valeys_brush", MedicinalValeysBrushFeature::feature);
	public static final RegistryObject<Feature<?>> MEDICINAL_WATERWEED = REGISTRY.register("medicinal_waterweed", MedicinalWaterweedFeature::feature);
	public static final RegistryObject<Feature<?>> MEDICINAL_WILD_EMBER = REGISTRY.register("medicinal_wild_ember", MedicinalWildEmberFeature::feature);
	public static final RegistryObject<Feature<?>> RIDGE_WOOD_BRUSH = REGISTRY.register("ridge_wood_brush", RidgeWoodBrushFeature::feature);
	public static final RegistryObject<Feature<?>> TALL_FOLLIAGE = REGISTRY.register("tall_folliage", TallFolliageFeature::feature);
}
