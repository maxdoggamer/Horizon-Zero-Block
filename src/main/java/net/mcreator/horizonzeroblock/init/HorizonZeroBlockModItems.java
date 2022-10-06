
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.horizonzeroblock.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.horizonzeroblock.item.WireItem;
import net.mcreator.horizonzeroblock.item.ThunderWarBowItem;
import net.mcreator.horizonzeroblock.item.TearblastArrowItem;
import net.mcreator.horizonzeroblock.item.TearBowItem;
import net.mcreator.horizonzeroblock.item.SpearItem;
import net.mcreator.horizonzeroblock.item.SparkerItem;
import net.mcreator.horizonzeroblock.item.ShockArrowItem;
import net.mcreator.horizonzeroblock.item.RidgeWoodItem;
import net.mcreator.horizonzeroblock.item.RepulsionArmorItem;
import net.mcreator.horizonzeroblock.item.PrecisionBowItem;
import net.mcreator.horizonzeroblock.item.PrecisionArrowItem;
import net.mcreator.horizonzeroblock.item.MetalburnerItem;
import net.mcreator.horizonzeroblock.item.MetalburnItem;
import net.mcreator.horizonzeroblock.item.MetalShardsItem;
import net.mcreator.horizonzeroblock.item.MetalBurnLauncherItem;
import net.mcreator.horizonzeroblock.item.MedicinalBerriesItem;
import net.mcreator.horizonzeroblock.item.HunterBowItem;
import net.mcreator.horizonzeroblock.item.HunterArrowItem;
import net.mcreator.horizonzeroblock.item.HardpointArrowItem;
import net.mcreator.horizonzeroblock.item.HardBowItem;
import net.mcreator.horizonzeroblock.item.FrostWarBowItem;
import net.mcreator.horizonzeroblock.item.FreezeArrowItem;
import net.mcreator.horizonzeroblock.item.FireHunterBowItem;
import net.mcreator.horizonzeroblock.item.FireArrowItem;
import net.mcreator.horizonzeroblock.item.EchoShellItem;
import net.mcreator.horizonzeroblock.item.ChillwaterItem;
import net.mcreator.horizonzeroblock.item.BlazeItem;
import net.mcreator.horizonzeroblock.HorizonZeroBlockMod;

public class HorizonZeroBlockModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, HorizonZeroBlockMod.MODID);
	public static final RegistryObject<Item> MEDICINAL_BERRIES = REGISTRY.register("medicinal_berries", () -> new MedicinalBerriesItem());
	public static final RegistryObject<Item> MEDICINAL_BRIGHT_OMEN = block(HorizonZeroBlockModBlocks.MEDICINAL_BRIGHT_OMEN,
			CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> MEDICINAL_FRESH_SALVEBRUSH = block(HorizonZeroBlockModBlocks.MEDICINAL_FRESH_SALVEBRUSH,
			CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> MEDICINAL_GREY_OMEN = block(HorizonZeroBlockModBlocks.MEDICINAL_GREY_OMEN,
			CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> MEDICINAL_HINTERGOLD = block(HorizonZeroBlockModBlocks.MEDICINAL_HINTERGOLD,
			CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> MEDICINAL_OCHREBLOOM = block(HorizonZeroBlockModBlocks.MEDICINAL_OCHREBLOOM,
			CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> MEDICINAL_SALVEBRUSH = block(HorizonZeroBlockModBlocks.MEDICINAL_SALVEBRUSH,
			CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> MEDICINAL_SKYBRUSH = block(HorizonZeroBlockModBlocks.MEDICINAL_SKYBRUSH,
			CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> MEDICINAL_THAW_OMEN = block(HorizonZeroBlockModBlocks.MEDICINAL_THAW_OMEN,
			CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> MEDICINAL_VALEYS_BRUSH = block(HorizonZeroBlockModBlocks.MEDICINAL_VALEYS_BRUSH,
			CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> MEDICINAL_WATERWEED = block(HorizonZeroBlockModBlocks.MEDICINAL_WATERWEED,
			CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> MEDICINAL_WILD_EMBER = block(HorizonZeroBlockModBlocks.MEDICINAL_WILD_EMBER,
			CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> RIDGE_WOOD_BRUSH = block(HorizonZeroBlockModBlocks.RIDGE_WOOD_BRUSH, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> FIRE_HUNTER_BOW = REGISTRY.register("fire_hunter_bow", () -> new FireHunterBowItem());
	public static final RegistryObject<Item> FIRE_ARROW = REGISTRY.register("fire_arrow", () -> new FireArrowItem());
	public static final RegistryObject<Item> PRECISION_BOW = REGISTRY.register("precision_bow", () -> new PrecisionBowItem());
	public static final RegistryObject<Item> PRECISION_ARROW = REGISTRY.register("precision_arrow", () -> new PrecisionArrowItem());
	public static final RegistryObject<Item> HARD_BOW = REGISTRY.register("hard_bow", () -> new HardBowItem());
	public static final RegistryObject<Item> HARDPOINT_ARROW = REGISTRY.register("hardpoint_arrow", () -> new HardpointArrowItem());
	public static final RegistryObject<Item> FROST_WAR_BOW = REGISTRY.register("frost_war_bow", () -> new FrostWarBowItem());
	public static final RegistryObject<Item> FREEZE_ARROW = REGISTRY.register("freeze_arrow", () -> new FreezeArrowItem());
	public static final RegistryObject<Item> THUNDER_WAR_BOW = REGISTRY.register("thunder_war_bow", () -> new ThunderWarBowItem());
	public static final RegistryObject<Item> SHOCK_ARROW = REGISTRY.register("shock_arrow", () -> new ShockArrowItem());
	public static final RegistryObject<Item> HUNTER_BOW = REGISTRY.register("hunter_bow", () -> new HunterBowItem());
	public static final RegistryObject<Item> HUNTER_ARROW = REGISTRY.register("hunter_arrow", () -> new HunterArrowItem());
	public static final RegistryObject<Item> TEAR_BOW = REGISTRY.register("tear_bow", () -> new TearBowItem());
	public static final RegistryObject<Item> TEARBLAST_ARROW = REGISTRY.register("tearblast_arrow", () -> new TearblastArrowItem());
	public static final RegistryObject<Item> RIDGE_WOOD = REGISTRY.register("ridge_wood", () -> new RidgeWoodItem());
	public static final RegistryObject<Item> METAL_SHARDS = REGISTRY.register("metal_shards", () -> new MetalShardsItem());
	public static final RegistryObject<Item> BLAZE = REGISTRY.register("blaze", () -> new BlazeItem());
	public static final RegistryObject<Item> WIRE = REGISTRY.register("wire", () -> new WireItem());
	public static final RegistryObject<Item> CHILLWATER = REGISTRY.register("chillwater", () -> new ChillwaterItem());
	public static final RegistryObject<Item> SPARKER = REGISTRY.register("sparker", () -> new SparkerItem());
	public static final RegistryObject<Item> METALBURN = REGISTRY.register("metalburn", () -> new MetalburnItem());
	public static final RegistryObject<Item> ECHO_SHELL = REGISTRY.register("echo_shell", () -> new EchoShellItem());
	public static final RegistryObject<Item> WATCHER = REGISTRY.register("watcher_spawn_egg",
			() -> new ForgeSpawnEggItem(HorizonZeroBlockModEntities.WATCHER, -16763905, -10066330,
					new Item.Properties().tab(HorizonZeroBlockModTabs.TAB_MACHINES)));
	public static final RegistryObject<Item> STRIDER = REGISTRY.register("strider_spawn_egg",
			() -> new ForgeSpawnEggItem(HorizonZeroBlockModEntities.STRIDER, -13369345, -13369600,
					new Item.Properties().tab(HorizonZeroBlockModTabs.TAB_MACHINES)));
	public static final RegistryObject<Item> STALKER = REGISTRY.register("stalker_spawn_egg",
			() -> new ForgeSpawnEggItem(HorizonZeroBlockModEntities.STALKER, -6710887, -3355444,
					new Item.Properties().tab(HorizonZeroBlockModTabs.TAB_MACHINES)));
	public static final RegistryObject<Item> SNAPMAW = REGISTRY.register("snapmaw_spawn_egg",
			() -> new ForgeSpawnEggItem(HorizonZeroBlockModEntities.SNAPMAW, -39424, -16777012,
					new Item.Properties().tab(HorizonZeroBlockModTabs.TAB_MACHINES)));
	public static final RegistryObject<Item> TALLNECK = REGISTRY.register("tallneck_spawn_egg",
			() -> new ForgeSpawnEggItem(HorizonZeroBlockModEntities.TALLNECK, -6710887, -39424,
					new Item.Properties().tab(HorizonZeroBlockModTabs.TAB_MACHINES)));
	public static final RegistryObject<Item> GLINTHAWK = REGISTRY.register("glinthawk_spawn_egg",
			() -> new ForgeSpawnEggItem(HorizonZeroBlockModEntities.GLINTHAWK, -16777012, -16777216,
					new Item.Properties().tab(HorizonZeroBlockModTabs.TAB_MACHINES)));
	public static final RegistryObject<Item> CORRUPTOR = REGISTRY.register("corruptor_spawn_egg",
			() -> new ForgeSpawnEggItem(HorizonZeroBlockModEntities.CORRUPTOR, -65536, -3407872,
					new Item.Properties().tab(HorizonZeroBlockModTabs.TAB_MACHINES)));
	public static final RegistryObject<Item> SPEAR = REGISTRY.register("spear", () -> new SpearItem());
	public static final RegistryObject<Item> METAL_BURN_LAUNCHER = REGISTRY.register("metal_burn_launcher", () -> new MetalBurnLauncherItem());
	public static final RegistryObject<Item> METALBURNER = REGISTRY.register("metalburner", () -> new MetalburnerItem());
	public static final RegistryObject<Item> SCRAP_PILE = block(HorizonZeroBlockModBlocks.SCRAP_PILE, CreativeModeTab.TAB_MISC);
	public static final RegistryObject<Item> SCRAPPER = REGISTRY.register("scrapper_spawn_egg",
			() -> new ForgeSpawnEggItem(HorizonZeroBlockModEntities.SCRAPPER, -6710887, -3381760,
					new Item.Properties().tab(HorizonZeroBlockModTabs.TAB_MACHINES)));
	public static final RegistryObject<Item> TALL_FOLLIAGE = doubleBlock(HorizonZeroBlockModBlocks.TALL_FOLLIAGE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> REPULSION_ARMOR_CHESTPLATE = REGISTRY.register("repulsion_armor_chestplate",
			() -> new RepulsionArmorItem.Chestplate());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
