/*
 *    MCreator note:
 *
 *    If you lock base mod element files, you can edit this file and it won't get overwritten.
 *    If you change your modid or package, you need to apply these changes to this file MANUALLY.
 *
 *    Settings in @Mod annotation WON'T be changed in case of the base mod element
 *    files lock too, so you need to set them manually here in such case.
 *
 *    If you do not lock base mod element files in Workspace settings, this file
 *    will be REGENERATED on each build.
 *
 */
package net.mcreator.horizonzeroblock;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;

import net.mcreator.horizonzeroblock.init.HorizonZeroBlockModTabs;
import net.mcreator.horizonzeroblock.init.HorizonZeroBlockModSounds;
import net.mcreator.horizonzeroblock.init.HorizonZeroBlockModParticleTypes;
import net.mcreator.horizonzeroblock.init.HorizonZeroBlockModPaintings;
import net.mcreator.horizonzeroblock.init.HorizonZeroBlockModMobEffects;
import net.mcreator.horizonzeroblock.init.HorizonZeroBlockModMenus;
import net.mcreator.horizonzeroblock.init.HorizonZeroBlockModItems;
import net.mcreator.horizonzeroblock.init.HorizonZeroBlockModFeatures;
import net.mcreator.horizonzeroblock.init.HorizonZeroBlockModEntities;
import net.mcreator.horizonzeroblock.init.HorizonZeroBlockModBlocks;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.AbstractMap;

@Mod("horizon_zero_block")
public class HorizonZeroBlockMod {
	public static final Logger LOGGER = LogManager.getLogger(HorizonZeroBlockMod.class);
	public static final String MODID = "horizon_zero_block";

	public HorizonZeroBlockMod() {
		MinecraftForge.EVENT_BUS.register(this);
		HorizonZeroBlockModTabs.load();
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		HorizonZeroBlockModSounds.REGISTRY.register(bus);
		HorizonZeroBlockModBlocks.REGISTRY.register(bus);
		HorizonZeroBlockModItems.REGISTRY.register(bus);
		HorizonZeroBlockModEntities.REGISTRY.register(bus);

		HorizonZeroBlockModFeatures.REGISTRY.register(bus);
		HorizonZeroBlockModPaintings.REGISTRY.register(bus);
		HorizonZeroBlockModMobEffects.REGISTRY.register(bus);

		HorizonZeroBlockModParticleTypes.REGISTRY.register(bus);
		HorizonZeroBlockModMenus.REGISTRY.register(bus);

	}

	private static final String PROTOCOL_VERSION = "1";
	public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION, PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
	private static int messageID = 0;

	public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder, BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}

	private static final Collection<AbstractMap.SimpleEntry<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue<>();

	public static void queueServerWork(int tick, Runnable action) {
		workQueue.add(new AbstractMap.SimpleEntry(action, tick));
	}

	@SubscribeEvent
	public void tick(TickEvent.ServerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			List<AbstractMap.SimpleEntry<Runnable, Integer>> actions = new ArrayList<>();
			workQueue.forEach(work -> {
				work.setValue(work.getValue() - 1);
				if (work.getValue() == 0)
					actions.add(work);
			});
			actions.forEach(e -> e.getKey().run());
			workQueue.removeAll(actions);
		}
	}
}
