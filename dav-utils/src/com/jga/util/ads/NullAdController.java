package com.jga.util.ads;

import com.badlogic.gdx.utils.Logger;

public final class NullAdController implements AdController {
    public static final AdController INSTANCE =new NullAdController() ;

    private static final Logger log = new Logger(NullAdController.class.getSimpleName(),Logger.DEBUG);

    @Override
    public void showBanner() {
        log.debug("Show banner");
    }

    @Override
    public void showInterstitial() {
      log.debug("Show interstitial");
    }

    @Override
    public boolean isNetworkConnected() {
        return false;
    }

    private NullAdController(){

    }
}
