package com.asiainfo.chapter1.dongwenchao.day06;

/**
 * Created by 超超 on 2017/7/31 0031.
 */
public class  demo5  {
    public static <E>void fanxing(E[] inputArray){
        for ( E element : inputArray ){
            System.out.printf( "%s ", element );
        }
        System.out.println();
    }
    public static void main (String[]args){
        Integer[] inta={1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
        System.out.print( "整型数组元素为:" );
        fanxing( inta  ); // 传递一个整型数组
        System.out.println( "\n双精度型数组元素为:" );
        fanxing( doubleArray ); // 传递一个双精度型数组
        System.out.println( "\n字符型数组元素为:" );
        fanxing( charArray ); // 传递一个字符型数组
    }
}

