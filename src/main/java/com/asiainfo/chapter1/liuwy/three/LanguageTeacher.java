package com.asiainfo.chapter1.liuwy.three;

/**
 * Created by LENOVO on 2017/7/26.
 */
public class LanguageTeacher extends Teacher{
    private String languages;
    private String grade;

    public LanguageTeacher(String name, int age, double salary, String languages, String grade) {
        super(name, age, salary);
        this.languages = languages;
        this.grade = grade;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("外语语种："+this.languages);
        System.out.println("外语等级："+this.grade);
    }
}
