package com.asiainfo.chapter2.luomin.entity;

/**
 * @author Luoo
 * @create 2017-09-09 16:14
 */

public class Account {
    private String email;
    private int id;
    private String name;
    private Birthday birthday;
    private String address;

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(Birthday birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return this.name + "#" + this.id + "#" + this.address + "#" + this.birthday + "#" + this.email;
    }

}
