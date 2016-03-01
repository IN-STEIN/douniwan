package com.geekband.Test01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final int RESULT_CODE = 1234;
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate:");
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_first).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //当被点击时弹出的消息
                Toast.makeText(MainActivity.this, "--------你的手机在5秒后就会自爆!---------", Toast.LENGTH_LONG).show();
            }
        });
        findViewById(R.id.button_second).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "--------把手机扔掉，乖!---------", Toast.LENGTH_LONG).show();
            }
        });
        findViewById(R.id.button_forth).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //返回启动页
//                Intent intent = new Intent(MainActivity.this, SplashActivity.class);
//                startActivity(intent);
            }
        });


        findViewById(R.id.button_third).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,SplashActivity.class);
                intent.putExtra(SplashActivity.TITLE,"这是传回的字符串");
                setResult(RESULT_CODE,intent);
                finish();
            }
        });

        //得到意图传过来的title
        Intent intent = getIntent();
        if(intent != null){
            String title = intent.getStringExtra(SplashActivity.TITLE);
            String TopInfo = intent.getStringExtra(SplashActivity.USER_INFO);

            setTitle(TopInfo);
        }


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart:");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume:");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause:");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop:");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy:");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart:");
    }
}
