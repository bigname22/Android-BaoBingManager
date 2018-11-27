package com.example.a79156.baobingmanager;

import android.util.Log;

import com.example.a79156.baobingmanager.contract.LoginContract;
import com.example.a79156.baobingmanager.presenter.LoginPresenter;

/**
 * author: bigname
 * date 2018/11/22 0:03
 * desc: 描述
 */
public class Test {
    public void maind (String args[]) {
        System.out.println("----------");
        getIn();
    }

    public static LoginContract.ILoginPresenter getIn () {
        System.out.print("----------");
        Log.d("bigname", "getIn: ");
        return new LoginPresenter();
    }
}
