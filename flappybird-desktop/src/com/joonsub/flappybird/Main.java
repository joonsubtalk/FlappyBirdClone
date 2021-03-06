package com.joonsub.flappybird;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.joonsub.FlappyBird.FlappyBird;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "flappybird";
		cfg.useGL20 = false;
		cfg.width = 272;
		cfg.height = 408;
		
		new LwjglApplication(new FlappyBird(), cfg);
	}
}
