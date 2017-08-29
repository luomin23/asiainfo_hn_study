package com.asiainfo.chapter1.liuwy.demo;

/**
 * Created by LENOVO on 2017/8/23.
 */
public class User {
    private int id;
    private String name;
    private String password;
    private  int age;
    private String address;
    private String emil;

    public User() {
    }

    public User(String name, String password, int age, String address, String emil) {
        this.name = name;
        this.password = password;
        this.age = age;
        this.address = address;
        this.emil = emil;
    }
    public User(int id, String name, int age, String address, String emil) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.emil = emil;
    }

    public User(int id, String name, String password, int age, String address, String emil) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.address = address;
        this.emil = emil;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getEmil() {
        return emil;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmil(String emil) {
        this.emil = emil;
    }
}
