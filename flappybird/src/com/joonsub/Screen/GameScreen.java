package com.joonsub.Screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.joonsub.GameWorld.GameRenderer;
import com.joonsub.GameWorld.GameWorld;

public class GameScreen implements Screen{

	private GameWorld gw;
	private GameRenderer gr;
	
	public GameScreen(){
		System.out.println("GameScreen Constructed");
		gw = new GameWorld();
		gr = new GameRenderer(gw);
	}
	public void render(float delta) {
        gw.update(delta);
        gr.render();
	}
	public void resize(int width, int height) {
		System.out.println("resized to " + width +"x"+ height);
	}
	public void show() {System.out.println("GameScreen Show called");}
	public void hide() {System.out.println("GameScreen Hide called");}
	public void pause() {System.out.println("GameScreen Pause called");}
	public void resume() {System.out.println("GameScreen Resume called");}
	public void dispose() {}

}
