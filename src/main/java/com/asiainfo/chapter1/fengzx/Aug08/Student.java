package com.asiainfo.chapter1.fengzx.Aug08;

/**
 * Created by fengzx on 2017/8/8.
 */
public class Student {
    private Student(){}

    private static Student s = new Student();

    public static Student getStudent(){
        return s;
    }

    public void show(){
        System.out.println("show");
    }
}
