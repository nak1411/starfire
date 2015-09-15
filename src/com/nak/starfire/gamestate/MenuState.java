package com.nak.starfire.gamestate;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.nak.starfire.gfx.ImageLoader;
import com.nak.starfire.input.Keyboard;

public class MenuState {

	private BufferedImage menuImage;

	public MenuState(String path) {
		menuImage = ImageLoader.loadImage(path);
	}

	public void render(Graphics g) {
		g.drawImage(menuImage, 0, 0, null);
	}

	public void update() {
		if (Keyboard.down) {
			GameStateManager.gameState = GameState.LEVELSTATE;
		}
	}

	public void input() {

	}
}
