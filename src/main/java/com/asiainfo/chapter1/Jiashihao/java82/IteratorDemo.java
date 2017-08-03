package com.asiainfo.chapter1.Jiashihao.java82;

/**
 * Created by lenovo on 2017/8/2.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class IteratorDemo {
    public static void main(String[] args) {
        List<String> all = new ArrayList<String>();
        all.add("hello");
        all.add("_");
        all.add("world");
        Iterator<String> iter = all.iterator();
        while (iter.hasNext()){
            String str = iter.next();
            if("_".equals(str)){
                iter.remove();
            }else{
                System.out.print(str + "、");
            }
        }
        System.out.println("\n删除之后的集合："+ all);
    }
}
