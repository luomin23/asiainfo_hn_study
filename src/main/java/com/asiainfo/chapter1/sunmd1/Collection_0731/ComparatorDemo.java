package com.asiainfo.chapter1.sunmd1.Collection_0731;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Comparator:比较器
 *
 *
 */
public class ComparatorDemo {

    public static void main(String[] args) {
        Student s1 = new Student("胡歌",28);
        Student s2 = new Student("彭于晏",18);
        Student s3 = new Student("霍建华",30);
        Student s4 = new Student("袁弘",28);

        List<Student> list = new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        //按照年龄排序,相同年龄按照姓名排序

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num = o1.getAge()-o2.getAge();
                int num2 = num == 0? o1.getName().compareTo(o2.getName()): num;
                return num2;
            }
        });

        //遍历集合
        for (Student s:list) {
        System.out.println(s);
        }

        }


        }
