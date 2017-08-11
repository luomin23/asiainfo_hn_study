package com.asiainfo.chapter1.dongwenchao.day02.lianxi;

/**
 * Created by 超超 on 2017/8/11 0011.
 */
public class demo10 {
    public static void main(String[] args) {
        print(8);
    }
    private static void print(int size) {
        if (size % 2==0){
            size++;
        }
        for (int i = 0; i < size / 2 + 1; i++){
            for (int j = size / 2 + 1; j > i + 1;j--){
            System.out.print(" ");//上边缘的位置
            }
        /*for (int i = 0; i < size / 2 + 1; i++) {
            for (int j = size / 2 + 1; j > i + 1; j--) {
                System.out.print(" "); // 输出左上角位置的空白
            }*/
        for (int j = 0; j < 2 * i + 1; j++){
            System.out.print("*");
        }
            System.out.println(); // 换行
        }
        for (int i=size / 2+1;i<size;i++){
            for (int j=0;j<i-size/2;j++){
                System.out.print(" ");
            }
            for (int j=0;j<2*size-1-2*i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
