package com.asiainfo.chapter1.fengzx.Aug08;

import com.asiainfo.chapter1.fengzx.July27.InheritDemo;
import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by fengzx on 2017/8/8.
 */
public class InterTest {
    public static void main(String[] args) {
        InterDemo id = new InterDemo();
        id.method(new InterAdapter(){
            public void show3(){
                System.out.println("show3");
            }
        });
    }
}
