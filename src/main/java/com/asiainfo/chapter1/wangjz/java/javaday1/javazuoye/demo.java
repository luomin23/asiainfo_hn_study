package com.asiainfo.chapter1.wangjz.java.javaday1.javazuoye;

/**
 * Created by wjz123456 on 2017/8/9.
 */
public class demo {
    private String name;
    private  String age;
    public  String add;
    public  String tel;
    public  String email;

    public demo(String add, String age, String email, String name, String tel) {

        this.add = add;
        this.age = age;
        this.email = email;
        this.name = name;
        this.tel = tel;
    }

    public demo() {
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public  void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "demo{" +
                "add='" + add + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
