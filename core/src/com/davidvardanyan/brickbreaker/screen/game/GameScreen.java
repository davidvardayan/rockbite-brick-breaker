package com.davidvardanyan.brickbreaker.screen.game;

import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.jga.util.game.GameBase;

public class GameScreen extends ScreenAdapter {

    //Attributes
    private final GameBase game;
    private final AssetManager assetManager;

    private GameController controller;
    private GameRenderer renderer;
    private final SpriteBatch batch;


    //Constructors

    public GameScreen(GameBase game) {
        this.game = game;
        assetManager = game.getAssetManager();
        game = game.getBatch()
    }

    @Override
    public void show() {
        controller = new GameController();
        renderer = new GameRenderer(controller,game,assetManager);
    }

    @Override
    public void render(float delta) {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void hide() {
        dispose();
    }

    @Override
    public void dispose() {

    }
}
