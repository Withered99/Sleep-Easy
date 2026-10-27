package net.withered.sleepeasy;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents;
import net.fabricmc.fabric.api.util.EventResult;
import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SleepEasy implements ModInitializer {
	public static final String MOD_ID = "sleepeasy";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        EntitySleepEvents.ALLOW_NEARBY_MONSTERS.register(((player, sleepingPos, vanillaResult) -> {
            return EventResult.ALLOW;
        }));
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
