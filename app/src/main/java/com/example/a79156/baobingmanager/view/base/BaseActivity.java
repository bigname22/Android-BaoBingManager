package com.example.a79156.baobingmanager.view.base;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.a79156.baobingmanager.R;
import com.example.a79156.baobingmanager.presenter.IBasePresenter;

import butterknife.ButterKnife;

public abstract class BaseActivity<P extends IBasePresenter, V extends IBaseView> extends AppCompatActivity implements IBaseView{

    // 绑定presenter
    public P mPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        // 绑定Butterknife
        ButterKnife.bind(this);
        init(savedInstanceState);
        // 绑定presenter
        mPresenter = bindPresenter();
        if (mPresenter != null) {
            mPresenter.attachView(this);
        }
        initData();
        initView();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }

    protected abstract P bindPresenter( );

    /*
     *   设置布局id
     * */
    protected abstract int getLayoutId ();

    /*
    *   配置初始化
    * */
    protected abstract void init (Bundle saveInstanceState);

    /*
    *   初始化数据
    * */
    protected abstract void initData ();

    /*
    *   初始化视图
    * */
    protected abstract void initView ();

}
