
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.horizonzeroblock.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.horizonzeroblock.block.TallFolliageBlock;
import net.mcreator.horizonzeroblock.block.ScrapPileBlock;
import net.mcreator.horizonzeroblock.block.RidgeWoodBrushBlock;
import net.mcreator.horizonzeroblock.block.MedicinalWildEmberBlock;
import net.mcreator.horizonzeroblock.block.MedicinalWaterweedBlock;
import net.mcreator.horizonzeroblock.block.MedicinalValeysBrushBlock;
import net.mcreator.horizonzeroblock.block.MedicinalThawOmenBlock;
import net.mcreator.horizonzeroblock.block.MedicinalSkybrushBlock;
import net.mcreator.horizonzeroblock.block.MedicinalSalvebrushBlock;
import net.mcreator.horizonzeroblock.block.MedicinalOchrebloomBlock;
import net.mcreator.horizonzeroblock.block.MedicinalHintergoldBlock;
import net.mcreator.horizonzeroblock.block.MedicinalGreyOmenBlock;
import net.mcreator.horizonzeroblock.block.MedicinalFreshSalvebrushBlock;
import net.mcreator.horizonzeroblock.block.MedicinalBrightOmenBlock;
import net.mcreator.horizonzeroblock.HorizonZeroBlockMod;

public class HorizonZeroBlockModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, HorizonZeroBlockMod.MODID);
	public static final RegistryObject<Block> MEDICINAL_BRIGHT_OMEN = REGISTRY.register("medicinal_bright_omen",
			() -> new MedicinalBrightOmenBlock());
	public static final RegistryObject<Block> MEDICINAL_FRESH_SALVEBRUSH = REGISTRY.register("medicinal_fresh_salvebrush",
			() -> new MedicinalFreshSalvebrushBlock());
	public static final RegistryObject<Block> MEDICINAL_GREY_OMEN = REGISTRY.register("medicinal_grey_omen", () -> new MedicinalGreyOmenBlock());
	public static final RegistryObject<Block> MEDICINAL_HINTERGOLD = REGISTRY.register("medicinal_hintergold", () -> new MedicinalHintergoldBlock());
	public static final RegistryObject<Block> MEDICINAL_OCHREBLOOM = REGISTRY.register("medicinal_ochrebloom", () -> new MedicinalOchrebloomBlock());
	public static final RegistryObject<Block> MEDICINAL_SALVEBRUSH = REGISTRY.register("medicinal_salvebrush", () -> new MedicinalSalvebrushBlock());
	public static final RegistryObject<Block> MEDICINAL_SKYBRUSH = REGISTRY.register("medicinal_skybrush", () -> new MedicinalSkybrushBlock());
	public static final RegistryObject<Block> MEDICINAL_THAW_OMEN = REGISTRY.register("medicinal_thaw_omen", () -> new MedicinalThawOmenBlock());
	public static final RegistryObject<Block> MEDICINAL_VALEYS_BRUSH = REGISTRY.register("medicinal_valeys_brush",
			() -> new MedicinalValeysBrushBlock());
	public static final RegistryObject<Block> MEDICINAL_WATERWEED = REGISTRY.register("medicinal_waterweed", () -> new MedicinalWaterweedBlock());
	public static final RegistryObject<Block> MEDICINAL_WILD_EMBER = REGISTRY.register("medicinal_wild_ember", () -> new MedicinalWildEmberBlock());
	public static final RegistryObject<Block> RIDGE_WOOD_BRUSH = REGISTRY.register("ridge_wood_brush", () -> new RidgeWoodBrushBlock());
	public static final RegistryObject<Block> SCRAP_PILE = REGISTRY.register("scrap_pile", () -> new ScrapPileBlock());
	public static final RegistryObject<Block> TALL_FOLLIAGE = REGISTRY.register("tall_folliage", () -> new TallFolliageBlock());
}
