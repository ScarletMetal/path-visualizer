package com.spikes2212.visualpath;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class PathVisualizer extends ApplicationAdapter {
	SpriteBatch batch;
	ShapeRenderer renderer;
	Path path;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		renderer = new ShapeRenderer();
		path = new Path(10, 1, 1, 1000, 400, 400, 400,
				new Waypoint(0, 0, 0), new Waypoint(100, 100, 0), new Waypoint(200, 200, 0));

	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		renderer.setProjectionMatrix(batch.getProjectionMatrix());
		batch.begin();

		renderer.begin(ShapeRenderer.ShapeType.Filled);

		path.draw(renderer, Color.RED);

		renderer.end();
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
