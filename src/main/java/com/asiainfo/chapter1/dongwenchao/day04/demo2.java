package com.asiainfo.chapter1.dongwenchao.day04;

/**
 * Created by 超超 on 2017/7/27 0027.
 */
public class demo2 {
    private String name;
    private int id;

 /*   public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }*/
    public demo2(String myname, int myid) {
        name = myname;
        id = myid;
    }
    public void eat() {
        System.out.println(name + "正在吃");
    }
    public void sleep() {
        System.out.println(name + "正在睡觉");
    }
    public void jieshao() {
        System.out.println("大家好，我是" + id + "号" + name);
    }
}