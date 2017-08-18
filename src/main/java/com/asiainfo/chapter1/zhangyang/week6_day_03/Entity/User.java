package com.asiainfo.chapter1.zhangyang.week6_day_03.Entity;

/**
 * Created by 11 on 2017/8/16.
 */
public class User {
    private String name;
    private String password;
    private String sex;

    public User(){

    }
    public User(String name,String password,String sex){
        super();
        this.name=name;
        this.password=password;
        this.sex= sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
