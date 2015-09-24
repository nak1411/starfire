package com.nak.starfire.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboard implements KeyListener {

	private boolean[] keys = new boolean[1000];
	public static boolean up, down, left, right, space, enter, e, esc, g, b;
	public static boolean numlefttoggle, numrighttoggle, numuptoggle, numdowntoggle;
	public static boolean increase, decrease, brushInc, brushDec;
	public static boolean one, two, three, four, five;
	public static boolean toggleOn = true;

	public void update() {
		up = keys[KeyEvent.VK_UP] || keys[KeyEvent.VK_W];
		down = keys[KeyEvent.VK_DOWN] || keys[KeyEvent.VK_S];
		left = keys[KeyEvent.VK_LEFT] || keys[KeyEvent.VK_A];
		right = keys[KeyEvent.VK_RIGHT] || keys[KeyEvent.VK_D];
		enter = keys[KeyEvent.VK_ENTER];
		e = keys[KeyEvent.VK_E];
		esc = keys[KeyEvent.VK_ESCAPE];
		space = keys[KeyEvent.VK_SPACE];
		g = keys[KeyEvent.VK_G];
		b = keys[KeyEvent.VK_B];
		numuptoggle = keys[KeyEvent.VK_NUMPAD8];
		numdowntoggle = keys[KeyEvent.VK_NUMPAD2]; 
		numlefttoggle = keys[KeyEvent.VK_NUMPAD4]; 
		numrighttoggle = keys[KeyEvent.VK_NUMPAD6];
		increase = keys[KeyEvent.VK_EQUALS];
		decrease = keys[KeyEvent.VK_MINUS];
		brushInc = keys[KeyEvent.VK_CLOSE_BRACKET];
		brushDec = keys[KeyEvent.VK_OPEN_BRACKET];
		one = keys[KeyEvent.VK_1];
		two = keys[KeyEvent.VK_2];
		three = keys[KeyEvent.VK_3];
		four = keys[KeyEvent.VK_4];
		five = keys[KeyEvent.VK_5];
		
	}

	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()] = true;
		if(toggleOn) {
			space = true;
			one = true;
			two = true;
			three = true;
			four = true;
			five = true;
			esc = true;
		}
	}

	public void keyReleased(KeyEvent e) {
			keys[e.getKeyCode()] = false;
			toggleOn = true;
	}

	public void keyTyped(KeyEvent e) {
	}
}
