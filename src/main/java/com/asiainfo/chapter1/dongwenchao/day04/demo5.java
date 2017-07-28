package com.asiainfo.chapter1.dongwenchao.day04;

/**
 * Created by 超超 on 2017/7/27 0027.
 */
public class demo5 extends demo3{
    private double base;
    public demo5(String name, String ID, double xs, double tc,double ba){
        super(name ,ID,xs,tc);
        setbase(ba);
    }
    public void setbase(double ba) {
        base=(ba<0.0)?0.0:ba;
    }
    public double getBase() {
        return base;
    }
    public double earnings(){
        return getBase()*getXiaoshoue();
    }
}
