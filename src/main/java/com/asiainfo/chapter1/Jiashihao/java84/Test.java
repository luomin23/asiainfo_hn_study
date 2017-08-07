package com.asiainfo.chapter1.Jiashihao.java84;

/**
 * Created by lenovo on 2017/8/4.
 */
public class Test {
    public static void main(String args[]){
        int x[] = {1,2,3};
        //定义一个数组，长度为3
        assert x.length == 0:"数组长度不为0";
        //此处断言数组长度为0，肯定是错误的
    }
}
