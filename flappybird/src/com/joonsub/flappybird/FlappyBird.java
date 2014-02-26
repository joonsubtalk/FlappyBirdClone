package com.joonsub.flappybird;

import com.badlogic.gdx.Game;
import com.joonsub.Screen.GameScreen;


public class FlappyBird extends Game{

	public void create() {
		System.out.println("Game created.");
		setScreen(new GameScreen());
	}
	
}
