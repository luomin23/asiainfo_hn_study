package com.asiainfo.chapter2.luomin.entity;

import java.util.Dictionary;

/**
 * @author Luoo
 * @create 2017-09-09 16:15
 */

public class User {
    private String address;
    private int age;
    private Birthday birthday;
    private String name;
    private boolean sex;

    public User(String name, String address) {
        this.name = name;
        this.address = address;

    }

    public User() {

    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public Birthday getBirthday() {
        return birthday;
    }

    public String getName() {
        return name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirthday(Birthday birthday) {
        this.birthday = birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return this.name + "#" + this.age + "#" + this.sex + "#" + this.address + "#" + this.birthday.getBirthday();
    }


}
