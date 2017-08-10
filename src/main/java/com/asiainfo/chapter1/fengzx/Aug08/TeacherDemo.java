package com.asiainfo.chapter1.fengzx.Aug08;

/**
 * Created by fengzx on 2017/8/8.
 */
public class TeacherDemo {
    public static void main(String[] args) {
        Teacher t1 = Teacher.getTeacher();
        Teacher t2 = Teacher.getTeacher();
        System.out.println(t1 == t2);
    }
}
