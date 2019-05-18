package com.davidvardanyan.brickbreaker.screen.game;


import com.davidvardanyan.brickbreaker.config.GameConfig;
import com.davidvardanyan.brickbreaker.entity.EntityFactory;
import com.davidvardanyan.brickbreaker.entity.Paddle;

public class GameController {

    private EntityFactory factory;
    private Paddle paddle;

    public GameController() {

         init();
    }

    //init

    private void init(){
        factory = new EntityFactory();
        paddle = factory.createPaddle();
    }

    public void update(float delta){

    }


    public Paddle getPaddle() {
        return paddle;
    }
}

