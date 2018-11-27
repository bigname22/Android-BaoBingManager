package com.example.a79156.baobingmanager.model;

/**
 * author: bigname
 * date 2018/11/22 3:17
 * desc: 数据获取后的回调
 */
public interface ICallBack<T> {

    /*
    *   成功
    * */
    void onSuccess (T response);

    /*
    *   失败
    * */
    void onFail (Object error);

    /*
    *   完成
    * */
    void onComplete ();
}
