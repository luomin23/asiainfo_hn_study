package com.asiainfo.chapter1.fengzx.Aug02;

import java.util.Scanner;

/**
 * Created by fengzx on 2017/8/2.
 */
public class VerifyEqual {
    public VerifyEqual() {
    }

    public boolean verify(String s, String s1) {
        System.out.print("请输入用户名：");
        Scanner scanner = new Scanner(System.in);
        String s2 = scanner.next();
        System.out.print("请输入密码：");
        scanner = new Scanner(System.in);
        String s3 = scanner.next();
        return s2.equals(s) && s1.equals(s3);
    }
}
