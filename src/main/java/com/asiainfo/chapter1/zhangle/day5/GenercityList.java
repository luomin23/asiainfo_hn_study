package com.asiainfo.chapter1.zhangle.day5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by del on 2017/7/28.
 * 类型通配符   一般是使用?代替具体的类型参数。
 */
public class GenercityList {

    public static void getDate(List<?> data){
        System.out.println("data:"+data.get(0));
    }

    public static void main(String[] args) {
        List<String> string=new ArrayList<String>();
        List<Integer> integer=new ArrayList<Integer>();
        string.add("name");
        integer.add(16);
        getDate(string);
        getDate(integer);
    }
}
