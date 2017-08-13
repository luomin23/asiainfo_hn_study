package com.asiainfo.chapter1.liuwy.August11;

import java.io.Serializable;

/**
 * Created by LENOVO on 2017/8/11.
 */
public class Users implements Serializable{
    private int userId;
    private String userName;
    private String passWord;

    public Users() {
    }

    public Users(int userId, String userName, String passWord) {
        this.userId = userId;
        this.userName = userName;
        this.passWord = passWord;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}

