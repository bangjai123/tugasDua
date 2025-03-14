package jab.module;

import java.util.Random;
import java.util.Iterator;
import jab.module.BotInfo;

/**
 * Select enemy
 * 
 * @author jabier.martinez
 */
public class SelectEnemy extends Part {

	public Module bot;

	public SelectEnemy(Module bot) {
		this.bot = bot;
	}

	public void select() {
		Iterator<BotInfo> iterator = bot.botsInfo.values().iterator();
		int size = bot.botsInfo.size();
		if (size == 0) {
			bot.enemy = null;
			return;
		}

		int randomIndex = random.nextInt(size);
		BotInfo selected = null;

		for (int i = 0; i <= randomIndex; i++) {
			selected = iterator.next();
		}

		bot.enemy = selected;
	}

	private Random random = new Random();

}
