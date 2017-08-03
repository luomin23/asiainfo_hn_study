package com.asiainfo.chapter1.Jiashihao.Java83;

/**
 * Created by lenovo on 2017/8/3.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class CollectionsDemo {
    public static void main(String args[]){
        List<String> all = new ArrayList<String>();
        //实例化list
        Collections.addAll(all,"1、JSH","2、jSH","J、JSHjsh");
        Collections.addAll(all,"B、www.JSH.cn");
        Collections.addAll(all,"A、www.JSHjsh.cn");
        System.out.println("排序之前的集合：");
        Iterator<String> iter = all.iterator();
        while(iter.hasNext()){
            //迭代输出
            System.out.println(iter.next()+"、");
        }
        Collections.sort(all);
        System.out.println("\n排序后的集合");
        iter = all.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next()+"、");
        }
    }
}
