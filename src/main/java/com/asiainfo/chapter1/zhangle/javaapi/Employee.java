package com.asiainfo.chapter1.zhangle.javaapi;

/**
 * Created by del on 2017/7/31.
 */
public class Employee implements java.io.Serializable {
    public String name;
    public int password;
    public void mailCheck(){
        System.out.println("check name:"+name+"password:"+password);
    }
}
