package com.asiainfo.chapter1.zhangyang.week7_day_03.entity;

/**
 * Created by 11 on 2017/8/18.
 */
public class Person {
    private int userId;
    private String userName;
    private String userPassword;
    private String userSex;
    public Person(){

    }
    public Person(String userName, String userPassword) {
        this.userName =userName;
        this.userPassword =userPassword;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }
}
