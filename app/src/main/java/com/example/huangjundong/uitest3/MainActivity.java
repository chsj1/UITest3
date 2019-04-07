package com.example.huangjundong.uitest3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


//        try {
//            Thread.sleep(4000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        getWindow().setBackgroundDrawable(null);

        setContentView(R.layout.activity_main);

        findViewById(R.id.bt_anr).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                /*
                1、主线程输入事件在5秒之内没有完成处理(主要类型)
                2、主线程中的BroadcastReceiver的onReceive函数在10s之内没有完成处理
                3、Service中的各个生命周期函数在20s之内没有完成处理.
                 */
//                try {
//                    Thread.sleep(6000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }



                ViewStub viewStub = (ViewStub) findViewById(R.id.vs);
                //加载布局的第一种方式
//                viewStub.inflate();
                //加载布局的第二种方式
                viewStub.setVisibility(View.VISIBLE);

            }
        });




        View view1 = findViewById(R.id.includelayout);
        View view2 = findViewById(R.id.includelayout1);

        int a = 1;

    }


}
