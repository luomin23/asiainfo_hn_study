package com.asiainfo.chapter1.zhangyang.day_02;

/**
 * Created by 11 on 2017/7/25.
 */
import java.util.Scanner;

public class TestPay {

    public static void main(String[] args) {
        //输入数据
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入单价：");
        double UnitPrice = scan.nextDouble();
        System.out.println("请输入数量：");
        double count = scan.nextDouble();
        System.out.println("请输入金额：");
        double amount = scan.nextDouble();
        double Totalpay = 0.0;
        Totalpay = UnitPrice*count;
        if(Totalpay>=500){
            Totalpay = Totalpay*0.8;
        }
        double change = amount - Totalpay;
        System.out.println("应收金额："+Totalpay+"找零为："+change);
    }
}
