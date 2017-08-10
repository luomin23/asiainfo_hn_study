package com.asiainfo.chapter1.dongwenchao.day14;

import com.asiainfo.chapter1.dongwenchao.zuoye1.demo1;

import java.lang.reflect.Field;

/**
 * Created by 超超 on 2017/8/9 0009.
 */
public class demo3 {
    public static void run() throws IllegalAccessException, InstantiationException, NoSuchFieldException {
        Class<?> class1=null;
        class1=demo1.class;
        Object obj=class1.newInstance();
        Field f=class1.getField("Id");
        f.setAccessible(true);
      //  System.out.println(f.get());
    }
    public static void main(String[]args){
        demo3 a=new demo3();
       // a.run();
    }
}
