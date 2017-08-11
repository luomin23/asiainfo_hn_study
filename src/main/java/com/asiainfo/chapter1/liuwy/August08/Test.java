package com.asiainfo.chapter1.liuwy.August08;



import org.dom4j.io.SAXReader;

import java.lang.reflect.Constructor;
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
       //System.out.println(classname);

        Class c=Class.forName(classname);
        Constructor con=c.getConstructor();
        Object obj=con.newInstance();

        Method m=c.getMethod(methodname);
        m.invoke(obj);





//        Document document = db.parse("txl");
//        NodeList list = document.getElementsByTagName("boot");
//        for (int i = 0; i < list.getLength(); i++) {
//            Node book = list.item(i);
//            ss= book.getTextContent();
//            System.out.print(ss);
//            System.out.println(ss.length());
//
//
    }
}