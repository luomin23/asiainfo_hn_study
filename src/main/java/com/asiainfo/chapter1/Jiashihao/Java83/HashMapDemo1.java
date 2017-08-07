package com.asiainfo.chapter1.Jiashihao.Java83;

/**
 * Created by lenovo on 2017/8/3.
 */
import java.util.HashMap;
import java.util.Map;
public class HashMapDemo1 {
    public static void main(String []args){
        Map<String,String> map=null;
        map = new HashMap<String,String>();
        map.put("JSH","www.JSH.cn");
        map.put("Jjsh","www.Jsh.cn");
        map.put("JSHjava","www.JSHjava.com.cn");
        String val = map.get("JSH");
        System.out.println("取出的内容是："+val);
    }
}
