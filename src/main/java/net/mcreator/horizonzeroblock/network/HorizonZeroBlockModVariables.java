package net.mcreator.horizonzeroblock.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.mcreator.horizonzeroblock.HorizonZeroBlockMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HorizonZeroBlockModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		HorizonZeroBlockMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new,
				PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getPlayer().level.isClientSide())
				((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
						.syncPlayerVariables(event.getPlayer());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getPlayer().level.isClientSide())
				((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
						.syncPlayerVariables(event.getPlayer());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getPlayer().level.isClientSide())
				((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
						.syncPlayerVariables(event.getPlayer());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PlayerVariables()));
			clone.PSI_overrides = original.PSI_overrides;
			clone.R1 = original.R1;
			clone.R2 = original.R2;
			clone.R3 = original.R3;
			clone.R4 = original.R4;
			clone.R5 = original.R5;
			clone.R6 = original.R6;
			clone.R7 = original.R7;
			clone.R8 = original.R8;
			clone.N1 = original.N1;
			clone.N2 = original.N2;
			clone.N3 = original.N3;
			clone.N4 = original.N4;
			clone.N5 = original.N5;
			clone.N6 = original.N6;
			clone.N7 = original.N7;
			clone.N8 = original.N8;
			if (!event.isWasDeath()) {
			}
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("horizon_zero_block", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public boolean PSI_overrides = false;
		public ItemStack R1 = ItemStack.EMPTY;
		public ItemStack R2 = ItemStack.EMPTY;
		public ItemStack R3 = ItemStack.EMPTY;
		public ItemStack R4 = ItemStack.EMPTY;
		public ItemStack R5 = ItemStack.EMPTY;
		public ItemStack R6 = ItemStack.EMPTY;
		public ItemStack R7 = ItemStack.EMPTY;
		public ItemStack R8 = ItemStack.EMPTY;
		public double N1 = 0;
		public double N2 = 0;
		public double N3 = 0;
		public double N4 = 0;
		public double N5 = 0;
		public double N6 = 0;
		public double N7 = 0;
		public double N8 = 0;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				HorizonZeroBlockMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putBoolean("PSI_overrides", PSI_overrides);
			nbt.put("R1", R1.save(new CompoundTag()));
			nbt.put("R2", R2.save(new CompoundTag()));
			nbt.put("R3", R3.save(new CompoundTag()));
			nbt.put("R4", R4.save(new CompoundTag()));
			nbt.put("R5", R5.save(new CompoundTag()));
			nbt.put("R6", R6.save(new CompoundTag()));
			nbt.put("R7", R7.save(new CompoundTag()));
			nbt.put("R8", R8.save(new CompoundTag()));
			nbt.putDouble("N1", N1);
			nbt.putDouble("N2", N2);
			nbt.putDouble("N3", N3);
			nbt.putDouble("N4", N4);
			nbt.putDouble("N5", N5);
			nbt.putDouble("N6", N6);
			nbt.putDouble("N7", N7);
			nbt.putDouble("N8", N8);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			PSI_overrides = nbt.getBoolean("PSI_overrides");
			R1 = ItemStack.of(nbt.getCompound("R1"));
			R2 = ItemStack.of(nbt.getCompound("R2"));
			R3 = ItemStack.of(nbt.getCompound("R3"));
			R4 = ItemStack.of(nbt.getCompound("R4"));
			R5 = ItemStack.of(nbt.getCompound("R5"));
			R6 = ItemStack.of(nbt.getCompound("R6"));
			R7 = ItemStack.of(nbt.getCompound("R7"));
			R8 = ItemStack.of(nbt.getCompound("R8"));
			N1 = nbt.getDouble("N1");
			N2 = nbt.getDouble("N2");
			N3 = nbt.getDouble("N3");
			N4 = nbt.getDouble("N4");
			N5 = nbt.getDouble("N5");
			N6 = nbt.getDouble("N6");
			N7 = nbt.getDouble("N7");
			N8 = nbt.getDouble("N8");
		}
	}

	public static class PlayerVariablesSyncMessage {
		public PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new PlayerVariables()));
					variables.PSI_overrides = message.data.PSI_overrides;
					variables.R1 = message.data.R1;
					variables.R2 = message.data.R2;
					variables.R3 = message.data.R3;
					variables.R4 = message.data.R4;
					variables.R5 = message.data.R5;
					variables.R6 = message.data.R6;
					variables.R7 = message.data.R7;
					variables.R8 = message.data.R8;
					variables.N1 = message.data.N1;
					variables.N2 = message.data.N2;
					variables.N3 = message.data.N3;
					variables.N4 = message.data.N4;
					variables.N5 = message.data.N5;
					variables.N6 = message.data.N6;
					variables.N7 = message.data.N7;
					variables.N8 = message.data.N8;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
