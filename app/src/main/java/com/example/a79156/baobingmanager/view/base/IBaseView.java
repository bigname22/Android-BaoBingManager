package com.example.a79156.baobingmanager.view.base;

/*
*   author: bigname
*   date: 2018-11-21
*   desc: 基础试图接口类，包含试图的基本作用
* */
public interface IBaseView {
    /*
    *   显示加载动画
    * */
    void showLoading ();

    /*
    *   隐藏加载动画
    * */
    void hideLoading ();

    /*
    *   弹出消息
    * */
    void showToast (String toastStr);
}
