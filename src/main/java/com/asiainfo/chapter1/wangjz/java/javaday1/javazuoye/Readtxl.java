package com.asiainfo.chapter1.wangjz.java.javaday1.javazuoye;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

/**
 * Created by wjz123456 on 2017/8/7.
 */
public class Readtxl {
     static String name=null;
     static int age;
     static String add;
     int tel;
     String email;

    public static void main(String[] args) {
        String o[]=new String[5];
        byte[] b=new byte[5];
        DocumentBuilderFactory d = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = null;
        try {
            db = d.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            System.out.println("无法获取该对象");
        }
        try {
            Document document = db.parse("txl");
            NodeList list = document.getElementsByTagName("name");
            for (int i = 0; i < list.getLength(); i++) {
                Node book = list.item(i);
                name=book.getTextContent();
                System.out.println(name);
               // System.out.print(o[i]);

            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}