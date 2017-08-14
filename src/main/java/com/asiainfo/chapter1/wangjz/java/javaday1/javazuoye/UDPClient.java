package com.asiainfo.chapter1.wangjz.java.javaday1.javazuoye;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by wjz123456 on 2017/8/7.
 */
public class UDPClient extends Readtxl{
    public static void main(String[] args) {
        String ss = null;
        DocumentBuilderFactory d = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = null;
        try {
            db = d.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        try {
            Document document = db.parse("C:\\Program Files\\Git\\test\\asiainfo_hn_study\\src\\main\\java\\com\\asiainfo\\chapter1\\wangjz\\java\\javaday1\\javazuoye\\txl");
            NodeList list = document.getElementsByTagName("boot");
            for (int i = 0; i < list.getLength(); i++) {
                Node book = list.item(i);
               ss= book.getTextContent();
                System.out.print(ss);
                System.out.println(ss.length());
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        DatagramPacket inPacket;
        InetAddress sAddr;
        byte[]inBuffer=new byte[100];
        try{
            DatagramSocket dSocket=new DatagramSocket();
            if (args.length==0)
                sAddr=InetAddress.getByName("127.0.0.1");
            else
                sAddr=InetAddress.getByName(args[0]);
            byte[]outBuffer=ss.getBytes();
            DatagramPacket outPacket=new DatagramPacket(outBuffer,outBuffer.length,sAddr,7601);

            dSocket.send(outPacket);//
            inPacket=new DatagramPacket(inBuffer,inBuffer.length);
            dSocket.receive(inPacket);//
            String s=new String(inPacket.getData(),0,inPacket.getLength());
            System.out.println("接收到服务器的信息"+s);

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
