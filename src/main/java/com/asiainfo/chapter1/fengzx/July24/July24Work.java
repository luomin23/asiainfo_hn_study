package com.asiainfo.chapter1.fengzx.July24;

import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by fengzx on 2017/7/24.
 */
public class July24Work {
    public static void main(String[] args) {
        int x, y;
        double z;
        x = 1;
        x += 3;
        y = ++x;
        x--;
        z = Math.sqrt(x);
        System.out.println("x的值为：" + x + "  y的值为：" + y + "  z的值为：" + z);
        int a, b1;
        long b2;
        a = 2 << 3;
        System.out.println("a的值为：" + a);
        b1 = 1 << 35;
        b2 = 1 << 35;
        System.out.println("b1的值为：" + b1 + "  b2的值为：" + b2);

        String greeting = "Hello";
        String s = greeting.substring(0, 3);
        System.out.println(s);

        int n1 = greeting.length();
        System.out.println(n1);

        String greeting2 = "world";
        String str = greeting + greeting2;
        System.out.println(str);

        int cpCount = greeting.codePointCount(0, greeting.length());
        char first = greeting.charAt(0);
        char last = greeting.charAt(4);
        System.out.println(cpCount);
        System.out.println(first);
        System.out.println(last);

        int index = greeting.offsetByCodePoints(0, 1);
        int cp = greeting.codePointAt(index);
        System.out.println(cp);

        String ch = "char";
        StringBuilder builder = new StringBuilder();
        builder.append(ch);
        builder.append(str);
        System.out.println(builder);
        String completedString = builder.toString();
        System.out.println(completedString);

        int[] a1 = {12, 22, 23, 33};
        for (int element : a1) {
            System.out.println(element);
        }
    }
}
