package com.asiainfo.chapter1.liuwy.six;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by LENOVO on 2017/7/31.
 */
public class ListStu {
    public static void main(String[] args){
        List<Student> stus=new ArrayList<Student>();
        stus.add(new Student(1,"liu",99));
        stus.add(new Student(5,"yan",99));
        stus.add(new Student(2,"wen",99));

        Collections.sort(stus);

        for (Student stu:stus) {
            System.out.println(stu.getId()+stu.getName()+stu.getScrod());

        }
    }
}
