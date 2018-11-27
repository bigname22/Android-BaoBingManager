package com.example.a79156.baobingmanager.view;

import android.os.Bundle;

import com.example.a79156.baobingmanager.R;
import com.example.a79156.baobingmanager.presenter.IBasePresenter;
import com.example.a79156.baobingmanager.view.base.BaseSimpleActivity;

public class MainActivity extends BaseSimpleActivity {


    @Override
    protected IBasePresenter bindPresenter() {
        return null;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void init(Bundle saveInstanceState) {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }
}
