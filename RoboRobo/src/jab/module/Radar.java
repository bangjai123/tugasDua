package jab.module;

/**
 * Radar
 * 
 * @author jab
 */
public class Radar extends Part {

	public Module bot;

	public Radar(Module bot) {
		this.bot = bot;
	}

	public void scan() {
		long time = bot.getTime();
		if (time % blinkInterval < blinkInterval / 2) {
			bot.setTurnRadarRightRadians(Double.POSITIVE_INFINITY);
		} else {
			bot.setTurnRadarRightRadians(0);
		}
	}

	int blinkInterval = 5;

}
