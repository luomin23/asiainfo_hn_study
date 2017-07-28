package com.asiainfo.chapter1.dongwenchao.day05;

/**
 * Created by 超超 on 2017/7/28 0028.
 */
public class demo3 extends demo2{
    private double zhouxin;
    public demo3(String name,String ID,double zx){
        super(name,ID);
        setzhouxin(zx);
    }

    public double getZhouxin() {
        return zhouxin;
    }
    public void setzhouxin(double zx) {
        zhouxin=zx<0.0?0.0:zx;
    }
    public double earnings(){
        return getZhouxin();
    }
    public double earnings1(){
        return getZhouxin();
    }
    public String toString(){
        return String.format("周薪工资：\n %s %s: % , .2f" ,
                super.toString(),"工资",getZhouxin());
    }
}
