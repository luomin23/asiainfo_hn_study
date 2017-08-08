package com.asiainfo.chapter1.fengzx.Aug07;

import java.lang.reflect.Constructor;

/**
 * Created by fengzx on 2017/8/7.
 */
public class ReflectDemo2 {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("com.asiainfo.chapter1.fengzx.Aug07.Person");
        Constructor con = c.getDeclaredConstructor(String.class);
        //System.out.println(con);

        con.setAccessible(true);
        Object obj = con.newInstance("fengzx");
        System.out.println(obj);


        Constructor con1 = c.getConstructor(String.class,int.class,String.class);
        Object obj1 = con1.newInstance("fengzx",20,"郑州");
        System.out.println(obj1);
    }
}
