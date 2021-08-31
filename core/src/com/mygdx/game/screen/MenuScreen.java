package com.mygdx.game.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.base.BaseScreen;

public class MenuScreen extends BaseScreen {
    private static final float V_LEN = 1.5f;
    private Texture img;
    private Vector2 touch;
    private Vector2 pos;
    private Vector2 v;
    private Vector2 temp;


    @Override
    public void show() {
        super.show();
        img = new Texture("135854.jpg");
        touch = new Vector2();
        pos = new Vector2();
        v = new Vector2();
        temp = new Vector2();
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        temp.set(touch);
        if (temp.sub(pos).len()>v.len()){
            pos.add(v);
        }else {
            pos.set(touch);
        }
        batch.begin();
        batch.draw(img, pos.x, pos.y, 300, 300);
        batch.end();
    }

    @Override
    public void dispose() {
        super.dispose();
        img.dispose();
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        touch.set(screenX, Gdx.graphics.getHeight() - screenY);
        v.set(touch.cpy().sub(pos)).setLength(V_LEN);
        return super.touchDown(screenX, screenY, pointer, button);

    }

}
