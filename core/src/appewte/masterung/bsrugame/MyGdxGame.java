package appewte.masterung.bsrugame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.awt.Label;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;	// Drawing
	Texture img, cowTexture;
	private BitmapFont myBitmapFont;
	private Label myLabel;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		cowTexture = new Texture("logo300.png");
		myBitmapFont = new BitmapFont();
		myBitmapFont.setColor(Color.BLUE);






	}	// Main Method

	@Override
	public void render () {
		//Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClearColor(109/255.0f, 201/255.0f, 235/255.0f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		//batch.draw(img, 0, 0);

		//Draw Cow
		batch.draw(cowTexture, 600, 400);

		myBitmapFont.draw(batch, "Welcome to BSRU", 10, 400);

		batch.end();
	}	// rander
}
