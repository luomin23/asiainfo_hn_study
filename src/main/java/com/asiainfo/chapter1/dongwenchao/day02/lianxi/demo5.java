package com.asiainfo.chapter1.dongwenchao.day02.lianxi;

/**
 * Created by 超超 on 2017/7/30 0030.
 */
public class demo5 {
    public static void main(String[] args){
        for (int i=1;i<10;i++){
            for (int j=1;j<=i;j++){//跳出循环之后重新开始
                System.out.print(j+"*" +i+ "="+(+i*j)+"\t");
            }
            System.out.println();
        }
    }
}
