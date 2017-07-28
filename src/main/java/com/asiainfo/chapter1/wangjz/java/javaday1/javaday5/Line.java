package com.asiainfo.chapter1.wangjz.java.javaday1.javaday5;

import org.junit.Test;

/**
 * Created by wjz123456 on 2017/7/28.
 */
public class Line {
       int a=10,b=20;
    private class point{


        public  point(){
           System.out.println(a+b);
        }
    }
    public void  test(){
        new point();
    }

    public static void main(String[] args) {
        Line s=new Line();
        s.test();


    }
}
