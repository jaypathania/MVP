package com.vishal.mvp.ui.splash;

import com.vishal.mvp.ui.base.MvpView;

/**
 * Created by Administrator on 8/24/2017.
 */

public interface SplashContract {
    interface View extends MvpView {
        void openLoginActivity();

        void openHomeActivity();
    }

    interface UserActionsListener {
        void addDelay();
    }
}


