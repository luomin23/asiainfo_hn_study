package com.asiainfo.chapter1.liuwy.three;

/**
 * Created by LENOVO on 2017/7/26.
 */
public class ComputetTeacher extends Teacher{
    private String languages;
    private String post;

    public ComputetTeacher(String name, int age, double salary, String languages, String post) {
        super(name, age, salary);
        this.languages = languages;
        this.post = post;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("计算机语言："+this.languages);
        System.out.println("项目任务："+this.post);
    }
}
