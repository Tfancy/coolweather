package com.jm.zuikuweather.application;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePalApplication;

/**
 * Created by t_jm on 2017/9/15.
 * test push
 */

public class MyApplication extends Application {

    private static Context context;

	
    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        LitePalApplication.initialize(context);
    }

    public static Context getContext() {
        return context;
    }
}
