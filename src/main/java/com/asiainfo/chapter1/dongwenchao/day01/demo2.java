package com.asiainfo.chapter1.dongwenchao.day01;

/**
 * Created by 超超 on 2017/7/27 0027.
 */
public class demo2 {
    public static void main(String[] agrs){
        int i,j;
        int n=9;
        System.out.print("    *        |");
        for (i=1;i<=n;i++)
            System.out.print(" "+i);
        System.out.print("\n-------------|");
        for (i=1;i<=n;i++)
            System.out.print("------");
        System.out.println();
        for (i=1;i<=n;i++){
            System.out.print("        "+i+"   |");
            for (j=1;j<=i;j++)
                System.out.print("  "+i*j);
            System.out.println();
        }
    }
}
