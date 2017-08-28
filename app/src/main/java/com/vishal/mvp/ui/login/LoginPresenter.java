package com.vishal.mvp.ui.login;

import android.os.Handler;

import com.vishal.mvp.R;
import com.vishal.mvp.utils.CommonUtils;

/**
 * Created by Administrator on 8/24/2017.
 */

public class LoginPresenter implements LoginContract.UserActionsListener {

    private final LoginContract.View mLoginView;

    LoginPresenter(LoginContract.View mLoginView) {
        this.mLoginView = mLoginView;
    }

    @Override
    public void onLoginClick(String email, String password) {
        //validate email and password
        if (email == null || email.isEmpty()) {
            mLoginView.onError(R.string.empty_email);
            return;
        }
        if (!CommonUtils.isEmailValid(email)) {
            mLoginView.onError(R.string.invalid_email);
            return;
        }
        if (password == null || password.isEmpty()) {
            mLoginView.onError(R.string.empty_password);
            return;
        }
        mLoginView.showLoading();
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mLoginView.hideLoading();
                mLoginView.openHomeActivity();
            }
        }, 5000);
    }
}

