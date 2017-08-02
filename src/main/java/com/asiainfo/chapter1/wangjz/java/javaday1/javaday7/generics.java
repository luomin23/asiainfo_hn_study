package com.asiainfo.chapter1.wangjz.java.javaday1.javaday7;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wjz123456 on 2017/8/2.
 */
public class generics {
    //泛型方法
    public static<E> void printArray(E[] inputArray){
        for (E e:inputArray){
            System.out.printf("%s",e);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[]a={1,2,3,4,5};
        Double []b={2.0,3.0,4.0};
        String[] s={"W","J","Z"};
        printArray(a);
        printArray(b);
        printArray(s);

        List<String>name=new ArrayList<String>();
        List<Integer>age=new ArrayList<Integer>();
        List<Number>num=new ArrayList<Number>();
        name.add("wjz");
        age.add(21);
        num.add(101);
        getData(name);
        getData(age);
        getData(num);
    }

    public static void getData(List<?> data) {
        System.out.println(data.get(0));
    }
}
