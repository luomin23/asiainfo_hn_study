package com.asiainfo.chapter1.dongwenchao.day06;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 超超 on 2017/7/31 0031.
 */
public class demo4 {
    public static void main(String[] args){
        List<String> list=new ArrayList<String>();
        list.add("董稳超");
        list.add("王景州");
        //list.add(100);   // 1  提示编译错误
        for (int i=0;i<list.size();i++){
            String name = list.get(i); // 2
            System.out.println("姓名:" + name);
        }

    }
}
