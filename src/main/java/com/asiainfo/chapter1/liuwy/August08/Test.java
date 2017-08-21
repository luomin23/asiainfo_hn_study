package com.asiainfo.chapter1.liuwy.August08;



import org.dom4j.io.SAXReader;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
//import java.io.File;
//import java.util.Iterator;
//import java.util.List;
//
//import org.dom4j.Attribute;
//import org.dom4j.Document;
//import org.dom4j.Element;
//import org.dom4j.io.SAXReader;
//import org.junit.Test;

/**
 * Created by LENOVO on 2017/8/8.
 */
public class Test {

    public static void main(String[] args) throws Exception {
        String classname=PropertiesUtil.getProperty("classname");
        String methodname=PropertiesUtil.getProperty("method");
       System.out.println(classname);

        Class c=Class.forName(classname);
        Constructor con=c.getConstructor();
        Object obj=con.newInstance();

        Method m=c.getMethod(methodname);
        m.invoke(obj);
//        Boolean a=PersonDao.delete(3);
//        if (a==true){
//            System.out.print("ok");
//        }else {
//            System.out.print("no");
//        }
//

    }
}