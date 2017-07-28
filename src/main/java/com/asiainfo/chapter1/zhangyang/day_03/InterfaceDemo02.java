package com.asiainfo.chapter1.zhangyang.zyjavaday_01.day_03;

/**
 * Created by 11 on 2017/7/26.
 */
interface InterPI{
    public static final float PI=3.14F;
}
interface InterArea{
    public abstract void area();
}
interface InterCircun{
    public abstract void Circum();
}
interface InterVolume extends InterArea,InterCircun,InterPI{
    public abstract void volume();
}
class Round2 implements InterVolume{
    private float radius;
    public Round2(){

    }
    public Round2 (float radius){
        setRadius(radius);
    }

    public float getRadius() {
        return radius;
    }
    public void setRadius(float radius) {
        this.radius = radius;
    }
    public void area() {
        System.out.println("圆的面积："+(getRadius()*getRadius()*InterPI.PI));

    }
    public void Circum() {
        System.out.println("圆的周长："+(2*getRadius()*InterPI.PI));
    }
    public void volume() {
        System.out.println("球体的体积："+(4/3*InterPI.PI*Math.pow(getRadius(), 3)));

    }

}
public class InterfaceDemo02 {
    public static void main(String[] args) {
        Round2 r2 = new Round2(4.0F);
        r2.area();
        r2.Circum();
        r2.volume();
    }

}
