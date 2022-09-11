
/*
*    MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.horizonzeroblock.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class HorizonZeroBlockModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.TOOLSMITH) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(HorizonZeroBlockModItems.METAL_SHARDS.get(), 20),
					new ItemStack(HorizonZeroBlockModItems.WIRE.get(), 3), new ItemStack(HorizonZeroBlockModItems.HUNTER_BOW.get()), 1, 5, 0.05f));
			event.getTrades().get(2)
					.add(new BasicItemListing(new ItemStack(HorizonZeroBlockModItems.METAL_SHARDS.get(), 35),
							new ItemStack(HorizonZeroBlockModItems.BLAZE.get(), 5), new ItemStack(HorizonZeroBlockModItems.FIRE_HUNTER_BOW.get()), 1,
							5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(HorizonZeroBlockModItems.METAL_SHARDS.get(), 50),
					new ItemStack(HorizonZeroBlockModItems.WIRE.get(), 4), new ItemStack(HorizonZeroBlockModItems.HARD_BOW.get()), 1, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.TOOLSMITH) {
			event.getTrades().get(3)
					.add(new BasicItemListing(new ItemStack(HorizonZeroBlockModItems.METAL_SHARDS.get(), 35),
							new ItemStack(HorizonZeroBlockModItems.SPARKER.get(), 5), new ItemStack(HorizonZeroBlockModItems.THUNDER_WAR_BOW.get()),
							1, 10, 0.05f));
			event.getTrades().get(3)
					.add(new BasicItemListing(new ItemStack(HorizonZeroBlockModItems.METAL_SHARDS.get(), 35),
							new ItemStack(HorizonZeroBlockModItems.CHILLWATER.get(), 5), new ItemStack(HorizonZeroBlockModItems.FROST_WAR_BOW.get()),
							1, 10, 0.05f));
		}
		if (event.getType() == VillagerProfession.TOOLSMITH) {
			event.getTrades().get(4)
					.add(new BasicItemListing(new ItemStack(HorizonZeroBlockModItems.METAL_SHARDS.get(), 50),
							new ItemStack(HorizonZeroBlockModItems.WIRE.get(), 15), new ItemStack(HorizonZeroBlockModItems.PRECISION_BOW.get()), 10,
							5, 0.05f));
			event.getTrades().get(4)
					.add(new BasicItemListing(new ItemStack(HorizonZeroBlockModItems.METAL_SHARDS.get(), 50),
							new ItemStack(HorizonZeroBlockModItems.ECHO_SHELL.get(), 10), new ItemStack(HorizonZeroBlockModItems.TEAR_BOW.get()), 10,
							5, 0.05f));
		}
		if (event.getType() == VillagerProfession.FLETCHER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(HorizonZeroBlockModItems.METAL_SHARDS.get(), 25),

					new ItemStack(HorizonZeroBlockModItems.FIRE_ARROW.get(), 10), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(HorizonZeroBlockModItems.METAL_SHARDS.get(), 5),

					new ItemStack(HorizonZeroBlockModItems.HUNTER_ARROW.get(), 10), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(HorizonZeroBlockModItems.METAL_SHARDS.get(), 20),

					new ItemStack(HorizonZeroBlockModItems.PRECISION_ARROW.get(), 5), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(HorizonZeroBlockModItems.METAL_SHARDS.get(), 15),

					new ItemStack(HorizonZeroBlockModItems.HARDPOINT_ARROW.get(), 10), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(HorizonZeroBlockModItems.METAL_SHARDS.get(), 30),

					new ItemStack(HorizonZeroBlockModItems.FREEZE_ARROW.get(), 5), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(HorizonZeroBlockModItems.METAL_SHARDS.get(), 64),

					new ItemStack(HorizonZeroBlockModItems.TEARBLAST_ARROW.get(), 3), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(HorizonZeroBlockModItems.METAL_SHARDS.get(), 15),

					new ItemStack(HorizonZeroBlockModItems.SHOCK_ARROW.get(), 5), 10, 5, 0.05f));
		}
	}
}
