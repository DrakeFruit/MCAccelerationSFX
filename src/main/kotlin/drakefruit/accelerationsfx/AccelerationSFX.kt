package drakefruit.accelerationsfx

import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory

object AccelerationSFX : ModInitializer {
	private var MOD_ID: String = "accelerationsfx"
    private val logger = LoggerFactory.getLogger(MOD_ID)

	override fun onInitialize() {
		logger.info("Hello Fabric world!")
	}

}