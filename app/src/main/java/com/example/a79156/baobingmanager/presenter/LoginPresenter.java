package com.example.a79156.baobingmanager.presenter;


import android.util.Log;

import com.example.a79156.baobingmanager.contract.LoginContract;
import com.example.a79156.baobingmanager.model.ICallBack;
import com.example.a79156.baobingmanager.model.impl.UserModel;
import com.example.a79156.baobingmanager.other.core.User;
import com.example.a79156.baobingmanager.other.domain.NewsDomain;


/**
 * author: bigname
 * date 2018/11/21 22:50
 * desc: 描述
 */
public class LoginPresenter extends LoginContract.ILoginPresenter {

    @Override
    public void login(User user) {
        UserModel userModel = new UserModel();
        userModel.login(user, new ICallBack<NewsDomain>() {
            @Override
            public void onSuccess(NewsDomain response) {
                if(response != null) {
                    mView.showToast(response.getReason());
                }
            }

            @Override
            public void onFail(Object error) {
                Log.d("bigname", "onFail: " + error);
            }

            @Override
            public void onComplete() {

            }
        });
    }
}
