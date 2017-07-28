package com.asiainfo.chapter1.liuwy.four;

/**
 * Created by LENOVO on 2017/7/27.
 */
public class Bird{
    private String name;
    private String color;
    private Fly fly;

    public Fly getFly() {
        return fly;
    }

    public void setFly(Fly fly) {
        this.fly = fly;
    }

    public Bird(String name, String color) {
        this.name = name;
        this.color = color;
        System.out.println(this.color+this.name);
    }

    public void fly(){
        fly.fly();
    }


}
