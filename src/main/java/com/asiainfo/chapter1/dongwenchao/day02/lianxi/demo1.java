package com.asiainfo.chapter1.dongwenchao.day02.lianxi;

import java.util.Scanner;

/**
 * Created by 超超 on 2017/7/25 0025.
 */
public class demo1 {
    public static void main(String[] args){
        Scanner a =new Scanner(System.in);
        System.out.println("请输入单价￥");
        double danjia = a.nextDouble();
        System.out.println("请输入数量");
        double shuliang = a.nextDouble();
        System.out.println("请输入金额￥");
        double jine = a.nextDouble();
        double yingshou=0.0;
        double zhaoling=0.0;
        yingshou=danjia*shuliang;
        if (yingshou>500){
            yingshou=yingshou*0.8;
        }else {
            yingshou=yingshou;
        }
        zhaoling=jine-yingshou;
        System.out.println("应收金额：￥"+yingshou +"，找零为：￥" +zhaoling);
    }
}
