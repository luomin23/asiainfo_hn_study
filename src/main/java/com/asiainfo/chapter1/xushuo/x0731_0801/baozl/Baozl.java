package com.asiainfo.chapter1.xushuo.x0731_0801.baozl;

/**
 * Created by root on 2017/8/1.
 */
public class Baozl {
    public static void main(String[] args) {
        //定义int类型变量，值为88
        int score1=88;

        //创建Integer包装类对象，表示变量score1的值
        Integer score2 = new Integer(score1);

        //将Integer包装类转换为double类型
        double score3 = score2.doubleValue();

        //将Integer包装类转换成float类型
        float score4=score2.floatValue();

        //将Integer包装类转换为int类型
        int score5 = score2.intValue();

        System.out.println("Integer包装类："+score2);
        System.out.println("double类型:"+score3);
        System.out.println("float类型:"+score4);
        System.out.println("int类型:"+ score5);
    }
}
