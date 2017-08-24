package com.vishal.mvp.ui.splash;

import android.os.Handler;

/**
 * Created by Administrator on 8/24/2017.
 */

public class SplashPresenter implements SplashContract.UserActionsListener {

    private final SplashContract.View mSplashView;

    SplashPresenter(SplashContract.View mSplashView) {
        this.mSplashView = mSplashView;
    }

    @Override
    public void addDelay() {
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mSplashView.openLoginActivity();
            }
        }, 5000);
    }

//    @Override
//    public void loginClickAction() {
//        mSplashView.showLoading();
//        final Handler handler = new Handler();
//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                mSplashView.hideLoading();
//                mSplashView.openLoginActivity();
//            }
//        }, 5000);
//    }
}

