package jab;

import jab.gun.*;
import jab.module.*;
import jab.module.Module;
import jab.movement.*;
import jab.radar.*;
import jab.selectEnemy.*;
import jab.targeting.*;
import java.awt.Color;

/**
 * Module Bot 1.0.0
 * 
 * @author jab
 */
public class ModuleBot extends Module {

	protected void initialize() {
		// TODO Customize the colors here
		setBodyColor(Color.BLUE);
		setGunColor(Color.BLACK);
		setRadarColor(Color.RED);
		setScanColor(Color.RED);
		setBulletColor(Color.RED);
	}

	protected void selectBehavior() {
		radar = getSelectedRadar();
		movement = getSelectedMovement();
		targeting = getSelectedTargeting();
		selectEnemy = getSelectedSelectEnemy();
		gun = getSelectedGun();
	}

}
