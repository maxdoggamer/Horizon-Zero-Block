
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.horizonzeroblock.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

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

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class HorizonZeroBlockModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, HorizonZeroBlockMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> MEDICINAL_BRIGHT_OMEN = register("medicinal_bright_omen", MedicinalBrightOmenFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, MedicinalBrightOmenFeature.GENERATE_BIOMES,
					MedicinalBrightOmenFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MEDICINAL_FRESH_SALVEBRUSH = register("medicinal_fresh_salvebrush",
			MedicinalFreshSalvebrushFeature::feature, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
					MedicinalFreshSalvebrushFeature.GENERATE_BIOMES, MedicinalFreshSalvebrushFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MEDICINAL_GREY_OMEN = register("medicinal_grey_omen", MedicinalGreyOmenFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, MedicinalGreyOmenFeature.GENERATE_BIOMES,
					MedicinalGreyOmenFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MEDICINAL_HINTERGOLD = register("medicinal_hintergold", MedicinalHintergoldFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, MedicinalHintergoldFeature.GENERATE_BIOMES,
					MedicinalHintergoldFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MEDICINAL_OCHREBLOOM = register("medicinal_ochrebloom", MedicinalOchrebloomFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, MedicinalOchrebloomFeature.GENERATE_BIOMES,
					MedicinalOchrebloomFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MEDICINAL_SALVEBRUSH = register("medicinal_salvebrush", MedicinalSalvebrushFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, MedicinalSalvebrushFeature.GENERATE_BIOMES,
					MedicinalSalvebrushFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MEDICINAL_SKYBRUSH = register("medicinal_skybrush", MedicinalSkybrushFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, MedicinalSkybrushFeature.GENERATE_BIOMES,
					MedicinalSkybrushFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MEDICINAL_THAW_OMEN = register("medicinal_thaw_omen", MedicinalThawOmenFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, MedicinalThawOmenFeature.GENERATE_BIOMES,
					MedicinalThawOmenFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MEDICINAL_VALEYS_BRUSH = register("medicinal_valeys_brush", MedicinalValeysBrushFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, MedicinalValeysBrushFeature.GENERATE_BIOMES,
					MedicinalValeysBrushFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MEDICINAL_WATERWEED = register("medicinal_waterweed", MedicinalWaterweedFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, MedicinalWaterweedFeature.GENERATE_BIOMES,
					MedicinalWaterweedFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MEDICINAL_WILD_EMBER = register("medicinal_wild_ember", MedicinalWildEmberFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, MedicinalWildEmberFeature.GENERATE_BIOMES,
					MedicinalWildEmberFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RIDGE_WOOD_BRUSH = register("ridge_wood_brush", RidgeWoodBrushFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, RidgeWoodBrushFeature.GENERATE_BIOMES,
					RidgeWoodBrushFeature::placedFeature));
	public static final RegistryObject<Feature<?>> TALL_FOLLIAGE = register("tall_folliage", TallFolliageFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, TallFolliageFeature.GENERATE_BIOMES, TallFolliageFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
