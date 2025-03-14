package jab.module;

import java.awt.event.InputEvent;

/**
 * Movement
 * 
 * @author jab
 */
public class Movement extends Part {

	public Module bot;

	public Movement(Module bot) {
		this.bot = bot;
	}

	public void move() {
		bot.setAhead(100);
		bot.setTurnRight(30);
	}

	public void listenInput(InputEvent e) {
	}

}
