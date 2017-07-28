package com.asiainfo.chapter1.zhangyang.day_03;

/**
 * Created by 11 on 2017/7/26.
 */
interface InterShape1{//定义接口
    public static final float PI=3.14F;//定义变量
    public abstract void area();//定义抽象方法
    public abstract void Circum();//
}
class Round implements InterShape1{
    private float radius;//定义半径
    public Round(){//定义无参构造方法

    }
    public Round(float radius){//定义有参构造方法
        setRadius(radius);
    }

    public void area() {
        System.out.println("圆的面积："+(getRadius()*getRadius()*InterShape1.PI));
        //实现接口中的方法
    }

    public void Circum() {//实现接口中的方法
        System.out.println("圆的周长："+(2*getRadius()*InterShape1.PI));

    }
    public float getRadius() {
        return radius;
    }
    public void setRadius(float radius) {
        this.radius = radius;
    }

}
public class InterfaceDemo {
    public static void main(String[] args) {
        Round r = new Round(4.0F);
        r.area();
        r.Circum();
    }

}

