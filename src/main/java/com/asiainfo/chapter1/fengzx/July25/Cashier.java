package com.asiainfo.chapter1.fengzx.July25;

import java.util.Scanner;

/**
 * Created by fengzx on 2017/7/25.
 */
public class Cashier {
    public static void main(String[] args){
        System.out.println("请输入单价：");
        Scanner input1 = new Scanner(System.in);
        double unitprice = input1.nextDouble();

        System.out.println("请输入数量：");
        Scanner input2 = new Scanner(System.in);
        double number = input2.nextDouble();

        System.out.println("请输入收款金额：");
        Scanner input3 = new Scanner(System.in);
        double receive = input3.nextDouble();

        double price,prices,change;
        price = unitprice * number;
        if (price >= 500) {
            prices = price * 0.8;
        }
        else {
            prices = price;
        }
        change = receive - prices;

        System.out.println("应收金额为：" + prices + "   找零为：" + change);

    }
}
