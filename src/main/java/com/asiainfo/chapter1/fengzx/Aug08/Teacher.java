package com.asiainfo.chapter1.fengzx.Aug08;

/**
 * Created by fengzx on 2017/8/8.
 */
public class Teacher {
    private Teacher(){}

    private static Teacher t = null;

    public static Teacher getTeacher(){
        if (t == null){
            t = new Teacher();
        }
        return t;
    }

    public void show(){
        System.out.println("show");
    }
}
