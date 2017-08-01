package com.asiainfo.chapter1.wangjz.java.javaday1.javaday7;

import java.util.*;

/**
 * Created by wjz123456 on 2017/8/1.
 */
public class Maptest {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<String,String>();
        map.put("1","w");
        map.put("2","j");
        map.put("3","z");
        System.out.println("通过Map.keyset遍历key和value：");
        for (String key:map.keySet()){
            System.out.println(key+" "+map.get(key));
        }
        System.out.println("通过Map.entrySet使用iterator遍历key和value: ");
        Iterator<Map.Entry<String,String>> it=map.entrySet().iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("通过map.values()遍历说有的key和value ");
        for(Map.Entry<String,String>entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        System.out.println("通过Map.values()比啊没能力所有的value，但不能遍历key ");{
            for(String v:map.values()){
                System.out.println(v);
            }
        }
    }
}
