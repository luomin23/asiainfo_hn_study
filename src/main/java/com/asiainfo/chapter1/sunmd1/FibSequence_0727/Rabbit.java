package com.asiainfo.chapter1.sunmd1.FibSequence_0727;

/**
 * Created by Administrator on 2017/7/26 0026.
 */
public class Rabbit{

    //年龄
    private int age = 1;

    public int getUp(){
        return this.age++;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
