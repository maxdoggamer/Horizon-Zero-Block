
package net.mcreator.horizonzeroblock.world.features.plants;

import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.BlockColumnConfiguration;
import net.minecraft.world.level.levelgen.feature.RandomPatchFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.util.valueproviders.BiasedToBottomInt;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.Holder;
import net.minecraft.core.BlockPos;

import net.mcreator.horizonzeroblock.init.HorizonZeroBlockModBlocks;

import java.util.Set;
import java.util.List;

public class RidgeWoodBrushFeature extends RandomPatchFeature {
	public static RidgeWoodBrushFeature FEATURE = null;
	public static Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new RidgeWoodBrushFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("horizon_zero_block:ridge_wood_brush", FEATURE,
				FeatureUtils.simpleRandomPatchConfiguration(64, PlacementUtils.filtered(Feature.BLOCK_COLUMN,
						BlockColumnConfiguration.simple(BiasedToBottomInt.of(2, 4),
								BlockStateProvider.simple(HorizonZeroBlockModBlocks.RIDGE_WOOD_BRUSH.get())),
						BlockPredicate.allOf(BlockPredicate.ONLY_IN_AIR_PREDICATE,
								BlockPredicate.wouldSurvive(HorizonZeroBlockModBlocks.RIDGE_WOOD_BRUSH.get().defaultBlockState(), BlockPos.ZERO)))));
		PLACED_FEATURE = PlacementUtils.register("horizon_zero_block:ridge_wood_brush", CONFIGURED_FEATURE, List.of(CountPlacement.of(5),
				RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
		return FEATURE;
	}

	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

	public RidgeWoodBrushFeature() {
		super(RandomPatchConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<RandomPatchConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}
}
