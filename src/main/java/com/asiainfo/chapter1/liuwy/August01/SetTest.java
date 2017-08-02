package com.asiainfo.chapter1.liuwy.August01;

import com.asiainfo.chapter1.liuwy.six.Student;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by LENOVO on 2017/8/1.
 */
public class SetTest {
    public static void main(String[] args){
        Set<Student> setstu=new HashSet<Student>();
        setstu.add(new Student(1,"张三",91));
        setstu.add(new Student(2,"李四",90));
        setstu.add(new Student(3,"王五",92));

        for (Student stu:setstu) {
            System.out.println(stu.getId()+" "+stu.getName()+" "+stu.getScrod());

        }


    }
}
