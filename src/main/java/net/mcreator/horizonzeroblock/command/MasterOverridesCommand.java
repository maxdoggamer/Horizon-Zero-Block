
package net.mcreator.horizonzeroblock.command;

@Mod.EventBusSubscriber
public class MasterOverridesCommand {

	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("masteroverrides").requires(s -> s.hasPermission(1)).executes(arguments -> {
			ServerLevel world = arguments.getSource().getLevel();

			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();

			Entity entity = arguments.getSource().getEntity();
			if (entity == null)
				entity = FakePlayerFactory.getMinecraft(world);

			Direction direction = entity.getDirection();

			MasterOverrideProcedure.execute(entity);
			return 0;
		}));
	}

}
