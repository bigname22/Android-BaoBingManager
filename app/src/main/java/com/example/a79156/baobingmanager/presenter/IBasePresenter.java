package com.example.a79156.baobingmanager.presenter;

import com.example.a79156.baobingmanager.view.base.IBaseView;

/**
 * author: bigname
 * date 2018/11/21 22:20
 * desc: 描述
 */
public interface IBasePresenter<T> {

    /*
    *   绑定view
    * */
    void attachView(T view);

    /*
    *   解绑view
    * */
    void detachView();

    /*
    *   获取绑定的View
    * */
    T getView ();
}
