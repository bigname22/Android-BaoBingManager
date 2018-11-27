package com.example.a79156.baobingmanager.model.impl;

import android.util.Log;

import com.example.a79156.baobingmanager.model.ICallBack;
import com.example.a79156.baobingmanager.model.interfaces.BaseModel;
import com.example.a79156.baobingmanager.model.interfaces.IUserModel;
import com.example.a79156.baobingmanager.other.constant.BaseConstant;
import com.example.a79156.baobingmanager.other.core.User;
import com.example.a79156.baobingmanager.other.domain.NewsDomain;
import com.example.a79156.baobingmanager.other.util.ApiService;
import com.example.a79156.baobingmanager.other.util.HttpUtil;

import io.reactivex.Observable;


/**
 * author: bigname
 * date 2018/11/22 3:19
 * desc: 用户模型，登陆，注销，注册等行为
 */
public class UserModel extends BaseModel implements IUserModel {
    private static final String TAG = "bigname";

    @Override
    public void login(User user, ICallBack callBack) {
        Observable<NewsDomain> response = HttpUtil.newInstance().create(ApiService.class).login(BaseConstant.APP_KEY, user.getName(), user.getPassWord());
        callBack2Observable(callBack, response);
        Log.d(TAG, "login: " + response);
    }

}
