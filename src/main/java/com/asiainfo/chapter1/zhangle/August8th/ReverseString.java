package com.asiainfo.chapter1.zhangle.August8th;

/**
 * Created by del on 2017/8/8.
 */
public class ReverseString {
    /*反转字符串*/
    private static void reverse(String s) {
        String s1="";
        char[] c=s.toCharArray();
        for(int i=s.length()-1;i>=0;i--){
            s1=s1+c[i];
        }
        System.out.println(s1);
    }
    /*喝可乐问题*/
    public static int drink(int num){
        int count=0;
        int buy=0;
        for(int i=0;i<num-1;i++) {
            if (count < 3) {
                buy++;
                count++;
            } else {
                count = count / 3;

            }
        }

        return buy;
    }

    public static void main(String[] args) {
        System.out.println("反转字符串abcde的结果是:");
        String s="abcde";
        reverse(s);
        System.out.println("28人喝可乐问题:"+drink(28));
        System.out.println("50人喝可乐问题:"+drink(50));






    }

}
