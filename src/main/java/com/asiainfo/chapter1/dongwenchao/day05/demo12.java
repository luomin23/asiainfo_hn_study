package com.asiainfo.chapter1.dongwenchao.day05;

/**
 * Created by 超超 on 2017/7/30 0030.
 */
public class demo12 {
    private String name ;
    private int age ;
    public demo12(String name,int age){
        this.name = name ;
        this.age = age ;
    }
    public void setName(String name){
        this.name = name ;
    }
    public void setAge(int age){
        this.age = age ;
    }
    public String getName(){
        return this.name ;
    }
    public int getAge(){
        return this.age ;
    }
    public String getInfo(){
        return "姓名：" + this.name + "，年龄：" + this.age ;
    }
}
