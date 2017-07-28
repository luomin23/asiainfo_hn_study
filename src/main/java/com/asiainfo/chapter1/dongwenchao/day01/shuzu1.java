package com.asiainfo.chapter1.dongwenchao.day01;

/**
 * Created by 超超 on 2017/7/24 0024.
 */
public class shuzu1 {
    public static void main(String[] args){
        int array1[][]={{10,2,3},{20,5,60}};
        int array2[][]={{11,21},{31},{32,5,61}};
        System.out.println("数组1的数组元素为");
        for( int row=0;row<array1.length;row++){
            for(int column=0;column<array1[row].length;column++)
                System.out.println(array1[row][column]);
        }
        System.out.println("数组2的数组元素为");
        for( int row=0;row<array2.length;row++){
            for(int column=0;column<array2[row].length;column++)
                System.out.println(array2[row][column]);
        }
    }
}
