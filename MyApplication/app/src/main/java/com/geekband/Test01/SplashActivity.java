package com.geekband.Test01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/2/22.
 * 虽然没什么高级功能，但没有BUG就好了，要求不要那么高！
 * 做人嘛，最重要的是开心！
 */
public class SplashActivity extends Activity {


    public static final String TITLE = "title";
    public static final String USER_INFO = "userInfo";
    public static final int REQUEST_CODE = 9999;
    public static final String TAG = SplashActivity.class.getSimpleName();
    private TextView mTextView;
    Handler mHandler = new Handler();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //获取将要传递到下一个页面的textView，将内容放在title内
        mTextView = (TextView) findViewById(R.id.title_text_view);
        final String title = mTextView.getText().toString();

        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {

                UserInfo userInfo = new UserInfo("手机就要爆炸，你开不开心",12);
                //跳转到MainActivity
                Intent intent = new Intent(SplashActivity.this,MainActivity.class);
                //意图将TITLE放在title这个容器内
                intent.putExtra(TITLE,title);
                intent.putExtra(USER_INFO,userInfo);

                startActivityForResult(intent, REQUEST_CODE);
            }
        },1000);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.i(TAG,"requestCode:"+requestCode+",resultCode:"+resultCode);

        if(requestCode == REQUEST_CODE && resultCode == MainActivity.RESULT_CODE){
            if(data != null){
                String title = data.getStringExtra(TITLE);
                mTextView.setText(title);

            }
        }
    }
}

