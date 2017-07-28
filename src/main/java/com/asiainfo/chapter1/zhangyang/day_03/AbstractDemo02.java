package com.asiainfo.chapter1.zhangyang.day_03;

/**
 * Created by 11 on 2017/7/26.
 */
abstract class Shape{
    private float width;
    private float high;
    public Shape(){

    }
    public Shape(float high, float width){
        this.high=high;
        this.width=width;
    }
    public float getWidth() {
        return width;
    }
    public void setWidth(float width) {
        this.width = width;
    }
    public float getHigh() {
        return high;
    }
    public void setHigh(float high) {
        this.high = high;
    }
    public abstract void area();
    public abstract void Circum();
}
class Rectangle extends Shape{
    public Rectangle(){

    }
    public Rectangle(float width,float high) {
        super(width,high);
    }
    public void area() {
        System.out.println("矩形的面积："+(getHigh()*getWidth()));
    }
    public void Circum() {
        System.out.println("矩形的周长："+(getHigh()+getWidth())*2);

    }

}
public class AbstractDemo02 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3.0F,4.0F);
        r1.area();
        r1.Circum();
    }
}
