package com.asiainfo.chapter1.Jiashihao.Java83;

/**
 * Created by lenovo on 2017/8/3.
 */
//输出全部的key和value。
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class HashMapDemo3 {
    public static void main(String[] args) {
        Map<String, String> map = null;
        map = new HashMap<String, String>();
        map.put("JSH", "www.JSH.cn");
        map.put("Jjsh", "www.Jsh.cn");
        map.put("JSHjava", "www.JSHjava.com.cn");
        Collection<String> values = map.values();
        Iterator<String> iter1 = values.iterator();//实例化Iterator
        System.out.println("全部的value：");
        while(iter1.hasNext()){//迭代输出
            String str = iter1.next();//取出value
            System.out.println(str + "、");//输出内容
        }
        Set<String> keys = map.keySet();
        Iterator<String> iter2 = keys.iterator();//实例化Iterator
        System.out.println("全部的key：");
        while(iter2.hasNext()){//迭代输出
            String str = iter2.next();//取出集合的key
            System.out.println(str + "、");//输出内容
        }
    }
}
