package com.whalefish.sevendays;

import com.whalefish.sevendays.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SevenDaysUpdate implements ModInitializer {
	public static final String MOD_ID = "sevendays";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModWorldGeneration.generateModWorldGeneration();

		CustomPortalBuilder.beginPortal()
				.frameBlock(ModBlocks.PACKED_ICE_BRICK)
				.lightWithWater()
				.destDimID(Identifier.of(HazeDimension.MOD_ID, "hazedim"))
				.tintColor(0x36fff3)
				.forcedSize(2,3)
				.registerPortal();
	}
}