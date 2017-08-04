package com.asiainfo.chapter1.Jiashihao.java84;

import java.io.Serializable;

/**
 * Created by lenovo on 2017/8/4.
 */
import java.io.Serializable;
public class Person0 implements Serializable {
    private String name;
    private int age;
    public Person0(String name,int age){
        this.age = age;
        this.name = name;
    }
    public String toString(){
        return"姓名："+this.name+";年龄"+this.age;
    }
}
