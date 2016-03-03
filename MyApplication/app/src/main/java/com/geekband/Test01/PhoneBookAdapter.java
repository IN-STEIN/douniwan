package com.geekband.Test01;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/3/2.
 */
public class PhoneBookAdapter extends BaseAdapter {

    private Context mContext;

    private List<UserInfo> mUserInfos = new ArrayList<>();


    private LayoutInflater mLayoutInflater;
//    LayoutInflater是用于解析布局

    public PhoneBookAdapter(Context context, List<UserInfo> userInfos) {
        mUserInfos = userInfos;
        mContext = context;
        mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        //有多少数据
        return mUserInfos.size();
    }

    @Override
    public Object getItem(int position) {
        //返回某一条数据对象
        return mUserInfos.get(position);
    }

    @Override
    public long getItemId(int position) {

        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //返回某一条数据的视图，实例化为convertV
        convertView = mLayoutInflater.inflate(R.layout.item_phonebook_people,null);

        //获取控件
        TextView nameTextView = (TextView) convertView.findViewById(R.id.name_text_view);

        //和数据进行绑定
        nameTextView.setText(mUserInfos.get(position).getUserName());
        return convertView;
    }
}
