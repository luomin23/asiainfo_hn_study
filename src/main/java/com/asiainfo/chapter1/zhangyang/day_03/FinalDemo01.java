package com.asiainfo.chapter1.zhangyang.day_03;

/**
 * Created by 11 on 2017/7/26.
 */
/*
 * Final关键字修饰常量
 */
public class FinalDemo01 {
    final float PI=3.14F;//定义常量PI，并初始化
    final int arrInt[]={1,2,3,4};//定义数组变量，并始化
    final int num;//定义fina常量，在构造快中初始化
    final String str;//定义fina常量，在构造方法中初始化
    {
        num=100;//一旦初始化不能被修改
    }
    public FinalDemo01(){
        str = "java编程手记";//一旦初始化不能被修改
    }
    public static void main(String[] args) {
        final char c= 'A';//在方法中定义常量，并初始化
        FinalDemo01 f = new FinalDemo01();
        System.out.println("PI="+f.PI);
        System.out.println("str="+f.str);
        System.out.println("i="+f.num);
        System.out.println("c="+c);
        System.out.println("修改数组属性前");
        for(int i = 0;i<4;i++){//输出未修改final修饰的数组元素
            System.out.print(f.arrInt[i]+" ");
        }
        System.out.println("\n修改数组属性后");
        for(int i=0;i<f.arrInt.length;i++){//修改元素属性
            f.arrInt[i]=f.arrInt[i]*10;
        }
        for(int i= 0;i<f.arrInt.length;i++){
            System.out.print(f.arrInt[i]+" ");//输出已经修改final修饰的数组
        }
        System.out.println();
    }
}
