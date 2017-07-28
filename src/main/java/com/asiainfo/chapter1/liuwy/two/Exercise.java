package com.asiainfo.chapter1.liuwy.two;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;


/**@author  liuwy
 * Created by LENOVO on 2017/7/25.
 */


public class Exercise {
    public static  void  main(String[] args){
        //counter();
        //grade();
       //game();
        //suiji();
        //cheng();
        //zu();
        rzu();
        //maopao();

    }
    //收银系统
    public  static void counter(){
        float x,y,z;
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入单价（￥）");
        x=scanner.nextFloat();
        System.out.println("请输入数量（￥）");
        y=scanner.nextFloat();
        System.out.println("请输入金额（￥）");
        z=scanner.nextFloat();
        float sum=x*y;
        if(sum>=500){
            sum=sum*4/5;
        }
        float zhao=z-sum;
        System.out.println("应收金额为：￥"+sum+",找零为：￥"+zhao);


    }

    public static void grade(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入该学员的分数（0-100）：");
        float x=scanner.nextFloat();
        if(x<0||x>100){
            System.out.println("请输入0到100以内的分数！");
            x=scanner.nextFloat();}
        if(x>=90){
            System.out.println("A");
        }else if(x>=80){
            System.out.println("B");
        }else if(x>=60){
            System.out.println("C");
        }else{
            System.out.println("D");
        }
    }

    public static void game(){
        Scanner scanner=new Scanner(System.in);
        int x=60;
        int y;
        while(true){
            System.out.println("请输入你猜的数字（1-1000），退出请按0：");
            y=scanner.nextInt();

            if(y<x){
                System.out.println("太小了！");
            }
            if(y>x){
                System.out.println("太大了！");
            }
            if(y==x){
                System.out.println("恭喜！你猜对了！");
                break;
            }
            if(y==0){
                System.out.println("真遗憾，下次再挑战吧！");
                break;
            }
        }
    }


    public static void suiji(){
        Scanner scanner=new Scanner(System.in);
        int x;
        System.out.println("将开始10次加法测试。。。");
        int i=1;
        int count=0;
        do{

            int a= new Random().nextInt(100);
            int b= new Random().nextInt(100);
            int sum=a+b;
            System.out.println("("+i+")."+a+"+"+b+"=?");
            System.out.println("请输入答案（输入-1退出）：");
            x=scanner.nextInt();
            if(x==sum){
                System.out.println("Corrert!");
                count+=10;
            }if(x!=sum&&x!=-1){
                System.out.println("Error!");
            }
            if(x==-1){
                break;
            }
            i++;
        }while(i<11);
        System.out.println("此次测验结束，你的分数是："+count);

    }

    public static void cheng(){
        for(int i=1;i<10;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j+" ");

            }
            System.out.println();
        }
    }

    public static void zu(){
        int[] a={10,60,12,55,66,88,99,77,22,33};

        System.out.println("数组中的数据为"+Arrays.toString(a));

        Arrays.sort(a);
        System.out.println("最大值是："+a[9]);
    }

    public static void rzu(){

        int[] a={10,60,12,55,66,88,99,77,22,33};

        System.out.println("数组中的数据为："+Arrays.toString(a));
        int[] b=Arrays.copyOf(a,11);
        //int[] b=new int[11];
        //for(int i=0;i<10;i++){
        //b[i]=a[i];}
        int max=b[0];
        for(int i=1;i<10;i++){
            if(a[i]>max){
                max=a[i];

            }
        }
        b[10]=max;
        System.out.println("最大值是："+b[10]);
        System.out.println("新数组中的数据为："+Arrays.toString(b));
    }

    public static void maopao(){
        int[] a={8,54,17,11,97,68,72,75,22,75};

        System.out.println(Arrays.toString(a));
        System.out.println("------------冒泡排序开始-----------");
        int p;

        for(int j=0;j<9;j++){
            for(int i=0;i<9;i++){
                if(a[i]>a[i+1]){
                    p=a[i];
                    a[i]=a[i+1];
                    a[i+1]=p;
                }

            }
            System.out.println(Arrays.toString(a));

        }
        System.out.println("------------冒泡排序结束-----------");
        System.out.println(Arrays.toString(a));


    }
}

