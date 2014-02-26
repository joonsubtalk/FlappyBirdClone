package com.joonsub.GameWorld;

import com.badlogic.gdx.math.Rectangle;

public class GameWorld {

	private Rectangle rect = new Rectangle(0,20,17,12);
	
	public void update(float delta) {
		System.out.println("GameWorld: update");
		rect.x++;
		if (rect.x > 137) {
			rect.x = -rect.width;
		}
	}
	
	public Rectangle getRect(){
		return rect;
	}

}
