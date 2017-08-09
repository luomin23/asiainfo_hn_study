package com.asiainfo.chapter1.fengzx.Aug09;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * Created by fengzx on 2017/8/9.
 */
public class ArrayListDemo {
    public static void main(String[] args) throws Exception{
        ArrayList<Integer> array = new ArrayList<Integer>();

        Class c = array.getClass();

        Method m = c.getMethod("add",Object.class);

        m.invoke(array,"hello");
        m.invoke(array,"world");
        m.invoke(array,20);

        System.out.println(array);

    }
}
