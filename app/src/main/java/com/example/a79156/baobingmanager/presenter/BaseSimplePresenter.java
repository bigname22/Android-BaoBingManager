package com.example.a79156.baobingmanager.presenter;

import com.example.a79156.baobingmanager.view.base.IBaseView;

/**
 * author: bigname
 * date 2018/11/26 14:55
 * desc: 描述
 */
public abstract class BaseSimplePresenter<T> implements IBasePresenter<T> {

    protected T mView;


    @Override
    public void attachView(T view) {
        mView = view;
    }

    @Override
    public void detachView() {
        mView = null;
    }

    @Override
    public T getView() {
        return mView;
    }
}
