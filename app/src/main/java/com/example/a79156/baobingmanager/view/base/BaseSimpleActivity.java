package com.example.a79156.baobingmanager.view.base;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.a79156.baobingmanager.presenter.IBasePresenter;

/**
 * author: bigname
 * date 2018/11/21 22:03
 * desc: 便捷activity，已经实现了IBaseView中的方法
 */
public abstract class BaseSimpleActivity<P extends IBasePresenter> extends BaseActivity {

    @Override
    public void showLoading() {
        Toast.makeText(this, "开始请求..." , Toast.LENGTH_SHORT).show();
        Log.d("bigname", "showLoading: ");
    }

    @Override
    public void hideLoading() {
        Toast.makeText(this, "结束请求" , Toast.LENGTH_SHORT).show();
        Log.d("bigname", "hideLoading: ");
    }

    @Override
    public void showToast(String toastStr) {
        Toast.makeText(this, toastStr , Toast.LENGTH_SHORT).show();
        Log.d("bigname", "showToast: ");
    }
}
