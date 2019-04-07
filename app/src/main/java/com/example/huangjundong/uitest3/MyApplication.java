package com.example.huangjundong.uitest3;

import android.app.Application;

/**
 * Created by huangjundong on 2019/4/6.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();


        System.out.println("--------->application onCreate");


//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        System.out.println("--------->application onCreate end");
    }
}
