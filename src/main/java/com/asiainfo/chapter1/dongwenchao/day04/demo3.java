package com.asiainfo.chapter1.dongwenchao.day04;

/**
 * Created by 超超 on 2017/7/27 0027.
 */
public class demo3 {
    private String name;
    private String ID;
    private double xiaoshoue;
    private double tichenglv;

    public demo3(String name, String ID, double xs, double tc) {
        this.name = name;
        this.ID = ID;
        this.xiaoshoue = xs;
        this.tichenglv = tc;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getXiaoshoue() {
        return xiaoshoue;
    }

    public void setXiaoshoue(double xs) {
        xiaoshoue=(xs<0.0)?0.0:xs;
    }

    public double getTichenglv() {
        return tichenglv;
    }

    public void setTichenglv(double tc) {
        tichenglv =(tc>0.0&&tc<1.0)?tc:0.0;
    }
    public double earnings(){
        double o=xiaoshoue*tichenglv;
        return o;
    }
    public String toString(){
        return String.format("%s:%s\n%s: %s\n" +
                "%s: %.2f\n%s: %.2f","员工姓名",name,"员工编号",ID,"销售额",xiaoshoue,"提成率",tichenglv);
    }
}
