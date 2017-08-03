package com.asiainfo.chapter1.zhangle.August2nd;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by del on 2017/8/2.
 */
public class ExceptionJava {

    /*ArrayIndexOfBoundException 数组下标越界异常*/
    public void outIndex(){
        int[] al = new int[3];
        al[0] = 10;
        al[1] = 5;

        for (int i = 0; i <= 3; i++) {
            System.out.println(al[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        ExceptionJava ej=new ExceptionJava();
        try {
            ej.outIndex();
        }catch (ArrayIndexOutOfBoundsException a){
            /*a.printStackTrace();//错误输出流*/
            System.out.println("数组下标异常");
        }


    }
}
