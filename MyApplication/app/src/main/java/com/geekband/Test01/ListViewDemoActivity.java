package com.geekband.Test01;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/3/2.
 */
public class ListViewDemoActivity extends Activity{

    private ListView mPhoneBookListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_demo_activity);

        mPhoneBookListView = (ListView) findViewById(R.id.list_view);
        List<UserInfo> userInfos = new ArrayList<>();
        userInfos.add(new UserInfo("去评分",11));
        userInfos.add(new UserInfo("功能介绍",11));
        userInfos.add(new UserInfo("系统功能",11));
        userInfos.add(new UserInfo("帮助与反馈",11));
        userInfos.add(new UserInfo("检查新版本",11));

        PhoneBookAdapter phoneBookAdapter = new PhoneBookAdapter(ListViewDemoActivity.this,userInfos);
        mPhoneBookListView.setAdapter(phoneBookAdapter);
    }
}
