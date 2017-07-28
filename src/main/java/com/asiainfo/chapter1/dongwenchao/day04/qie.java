package com.asiainfo.chapter1.dongwenchao.day04;

/**
 * Created by 超超 on 2017/7/27 0027.
 */
public class qie extends demo2{
    public qie(String myname, int myid) {
        super(myname, myid);
    }
    public void he(){
        int h=5;
        String str="董稳超";
        System.out.println(str+"一口气喝"+h);
    }
    public static void main (String [] args){
        qie a=new qie("小企鹅", 5);
        a.eat();
        a.sleep();
        a.jieshao();
        a.he();
    }
}
