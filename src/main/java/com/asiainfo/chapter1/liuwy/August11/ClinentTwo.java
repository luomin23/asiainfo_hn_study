package com.asiainfo.chapter1.liuwy.August11;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.*;
import java.net.Socket;
import java.util.List;
import java.util.Scanner;

/**
 * Created by LENOVO on 2017/8/11.
 */
public class ClinentTwo {
    public static void main(String[] args) {
        try {
            Socket socket=new Socket("127.0.0.1",9999);

            InputStream is=socket.getInputStream();
            InputStreamReader inputStreamReader=new InputStreamReader(is);
            BufferedReader br=new BufferedReader(inputStreamReader);
            String s=br.readLine();
            System.out.println(s);
            String a=br.readLine();
            System.out.println(a);
//            String b=br.readLine();
//            System.out.println(b);


            BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(
                    socket.getOutputStream()
            ));
            String line=null;
            while((line=br2.readLine())!=null){



                if("over".equals(line)){
                    break;
                }
                bw.write(line);
                bw.newLine();
                bw.flush();
            }


               socket.close();





        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
