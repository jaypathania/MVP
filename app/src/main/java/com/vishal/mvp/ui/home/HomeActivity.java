package com.vishal.mvp.ui.home;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.vishal.mvp.R;
import com.vishal.mvp.ui.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends BaseActivity implements HomeContract.View {

    @BindView(R.id.cl_root_view)
    ConstraintLayout constraintLayout;

    HomeContract.UserActionsListener mUserAction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mUserAction = new HomePresenter(this);
        setmUnBinder(ButterKnife.bind(this));
        initFragment(HomeFragment.newInstance());
    }


    private void initFragment(Fragment notesFragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.cl_root_view, notesFragment);
        transaction.commit();
    }
}
