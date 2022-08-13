
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

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			WatcherEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(WATCHER.get(), WatcherEntity.createAttributes().build());
	}
}
