package com.davidvardanyan.brickbreaker.config;

public final class GameConfig {

    //constants
    //For desktop
   public static final int WIDTH = 960;
    public static final int HEIGHT = 768;

    //World units
    public static final float WORLD_WIDTH = 30f;
    public static final float WORLD_HEIGHT = 24f;

    public static final float WORLD_CENTER_X = WORLD_WIDTH /2f;
    public static final float WORLD_CENTER_y = WORLD_HEIGHT /2f;

    public static final float PADDLE_WIDTH = 3f;
    public static final float PADDLE_HEIGHT = 1f;

    public static final float PADDLE_START_X = (WORLD_WIDTH -PADDLE_WIDTH) /2f;
    public static final float PADDLE_START_Y = 1;

 private GameConfig(){}
}
