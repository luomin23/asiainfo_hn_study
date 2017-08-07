package com.asiainfo.chapter1.fengzx.Aug07;

import java.lang.reflect.Constructor;

/**
 * Created by fengzx on 2017/8/7.
 */
public class ReflectDemo {
    public static void main(String[] args) throws Exception, IllegalAccessException, InstantiationException {
//        Person p = new Person();
//        Person p2 = new Person();
//        System.out.println(p == p2);  //false
//
//        Class c = p.getClass();
//        Class c2 = p2.getClass();
//        System.out.println(c == c2);  //true
//
//        Class c3 = Person.class;
//        System.out.println(c == c3);  //true
//
//        Class c4 = Class.forName("com.asiainfo.chapter1.fengzx.Aug07.Person");
//        System.out.println(c == c4);  //true

        Class c = Class.forName("com.asiainfo.chapter1.fengzx.Aug07.Person");
        Constructor con = c.getConstructor();
        Object obj = con.newInstance();
        System.out.println(obj);
    }
}
