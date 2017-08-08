package com.asiainfo.chapter1.fengzx.Aug03;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by fengzx on 2017/8/3.
 */
public class TreeMapDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();

        TreeMap<Character,Integer> tm = new TreeMap<Character, Integer>();

        char[] chs = line.toCharArray();

        for (char ch:chs){
            Integer i = tm.get(ch);

            if (i == null){
                tm.put(ch,1);
            }else {
                i++;
                tm.put(ch,i);
            }
        }
        StringBuilder sb = new StringBuilder();

        Set<Character> set = tm.keySet();
        for (Character key:set){
            Integer value = tm.get(key);
            sb.append(key).append("(").append(value).append(")");
        }
        String result = sb.toString();
        System.out.println(result);
    }
}
