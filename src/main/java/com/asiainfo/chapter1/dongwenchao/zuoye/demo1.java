package com.asiainfo.chapter1.dongwenchao.zuoye;

/**
 * Created by 超超 on 2017/8/4 0004.
 */
public class demo1 {
    private String Id;
    private String Name;
    private String Sex;
    private String Age;
    demo1(String Id ,String Name, String Sex, String Age) {
        this.Id = Id; //default
        this.Name = Name;
        this.Sex = Sex;
        this.Age = Age;
    }
    public demo1(){

    }
    public String getId() {
        return Id;
    }
    public void setId(String id) {
        Id = id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getSex() {
        return Sex;
    }
    public void setSex(String sex) {
        Sex = sex;
    }
    public String getAge() {
        return Age;
    }
    public void setAge(String age) {
        Age = age;
    }
}

