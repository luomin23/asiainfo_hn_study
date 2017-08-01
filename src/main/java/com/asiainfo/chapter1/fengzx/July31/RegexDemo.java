package com.asiainfo.chapter1.fengzx.July31;

import java.util.Scanner;

/**
 * Created by fengzx on 2017/7/31.
 */
public class RegexDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的QQ账号：");
        String qq = sc.nextLine();
        boolean flag = checkQQ(qq);
        System.out.println(flag);
    }

    public static boolean checkQQ(String qq){
        boolean flag = true;

        if (qq.length() >= 6 && qq.length() <= 12){
            if (!qq.startsWith("0")){
                char[] chs = qq.toCharArray();
                for (int x = 0;x < chs.length;x++){
                    char ch = chs[x];
                    if (!(ch >= '0' && ch <= '9')){
                        flag = false;
                        break;
                    }
                }
            }else {
                flag = false;
            }
        }else {
            flag = false;
        }
        return flag;
    }
}
