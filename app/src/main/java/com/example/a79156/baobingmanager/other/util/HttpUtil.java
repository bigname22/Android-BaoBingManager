package com.example.a79156.baobingmanager.other.util;

import com.example.a79156.baobingmanager.other.constant.BaseConstant;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * author: bigname
 * date 2018/11/22 3:20
 * desc: Retrofit网络请求工具封装，单例模式
 */
public class HttpUtil {
    // 网络超时时间
    public static final long TIMEOUT = 20;

    private static HttpUtil mHttpUtil;
    private Retrofit mRetrofit;

    private HttpUtil () {
        init();
    }

    public static HttpUtil newInstance () {
        if (mHttpUtil == null) {
            synchronized (HttpUtil.class) {
                if (mHttpUtil == null) {
                    mHttpUtil = new HttpUtil();
                }
            }
        }
        return mHttpUtil;
    }

    /*
    *   初始化工作，对网络实体类的构建以及准备
    * */
    private void init() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.connectTimeout(TIMEOUT, TimeUnit.SECONDS)
                .writeTimeout(TIMEOUT,TimeUnit.SECONDS)
                .readTimeout(TIMEOUT, TimeUnit.SECONDS);
        OkHttpClient okHttpClient = builder.build();
        mRetrofit = new Retrofit.Builder()
                // 设置请求的域名
                .baseUrl(BaseConstant.Url.NewsUrl)
                // 设置解析转换工厂，用自己定义的
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okHttpClient)
                .build();

    }

    /**
     * 创建API
     */
    public <T> T create(Class<T> clazz) {
        return mRetrofit.create(clazz);
    }

}
