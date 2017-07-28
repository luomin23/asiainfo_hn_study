package com.asiainfo.chapter1.liuwy.three;

/**
 * Created by LENOVO on 2017/7/26.
 */
public class AccountantTeacher extends Teacher{
    private String id;
    private String date;

    public AccountantTeacher(String name, int age, double salary, String id, String date) {
        super(name, age, salary);
        this.id = id;
        this.date = date;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("注册会计师证号："+this.id);
        System.out.println("注册会计师时间："+this.date);
    }
}
