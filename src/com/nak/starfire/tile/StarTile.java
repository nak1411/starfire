package com.nak.starfire.tile;

import com.nak.starfire.gfx.SpriteSheet;

public class StarTile extends Tile {

	public StarTile(int id) {
		super(SpriteSheet.starTile, id);
	}

	@Override
	protected boolean isSolid() {
		return false;
	}
}
