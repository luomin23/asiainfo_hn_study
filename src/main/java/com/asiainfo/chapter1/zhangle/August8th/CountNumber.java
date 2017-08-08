package com.asiainfo.chapter1.zhangle.August8th;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by del on 2017/8/8.
 */
public class CountNumber {

    public static void main(String[] args) {
        String s=counts("abcdekka27qoq");
        System.out.println(s);
    }

    private static String counts(String s) {
        System.out.println("统计结果是:");
        char[] c=s.toCharArray();  //将字符串转变为字符数组
        int count=0;
        //TreeMap存放字符 和字符出现的次数
        TreeMap<Character,Integer> tm=new TreeMap<Character, Integer>();
        for(int i=0;i<c.length;i++) {
            if (('a' < c[i] && c[i] > 'z') || ('A' < c[i] && c[i] > 'Z')) {
                Integer ir = tm.get(c[i]);  //取出当前字母在tm中的值
                if (ir != null) {  //不为空表示值存在 将值取出自增再存放
                    count = ir;
                }
                count++;
                tm.put(c[i], count);
                count = 0;  //最后次数清零
            }
        }
            //定义一个容器存放键 值
            StringBuffer sb=new StringBuffer();
            Set<Map.Entry<Character,Integer>> set=tm.entrySet();
            Iterator<Map.Entry<Character,Integer>> it=set.iterator();
            while (it.hasNext()){
                Map.Entry<Character,Integer> m=it.next();
                Character cr=m.getKey();
                Integer va=m.getValue();
                sb.append(cr+"("+va+")");

            }
            return sb.toString();
    }
}
