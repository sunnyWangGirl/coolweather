package com.app.coolweather.util;

/**
 * Created by Administrator on 2018/4/23.
 */

public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);

}