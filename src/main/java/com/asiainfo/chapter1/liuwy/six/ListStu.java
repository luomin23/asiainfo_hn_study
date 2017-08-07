package com.asiainfo.chapter1.liuwy.six;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by LENOVO on 2017/7/31.
 */
public class ListStu {
    public static void main(String[] args){
        List<Student> stus=new ArrayList<Student>();
        stus.add(new Student(1,"liu",99));
        stus.add(new Student(5,"yan",98));
        stus.add(new Student(2,"wen",97));

        Collections.sort(stus);

        for (Student stu:stus) {
            System.out.println(stu.getId()+stu.getName()+stu.getScrod());

        }

        Collections.sort(stus, new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                if(student.getScrod()>t1.getScrod()){
                    return -1;
                }else {
                    return 1;
                }

            }
        });
        System.out.println("按分数排名");
        for (Student student:stus) {
            System.out.println(student.getId()+":"+student.getName()+":"+student.getScrod());

        }
        System.out.println("按名字排名");
        Collections.sort(stus, new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                return student.getName().compareTo(t1.getName());

            }
        });
        for (Student student:stus) {
            System.out.println(student.getId()+":"+student.getName()+":"+student.getScrod());

        }
    }
}
