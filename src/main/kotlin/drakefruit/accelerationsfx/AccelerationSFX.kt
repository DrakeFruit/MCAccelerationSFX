package drakefruit.accelerationsfx

import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
import net.minecraft.client.MinecraftClient
import net.minecraft.text.Text

object AccelerationSFX : ModInitializer {
	override fun onInitialize() {
		ClientTickEvents.END_CLIENT_TICK.register(ClientTickEvents.EndTick { client ->
			val player = client.player
			if (player != null) {
				val velocity = player.velocity

				// Get the current tick time
				val tickTime = MinecraftClient.getInstance().server?.tickTime ?: 50.0f

				val yOffset = 0.0784000015258789
				val xOffset = 0.0
				val zOffset = 0.0
				val vOffset = 0.0

				val speed = (Math.sqrt(Math.pow(velocity.x + xOffset, 2.0) + Math.pow(velocity.y + yOffset, 2.0) + Math.pow(velocity.z + zOffset, 2.0)) * 20.0) + vOffset

				client.inGameHud.chatHud.addMessage(Text.of("Player Speed: $speed blocks/second"))
			}
		})
	}
}
