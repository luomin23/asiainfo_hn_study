package com.asiainfo.chapter1.Jiashihao.Java83;

/**
 * Created by lenovo on 2017/8/3.
 */
import java.util.HashMap;
import java.util.Map;
public class HashMapDemo2 {
    public static void main(String[] args){
        Map<String,String> map=null;
        map = new HashMap<String,String>();
        map.put("JSH","www.JSH.cn");
        map.put("Jjsh","www.Jsh.cn");
        map.put("JSHjava","www.JSHjava.com.cn");
        if(map.containsKey("JSH")){
            System.out.println("搜索的key存在！");
        }else{
            System.out.println("搜索的key不存在！");
        }
        if(map.containsValue("www.JSH.cn")){
            System.out.println("搜索的value！存在！");
        }else{
            System.out.println("搜索的value不存在！");
        }
    }
}
