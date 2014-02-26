package com.joonsub.GameWorld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;

public class GameRenderer {

	private GameWorld gw;
	private OrthographicCamera camera;
	private ShapeRenderer shapeRenderer;

	public GameRenderer(GameWorld game){
		this.gw = game;
		camera = new OrthographicCamera();
		camera.setToOrtho(true, 136, 204);
		
		shapeRenderer = new ShapeRenderer();
		shapeRenderer.setProjectionMatrix(camera.combined);
	}
	
	public void render() {
		System.out.println("GameRenderer - render");
		
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);

        shapeRenderer.begin(ShapeType.Filled);
        shapeRenderer.setColor(87 / 255.0f, 109 / 255.0f, 120 / 255.0f, 1);
        shapeRenderer.rect(gw.getRect().x, gw.getRect().y,
                gw.getRect().width, gw.getRect().height);
        shapeRenderer.end();
	}

}
