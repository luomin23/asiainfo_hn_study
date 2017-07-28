package com.asiainfo.chapter1.fengzx.July27;

/**
 * Created by fengzx on 2017/7/27.
 */

class Square{
    private int width;
    private int longth;

    public Square(){}

    public Square(int longth,int width){
        this.width = width;
        this.longth = longth;
    }

    public void setWidth(int width){
        this.width = width;
    }
    public int getWidth(){
        return width;
    }
    public void setLongth(int longth){
        this.longth = longth;
    }
    public int getLongth(){
        return longth;
    }
    public int getArea(){
        return width * longth;
    }
    public int getGirth(){
        return 2*(width + longth);
    }
}

public class SquareDemo {
    public static void main(String[] args){
        Square s = new Square();
        s.setLongth(10);
        s.setWidth(5);
        System.out.println("长为："+s.getLongth()+"  宽为："+s.getWidth());
        System.out.println("面积为："+s.getArea()+"  周长为："+s.getGirth());

        Square s1 = new Square(20,10);
        System.out.println("长为："+s1.getLongth()+"  宽为："+s1.getWidth());
        System.out.println("面积为："+s1.getArea()+"  周长为："+s1.getGirth());
    }
}
