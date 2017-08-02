package com.asiainfo.chapter1.dongwenchao.day07;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 超超 on 2017/8/2 0002.
 */
public class demo5 {
    public static void main(String[]args){
        List a=new ArrayList();
        a.add("轻量级J2EE企业应用实战");
        a.add("wojiu");
        System.out.println(a);
        a.add(0,"董稳超");//将新字符串对象插入在第二个位置
        for (int i=0;i<a.size();i++){
            System.out.println(a.get(i));
        }
        a.remove(1);//删除第三个元素
        System.out.println(a);
        System.out.println(a.indexOf("wojiu"));//判断指定元素在List集合中位置：输出1，表明位于第二位
        a.set(1,"chaochao"); //将第二个元素替换成新的字符串对象
        System.out.println(a);
        System.out.println(a.subList(1 , 2));//将a集合的第二个元素（包括）到第三个元素（不包括）截取称子集合

    }
}
