package com.example.a79156.baobingmanager.other.util;

import com.example.a79156.baobingmanager.model.impl.UserModel;
import com.example.a79156.baobingmanager.other.core.User;
import com.example.a79156.baobingmanager.other.domain.NewsDomain;

import retrofit2.Call;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Query;
import io.reactivex.Observable;

/**
 * author: bigname
 * date 2018/11/26 16:57
 * desc: 描述
 */
public interface ApiService {
    @POST("index?type=top")
    Observable<NewsDomain> login (@Query("key") String key, @Query("username") String username, @Query("password") String password);
}
