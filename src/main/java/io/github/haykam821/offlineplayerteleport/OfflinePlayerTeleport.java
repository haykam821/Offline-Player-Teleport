package io.github.haykam821.offlineplayerteleport;

import io.github.haykam821.offlineplayerteleport.command.OfflinePlayerTeleportCommand;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;

public class OfflinePlayerTeleport implements ModInitializer {
	public static final String MOD_ID = "offlineplayerteleport";

	@Override
	public void onInitialize() {
		CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
			OfflinePlayerTeleportCommand.register(dispatcher);
		});
	}
}
