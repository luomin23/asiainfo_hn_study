package com.asiainfo.chapter1.zhangyang.week7_day_03.entity;

import java.util.Date;

/**
 * Created by 11 on 2017/8/21.
 */
public class Student {
    private String sno;
    private String sname;
    private Date birthday;
    private String major;
    private int age;
    private int gender;

    public Student(String sno, String sname, Date birthday, String major, int age, int gender) {
        this.sno = sno;
        this.sname = sname;
        this.birthday = birthday;
        this.major = major;
        this.age = age;
        this.gender = gender;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }
}
