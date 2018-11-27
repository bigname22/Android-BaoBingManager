package com.example.a79156.baobingmanager.contract;


import com.example.a79156.baobingmanager.other.core.User;
import com.example.a79156.baobingmanager.presenter.BaseSimplePresenter;
import com.example.a79156.baobingmanager.presenter.IBasePresenter;
import com.example.a79156.baobingmanager.view.base.IBaseView;

/**
 * author: bigname
 * date 2018/11/21 22:40
 * desc: 登陆页合约
 */
public interface LoginContract {

    /*
     *   登陆页View接口定义
     * */
    public interface ILoginView extends IBaseView {

    }

    /*
    *   登录页Presenter接口定义
    * */
    public abstract class ILoginPresenter extends BaseSimplePresenter<IBaseView> {

        /*
         *   发起登陆
         * */
        public abstract void login(User user);
    }

}
