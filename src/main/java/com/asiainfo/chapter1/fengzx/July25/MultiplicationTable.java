package com.asiainfo.chapter1.fengzx.July25;

/**
 * Created by fengzx on 2017/7/25.
 */
public class MultiplicationTable {
    public static void main(String[] args){
        for(int x=1; x<=9; x++) {
            for(int y=1; y<=x; y++) {
                System.out.print(y+"*"+x+"="+y*x+"\t");
            }
            System.out.println();
        }
    }
}
