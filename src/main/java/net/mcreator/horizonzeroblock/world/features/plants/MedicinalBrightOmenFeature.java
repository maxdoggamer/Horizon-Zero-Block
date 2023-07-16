
package net.mcreator.horizonzeroblock.world.features.plants;

import com.mojang.serialization.Codec;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

public class MedicinalBrightOmenFeature extends RandomPatchFeature {

	public static MedicinalBrightOmenFeature FEATURE = null;
	public static Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new MedicinalBrightOmenFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("horizon_zero_block:medicinal_bright_omen", FEATURE,
				FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(HorizonZeroBlockModBlocks.MEDICINAL_BRIGHT_OMEN.get())), List.of(), 64));
		PLACED_FEATURE = PlacementUtils.register("horizon_zero_block:medicinal_bright_omen", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(5), RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
		return FEATURE;
	}

	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

	public MedicinalBrightOmenFeature() {
		super(RandomPatchConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<RandomPatchConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;

		return super.place(context);
	}
}
