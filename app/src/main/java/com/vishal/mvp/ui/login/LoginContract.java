package com.vishal.mvp.ui.login;

import com.vishal.mvp.ui.base.MvpView;

/**
 * Created by Administrator on 8/24/2017.
 */

public interface LoginContract {
    interface View extends MvpView {

    }

    interface UserActionsListener {
        void onLoginClick(String username, String password);
    }
}


