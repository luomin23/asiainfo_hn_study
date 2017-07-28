package com.asiainfo.chapter1.luhui.luhui2;

/**
 * Created by 18237161432 on 2017/7/25.
 * 5、九九乘法表
 */
public class chengfa {
    public static void main(String[] args){
        System.out.println("乘法口诀表");
        for (int i=1;i<10;i++){
            for (int y=1;y<=i;y++){
                System.out.print(i+"*"+y+"="+(i*y)+"\t");
            }
            System.out.println();
        }
    }
}
