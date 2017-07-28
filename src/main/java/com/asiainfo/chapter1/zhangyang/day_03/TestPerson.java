package com.asiainfo.chapter1.zhangyang.day_03;

/**
 * Created by 11 on 2017/7/26.
 */
public class TestPerson {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAge(18);
        s1.setName("哈哈");
        // 子类中没有定义，调用父类的方法
        s1.setSchool("北大");// 子类中定义，访问子类的方法
        s1.say();
        System.out.println("我叫：" + s1.getName() + "  今年：" + s1.getAge()
                + " 就读于:" + s1.getSchool());
    }
}
