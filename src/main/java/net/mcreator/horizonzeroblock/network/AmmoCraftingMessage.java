
package net.mcreator.horizonzeroblock.network;

import net.mcreator.horizonzeroblock.HorizonZeroBlockMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AmmoCraftingMessage {

	int type, pressedms;

	public AmmoCraftingMessage(int type, int pressedms) {
		this.type = type;
		this.pressedms = pressedms;
	}

	public AmmoCraftingMessage(FriendlyByteBuf buffer) {
		this.type = buffer.readInt();
		this.pressedms = buffer.readInt();
	}

	public static void buffer(AmmoCraftingMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.type);
		buffer.writeInt(message.pressedms);
	}

	public static void handler(AmmoCraftingMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			pressAction(context.getSender(), message.type, message.pressedms);
		});
		context.setPacketHandled(true);
	}

	public static void pressAction(Player entity, int type, int pressedms) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(entity.blockPosition()))
			return;

		if (type == 0) {

			AmmoCraftingOnKeyPressedProcedure.execute(entity);
		}

	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		HorizonZeroBlockMod.addNetworkMessage(AmmoCraftingMessage.class, AmmoCraftingMessage::buffer, AmmoCraftingMessage::new, AmmoCraftingMessage::handler);
	}

}
