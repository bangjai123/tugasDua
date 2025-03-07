package jab.radar;

import jab.module.Module;
import jab.module.Radar;

/**
 * A simple spin of the radar
 * 
 */
public class BlinkingSpinningRadar extends Radar {
	private int blinkInterval = 5;
	public BlinkingSpinningRadar(Module bot) {
		super(bot);
	}

	public void scan() {
		long time = bot.getTime();
		if (time % blinkInterval < blinkInterval/2 ) {
			bot.setTurnRadarRightRadians(Double.POSITIVE_INFINITY);
		} else {
			bot.setTurnRadarRightRadians(0);
		}
	}

}
