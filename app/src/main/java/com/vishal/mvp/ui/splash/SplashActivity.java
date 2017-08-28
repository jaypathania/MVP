package com.vishal.mvp.ui.splash;

import android.content.Intent;
import android.os.Bundle;

import com.vishal.mvp.R;
import com.vishal.mvp.ui.base.BaseActivity;
import com.vishal.mvp.ui.login.LoginActivity;


public class SplashActivity extends BaseActivity implements SplashContract.View {

    private SplashContract.UserActionsListener mActionsListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        mActionsListener = new SplashPresenter(this);
        mActionsListener.addDelay();
    }

    @Override
    public void openLoginActivity() {
        Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
        startActivity(intent);
    }

    @Override
    public void openHomeActivity() {
        Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
        startActivity(intent);
    }
}
