package com.asiainfo.chapter1.fengzx.Aug07;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * Created by fengzx on 2017/8/7.
 */
public class ReflectDemo3 {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("com.asiainfo.chapter1.fengzx.Aug07.Person");
        Constructor con = c.getConstructor();
        Object obj = con.newInstance();

        Field addressField = c.getField("address");
        addressField.set(obj,"郑州");
        System.out.println(obj);

        Field nameField = c.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(obj,"fengzx");
        System.out.println(obj);

        Field ageField = c.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(obj,20);
        System.out.println(obj);

    }
}
