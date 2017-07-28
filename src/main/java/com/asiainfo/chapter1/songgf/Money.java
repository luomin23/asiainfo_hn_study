package com.asiainfo.chapter1.songgf;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/7/26 0026.
 */
public class Money {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        //付款
      /*  System.out.println("请输入产品单价");
        float fPrice = input.nextFloat();
        System.out.println("请输入产品数量");
        int num = input.nextInt();
        System.out.println("请输入付款金额");
        int payMoney = input.nextInt();
        float allPrice = fPrice*num;
        if(allPrice>=500){
            if(payMoney>=allPrice*0.8){
                System.out.println("应收金额为:"+allPrice*0.8+",找零钱为"+(payMoney-allPrice));
            }else{
                System.out.println("付款钱数不足");
            }
        }else{
            if(payMoney>=allPrice){
                System.out.println("应收金额为:"+allPrice+",找零钱为"+(payMoney-allPrice));
            }else{
                System.out.println("付款金额不足");
            }
        }
        //分数成绩
        System.out.println("请输入该学生的分数");
        float fGrade = input.nextFloat();
        boolean flag = false;
        if(fGrade>100){
            System.out.println("输入的成绩信息有误");
        }else{
            flag=true;
        }
        if(flag){
            if(fGrade>=90){
                System.out.println("A");
            }else if(fGrade>=80){
                System.out.println("B");
            }else if(fGrade>=60){
                System.out.println("C");
            }else{
                System.out.println("D");
            }
        }

        //猜数字游戏
        Random random = new Random();
        int randomNum = random.nextInt(1000);
        System.out.println(randomNum);
        while (true) {
            System.out.print("请输入你猜测1-1000的数字，退出请按0:");
            int iNum = input.nextInt();
            if(iNum==0){
                System.out.println("真遗憾下次再挑战吧");
                System.exit(0);
            }
            if(iNum>randomNum){
                System.out.println("太大了");
            }else if(iNum<randomNum){
                System.out.println("太小了");
            }else{
                System.out.println("恭喜你猜对了");
            }
        }

        //随机加法运算器
	    System.out.println("将开始十次加法考试");
        Random random = new Random();
        int sumGrade = 0;
        for(int i = 0;i<10;i++){
            int randomNumFirst = random.nextInt(100);
            int randomNumLast = random.nextInt(100);
            System.out.println("第"+(i+1)+"题:"+randomNumFirst+"+"+randomNumLast);
            System.out.print("请输入答案");
            int m = input.nextInt();
            if(m==-1){
                System.out.println("此次测试结束");
                System.out.println("你的成绩为"+sumGrade+"分");
                System.exit(0);
            }
            if(m==(randomNumFirst+randomNumLast)){
                System.out.println("correct");
                sumGrade +=10;
            }else{
                System.out.println("error");
            }
        }
        System.out.println("总成绩为："+sumGrade+"分");*/

        //九九乘法表
        for (int i = 1; i <=9; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+"*"+i+"="+j*i+"\t");
            }
            System.out.println();
        }

        //第六题数组元素的最大值
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=random.nextInt(100);
        }
        System.out.print("数组元素为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
        System.out.println();
        int max = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
                index = i;
            }
        }
        System.out.println("最大值为："+max);

        //将数组元素的最大值放到最后一个位置
        System.out.print("新的数组元素为");
        for (int i = 0; i < arr.length; i++) {
            if(i<index){
            }else if(i != arr.length-1){
                arr[i]=arr[i+1];
            }else {
                arr[i]=max;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
        System.out.println();

        System.out.println("...........冒泡程序.................");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] = temp;
                }
            }

            System.out.print("第"+i+1+"次排序");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j]+",");
            }
            System.out.println();
        }

        System.out.println("........排序后.........");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
    }
}
