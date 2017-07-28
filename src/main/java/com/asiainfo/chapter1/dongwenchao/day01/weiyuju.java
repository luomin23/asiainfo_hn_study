package com.asiainfo.chapter1.dongwenchao.day01;

/**
 * Created by 超超 on 2017/7/25 0025.
 */
public class weiyuju {
    public static void main(String[] args) {
        func();
    }
    public static void func() {
        if (IsWorkDay()) {
            printf("Error,is work day");
            return;
        }
        if (IsWorkTime()) {
            printf("Error,is work time");
            return;
        }
        rest();
    }
    private static void rest() {
        // TODO Auto-generated method stub
    }
    private static boolean IsWorkTime() {
        // TODO Auto-generated method stub
        return false;
    }
    private static void printf(String string) {
        // TODO Auto-generated method stub
    }
    private static boolean IsWorkDay() {
        // TODO Auto-generated method stub
        return false;
    }
}