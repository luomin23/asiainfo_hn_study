package com.asiainfo.chapter1.dongwenchao.day06;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 超超 on 2017/7/31 0031.
 */
public class demo8 {
    public static void main(String[] args){
    List<String> name=new ArrayList<String>();
    List<Integer> age=new ArrayList<Integer>();
    List<Number> number=new ArrayList<Number>();
    name.add("董稳超");
    age.add(12);
    number.add(258);
    getDate(name);
    getDate(age);
    getDate(number);
    }
    private static void getDate(List<?> date) {
        System.out.println(date.get(0));
    }
}
