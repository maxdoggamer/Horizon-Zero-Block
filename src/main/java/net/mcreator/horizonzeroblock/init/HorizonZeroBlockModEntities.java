
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.horizonzeroblock.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.horizonzeroblock.entity.WatcherEntity;
import net.mcreator.horizonzeroblock.entity.ThunderWarBowEntity;
import net.mcreator.horizonzeroblock.entity.TearBowEntity;
import net.mcreator.horizonzeroblock.entity.TallneckEntity;
import net.mcreator.horizonzeroblock.entity.StriderTamedEntity;
import net.mcreator.horizonzeroblock.entity.StriderEntity;
import net.mcreator.horizonzeroblock.entity.StalkerTamedEntity;
import net.mcreator.horizonzeroblock.entity.StalkerEntity;
import net.mcreator.horizonzeroblock.entity.SnapmawTamedEntity;
import net.mcreator.horizonzeroblock.entity.SnapmawEntity;
import net.mcreator.horizonzeroblock.entity.PrecisionBowEntity;
import net.mcreator.horizonzeroblock.entity.HunterBowEntity;
import net.mcreator.horizonzeroblock.entity.HardBowEntity;
import net.mcreator.horizonzeroblock.entity.FrostWarBowEntity;
import net.mcreator.horizonzeroblock.entity.FireHunterBowEntity;
import net.mcreator.horizonzeroblock.HorizonZeroBlockMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HorizonZeroBlockModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, HorizonZeroBlockMod.MODID);
	public static final RegistryObject<EntityType<FireHunterBowEntity>> FIRE_HUNTER_BOW = register("projectile_fire_hunter_bow",
			EntityType.Builder.<FireHunterBowEntity>of(FireHunterBowEntity::new, MobCategory.MISC).setCustomClientFactory(FireHunterBowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PrecisionBowEntity>> PRECISION_BOW = register("projectile_precision_bow",
			EntityType.Builder.<PrecisionBowEntity>of(PrecisionBowEntity::new, MobCategory.MISC).setCustomClientFactory(PrecisionBowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<HardBowEntity>> HARD_BOW = register("projectile_hard_bow",
			EntityType.Builder.<HardBowEntity>of(HardBowEntity::new, MobCategory.MISC).setCustomClientFactory(HardBowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FrostWarBowEntity>> FROST_WAR_BOW = register("projectile_frost_war_bow",
			EntityType.Builder.<FrostWarBowEntity>of(FrostWarBowEntity::new, MobCategory.MISC).setCustomClientFactory(FrostWarBowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ThunderWarBowEntity>> THUNDER_WAR_BOW = register("projectile_thunder_war_bow",
			EntityType.Builder.<ThunderWarBowEntity>of(ThunderWarBowEntity::new, MobCategory.MISC).setCustomClientFactory(ThunderWarBowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<HunterBowEntity>> HUNTER_BOW = register("projectile_hunter_bow",
			EntityType.Builder.<HunterBowEntity>of(HunterBowEntity::new, MobCategory.MISC).setCustomClientFactory(HunterBowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TearBowEntity>> TEAR_BOW = register("projectile_tear_bow",
			EntityType.Builder.<TearBowEntity>of(TearBowEntity::new, MobCategory.MISC).setCustomClientFactory(TearBowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WatcherEntity>> WATCHER = register("watcher",
			EntityType.Builder.<WatcherEntity>of(WatcherEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(WatcherEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StriderEntity>> STRIDER = register("strider",
			EntityType.Builder.<StriderEntity>of(StriderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(StriderEntity::new)

					.sized(0.6f, 1.7f));
	public static final RegistryObject<EntityType<StriderTamedEntity>> STRIDER_TAMED = register("strider_tamed",
			EntityType.Builder.<StriderTamedEntity>of(StriderTamedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StriderTamedEntity::new)

					.sized(0.6f, 1.7f));
	public static final RegistryObject<EntityType<StalkerEntity>> STALKER = register("stalker",
			EntityType.Builder.<StalkerEntity>of(StalkerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(100)
					.setUpdateInterval(3).setCustomClientFactory(StalkerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StalkerTamedEntity>> STALKER_TAMED = register("stalker_tamed",
			EntityType.Builder.<StalkerTamedEntity>of(StalkerTamedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(100).setUpdateInterval(3).setCustomClientFactory(StalkerTamedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SnapmawEntity>> SNAPMAW = register("snapmaw",
			EntityType.Builder.<SnapmawEntity>of(SnapmawEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(SnapmawEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SnapmawTamedEntity>> SNAPMAW_TAMED = register("snapmaw_tamed",
			EntityType.Builder.<SnapmawTamedEntity>of(SnapmawTamedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SnapmawTamedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TallneckEntity>> TALLNECK = register("tallneck",
			EntityType.Builder.<TallneckEntity>of(TallneckEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TallneckEntity::new).fireImmune().sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			WatcherEntity.init();
			StriderEntity.init();
			StriderTamedEntity.init();
			StalkerEntity.init();
			StalkerTamedEntity.init();
			SnapmawEntity.init();
			SnapmawTamedEntity.init();
			TallneckEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(WATCHER.get(), WatcherEntity.createAttributes().build());
		event.put(STRIDER.get(), StriderEntity.createAttributes().build());
		event.put(STRIDER_TAMED.get(), StriderTamedEntity.createAttributes().build());
		event.put(STALKER.get(), StalkerEntity.createAttributes().build());
		event.put(STALKER_TAMED.get(), StalkerTamedEntity.createAttributes().build());
		event.put(SNAPMAW.get(), SnapmawEntity.createAttributes().build());
		event.put(SNAPMAW_TAMED.get(), SnapmawTamedEntity.createAttributes().build());
		event.put(TALLNECK.get(), TallneckEntity.createAttributes().build());
	}
}
