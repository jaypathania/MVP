package com.vishal.mvp.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.vishal.mvp.R;
import com.vishal.mvp.ui.base.BaseActivity;
import com.vishal.mvp.ui.home.HomeActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends BaseActivity implements LoginContract.View {

    LoginContract.UserActionsListener mUserAction;

    @BindView(R.id.input_email)
    EditText input_email;

    @BindView(R.id.input_password)
    EditText input_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setmUnBinder(ButterKnife.bind(this));
        mUserAction = new LoginPresenter(this);
    }


    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_login:
                mUserAction.onLoginClick(input_email.getText().toString(), input_password.getText().toString());
                break;
        }
    }

    @Override
    public void openHomeActivity() {
        startActivity(new Intent(LoginActivity.this, HomeActivity.class));
        finish();
    }
}
