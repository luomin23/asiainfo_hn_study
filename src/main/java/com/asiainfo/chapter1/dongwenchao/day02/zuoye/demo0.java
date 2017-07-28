package com.asiainfo.chapter1.dongwenchao.day02.zuoye;

import java.util.Scanner;

/**
 * Created by 超超 on 2017/7/25 0025.
 */
public class demo0 {
    public static void main(String[] args){
        Scanner tiqu =new Scanner(System.in);//运用Scanner类创建对象tiqu 调用里面的一些方法。
        System.out.println("请输入单价￥：");
        double danjia = tiqu.nextDouble();
        System.out.println("请输入数量：");
        double shuliang = tiqu.nextDouble();
        System.out.println("请输入金额￥：");
        double jine = tiqu.nextDouble();
        tiqu.close();
        //算出商品的价格
        double totalPrice = 0.0;
        totalPrice = danjia * shuliang;
        if (totalPrice>=500){
            totalPrice = totalPrice * 0.8;
        }
        //计算找零
        double lingqian = jine - totalPrice;
        System.out.println("应收金额为：￥" + totalPrice + "，找零为：￥" + lingqian);
    }
}
