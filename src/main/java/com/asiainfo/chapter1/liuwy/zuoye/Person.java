package com.asiainfo.chapter1.liuwy.zuoye;

/**
 * Created by LENOVO on 2017/8/8.
 */
public class Person {
    private int id;
    private String name;
    private int phonenumber;
    private String address;
    private String emil;
    private int birth;

    public Person() {
    }

    public Person( String name, int phonenumber, String address, String emil, int birth) {
        this.name = name;
        this.phonenumber = phonenumber;
        this.address = address;
        this.emil = emil;
        this.birth = birth;
    }

    public Person(int id, String name, int phonenumber, String address, String emil, int birth) {
        this.id = id;
        this.name = name;
        this.phonenumber = phonenumber;
        this.address = address;
        this.emil = emil;
        this.birth = birth;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public String getAddress() {
        return address;
    }

    public String getEmil() {
        return emil;
    }

    public int getBirth() {
        return birth;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmil(String emil) {
        this.emil = emil;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }
}
