package com.asiainfo.chapter1.liangzhiqiang.day7;

/**
 * Created by 君不悔 on 2017/8/1.
 */
public class Maths {
    public static void main(String[]args){
        System.out.println("计算机绝对值的结果："+ Math.abs(-1));
        System.out.println("求大于参数的最小整数："+ Math.ceil(5.6));
        System.out.println("求小于参数的最大整数："+ Math.floor(-4.2));
        System.out.println("对小数进行四舍五入后的结果："+ Math.round(-4.6));
        System.out.println("求两个数的较大值："+ Math.max(2.1,-2.1));
        System.out.println("求两个数的较小值："+ Math.min(2.1,-2.1));
        System.out.println("生成一个大于等于0.0小于0.1的随机值:"+ Math.random());
    }
}
