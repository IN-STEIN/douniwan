package com.geekband.Test01;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/2/24.
 */
public class UserInfo implements Serializable{
    private String UserName;
    private int Age;

    public UserInfo(String userName,int age) {
        UserName = userName;
        Age = age;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
