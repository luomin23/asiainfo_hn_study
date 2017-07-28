package com.asiainfo.chapter1.zhangyang.zyjavaday_01.day_03;

/**
 * Created by 11 on 2017/7/26.
 */
interface InterShape{//定义接口
    public static final float PI=3.14F;//定义变量
}
abstract class Sphere implements InterShape{//抽象类实现接口，并定义抽象方法
    public abstract void volume();
}
class Round1 extends Sphere {
    private float radius;
    public Round1(){

    }
    public Round1 (float radius){
        setRadius(radius);
    }


    public float getRadius() {
        return radius;
    }
    public void setRadius(float radius) {
        this.radius = radius;
    }
    public void volume() {
        System.out.println("球体的体积："+(4/3*InterShape.PI*Math.pow(getRadius(), 3)));

    }

}
public class InterfaceDemo01 {
    public static void main(String[] args) {
        Round1 r1 = new Round1(4.0F);
        r1.volume();
    }

}
