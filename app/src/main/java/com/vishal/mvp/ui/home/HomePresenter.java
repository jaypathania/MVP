package com.vishal.mvp.ui.home;

/**
 * Created by Administrator on 8/28/2017.
 */

public class HomePresenter implements HomeContract.UserActionsListener {

    HomeContract.View mHomeView;
    public HomePresenter(HomeContract.View mHomeView) {
        this.mHomeView = mHomeView;
    }
}
