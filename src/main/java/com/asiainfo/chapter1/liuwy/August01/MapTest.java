package com.asiainfo.chapter1.liuwy.August01;


import com.asiainfo.chapter1.liuwy.six.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by LENOVO on 2017/8/1.
 */
public class MapTest {
    public  static void main(String[] args){
        Map<String,Student> mapstu=new HashMap<String, Student>();


        mapstu.put("一组组长",new Student(1,"张三",91));
        mapstu.put("一组组长",new Student(2,"李四",90));
        mapstu.put("一组组长",new Student(3,"王五",92));

        Student student=mapstu.get("一组组长");
        System.out.println(student.getScrod());
        Set<Map.Entry<String,Student>> entrySet=mapstu.entrySet();
        for (Map.Entry<String,Student> entry:entrySet) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }

}
