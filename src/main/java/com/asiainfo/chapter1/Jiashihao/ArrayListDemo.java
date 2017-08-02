package com.asiainfo.chapter1.Jiashihao;

/**
 * Created by lenovo on 2017/8/2.
 */
import java.util.ArrayList;
import java.util.List;
public class ArrayListDemo {
    public static void main(String[] args){
        List<String> allList = null;
        allList = new ArrayList<String>();
        allList.add("Hello");
        allList.add(0,"World");
        allList.add("JSH");
        allList.add("J");
        allList.remove(0);
        allList.remove("Hello");
        System.out.println(allList);
    }
}
