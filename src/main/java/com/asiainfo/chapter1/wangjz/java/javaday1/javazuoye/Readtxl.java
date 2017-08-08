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
    public static void main(String[] args) {
        DocumentBuilderFactory d = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = null;
        try {
            db = d.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            System.out.println("无法获取该对象");
        }
        try {
            Document document = db.parse("txl");
            NodeList list = document.getElementsByTagName("root");

            for (int i = 0; i < list.getLength(); i++) {
                Node book = list.item(i);
                System.out.print(book.getChildNodes());
                System.out.print(book.getTextContent());
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}