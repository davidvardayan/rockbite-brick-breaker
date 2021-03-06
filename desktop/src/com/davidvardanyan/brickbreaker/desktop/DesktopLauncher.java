package com.davidvardanyan.brickbreaker.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.davidvardanyan.brickbreaker.BrickBreakerGame;
import com.davidvardanyan.brickbreaker.config.GameConfig;
import com.jga.util.ads.NullAdController;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new BrickBreakerGame(NullAdController.INSTANCE), config);
		config.width = GameConfig.WIDTH;
		config.height = GameConfig.HEIGHT;
	}
}
