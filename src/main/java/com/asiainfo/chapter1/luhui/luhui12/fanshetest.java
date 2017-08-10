package com.asiainfo.chapter1.luhui.luhui12;

/**
 * Created by 18237161432 on 2017/8/8.
 */
public class fanshetest {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("sqladd");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
