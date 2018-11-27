package com.example.a79156.baobingmanager.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.example.a79156.baobingmanager.R;
import com.example.a79156.baobingmanager.contract.LoginContract;
import com.example.a79156.baobingmanager.other.core.User;
import com.example.a79156.baobingmanager.presenter.IBasePresenter;
import com.example.a79156.baobingmanager.presenter.LoginPresenter;
import com.example.a79156.baobingmanager.view.base.BaseSimpleActivity;

import java.lang.reflect.Method;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.OnClick;

public class LoginActivity extends BaseSimpleActivity<LoginPresenter> {
    @BindView(R.id.etUserName)
    EditText mEtUserName;

    @BindView(R.id.etPassWord)
    EditText mEtPassWord;

    @Override
    protected LoginContract.ILoginPresenter bindPresenter() {
        return new LoginPresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
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

    // 点击事件 -----
    @OnClick(R.id.btnLogin)
    void onClick (View view) {
        String userName = mEtUserName.getText().toString();
        String passWord = mEtPassWord.getText().toString();
        User user = new User();
        user.setName(userName);
        user.setPassWord(passWord);
        ((LoginPresenter)mPresenter).login(user);
    }
}
