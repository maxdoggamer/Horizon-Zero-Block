
package net.mcreator.horizonzeroblock.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.common.PlantType;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.horizonzeroblock.init.HorizonZeroBlockModItems;

import java.util.List;
import java.util.Collections;

public class MedicinalBrightOmenBlock extends FlowerBlock {
	public MedicinalBrightOmenBlock() {
		super(MobEffects.MOVEMENT_SPEED, 100, BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.GOLD).sound(SoundType.FUNGUS).instabreak()
				.lightLevel(s -> 3).noCollission());
	}

	@Override
	public int getEffectDuration() {
		return 100;
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 100;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 60;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(HorizonZeroBlockModItems.MEDICINAL_BERRIES.get()));
	}

	@Override
	public boolean mayPlaceOn(BlockState groundState, BlockGetter worldIn, BlockPos pos) {
		return groundState.is(Blocks.COBBLESTONE) || groundState.is(Blocks.STONE) || groundState.is(Blocks.ANDESITE) || groundState.is(Blocks.GRANITE)
				|| groundState.is(Blocks.DIORITE);
	}

	@Override
	public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
		BlockPos blockpos = pos.below();
		BlockState groundState = worldIn.getBlockState(blockpos);
		return this.mayPlaceOn(groundState, worldIn, blockpos);
	}

	@Override
	public PlantType getPlantType(BlockGetter world, BlockPos pos) {
		return PlantType.CAVE;
	}
}
