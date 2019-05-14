package com.davidvardanyan.brickbreaker.screen.game;

import com.badlogic.gdx.ScreenAdapter;
import com.jga.util.game.GameBase;

public class GameScreen extends ScreenAdapter {

    //Attributes
    private final GameBase game;


    //Constructors

    public GameScreen(GameBase game) {
        this.game = game;
    }
}
