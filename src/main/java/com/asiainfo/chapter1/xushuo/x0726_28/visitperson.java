package com.asiainfo.chapter1.xushuo.x0726_28;
/**
 * Created by root on 2017/7/26.
 * 封装
 */
public class visitperson {
    public static void main(String args[]){
        person encap = new person();
        encap.setName("James");
        encap.setAge(20);
        encap.setIdNum("12343ms");

        System.out.print("Name : " + encap.getName()+
                " Age : "+ encap.getAge());
    }
}
