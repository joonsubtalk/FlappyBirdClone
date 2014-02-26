package com.joonsub.GameWorld;

import com.badlogic.gdx.graphics.OrthographicCamera;

public class GameRenderer {

	private GameWorld gw;
	private OrthographicCamera camera;

	public GameRenderer(GameWorld gw){
		this.gw = gw;
		camera = new OrthographicCamera();
		camera.setToOrtho(true, 136, 204);
	}
	
	public void render() {
		System.out.println("GameRenderer: render");
	}

}
