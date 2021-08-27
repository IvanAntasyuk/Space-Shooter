package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class MyFirstGame extends ApplicationAdapter {
    private SpriteBatch batch;
    private Texture img;

    @Override
    public void create() {
        batch = new SpriteBatch();
        img = new Texture("135854.jpg");
    }

    @Override
    public void render() {
        ScreenUtils.clear(0.35f, 0.66f, 0.13f, 1);
        batch.begin();
        batch.draw(img, 0, 0,700,512);
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        img.dispose();
    }
}
