package com.example.a79156.baobingmanager.model.interfaces;

import com.example.a79156.baobingmanager.model.ICallBack;



import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.Observable;


/**
 * author: bigname
 * date 2018/11/26 18:15
 * desc: 描述
 */
public abstract class BaseModel {
    protected void callBack2Observable (ICallBack callBack, Observable observable) {
        if (observable != null) {
            observable.subscribeOn(Schedulers.io())
                     .observeOn(AndroidSchedulers.mainThread())
                     .subscribe(new Observer() {
                @Override
                public void onSubscribe(Disposable disposable) {

                }

                @Override
                public void onNext(Object o) {
                    callBack.onSuccess(o);
                }

                @Override
                public void onError(Throwable throwable) {
                    callBack.onFail(throwable);
                }

                @Override
                public void onComplete() {
                    callBack.onComplete();
                }
            });

        }

    }
}
