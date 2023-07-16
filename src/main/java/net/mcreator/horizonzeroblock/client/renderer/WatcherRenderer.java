
package net.mcreator.horizonzeroblock.client.renderer;

public class WatcherRenderer extends MobRenderer<WatcherEntity, ModelWatcher<WatcherEntity>> {

	public WatcherRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelWatcher(context.bakeLayer(ModelWatcher.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(WatcherEntity entity) {
		return new ResourceLocation("horizon_zero_block:textures/entities/watcher.png");
	}

}
