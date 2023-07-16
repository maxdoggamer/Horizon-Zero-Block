
package net.mcreator.horizonzeroblock.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class MedicinalWaterweedBlock extends FlowerBlock {
	public MedicinalWaterweedBlock() {
		super(MobEffects.MOVEMENT_SPEED, 100, BlockBehaviour.Properties.of(Material.PLANT).sound(SoundType.LILY_PAD).instabreak().noCollission());
	}

	@Override
	public int getEffectDuration() {
		return 100;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(HorizonZeroBlockModItems.MEDICINAL_BERRIES.get()));
	}

	@Override
	public PlantType getPlantType(BlockGetter world, BlockPos pos) {
		return PlantType.WATER;
	}
}