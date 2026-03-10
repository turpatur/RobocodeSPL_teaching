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
		setBodyColor(Color.MAGENTA);
		setGunColor(Color.CYAN);
		setRadarColor(Color.YELLOW);
		setScanColor(Color.WHITE);
		setBulletColor(Color.GREEN);
	}

	protected void selectBehavior() {
		radar = getSelectedRadar();
		movement = getSelectedMovement();
		targeting = getSelectedTargeting();
		selectEnemy = getSelectedSelectEnemy();
		gun = getSelectedGun();
	}
	
	public void onWin(WinEvent e) {
		turnRight(36000);
	}

}
