package com.asiainfo.chapter1.zhangyang.zyjavaday_01.day_02;

/**
 * Created by 11 on 2017/7/25.
 */
import java.util.Scanner;

public class TestPay {

    public static void main(String[] args) {
        //��������
        Scanner scan = new Scanner(System.in);
        System.out.println("�����뵥�ۣ�");
        double UnitPrice = scan.nextDouble();
        System.out.println("������������");
        double count = scan.nextDouble();
        System.out.println("�������");
        double amount = scan.nextDouble();
        double Totalpay = 0.0;
        Totalpay = UnitPrice*count;
        if(Totalpay>=500){
            Totalpay = Totalpay*0.8;
        }
        double change = amount - Totalpay;
        System.out.println("Ӧ�ս�"+Totalpay+"����Ϊ��"+change);
    }
}
