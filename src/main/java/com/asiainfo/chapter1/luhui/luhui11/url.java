package com.asiainfo.chapter1.luhui.luhui11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by 18237161432 on 2017/8/7.
 */
public class url {
    public static void main(String [] args) throws IOException {
        URL url1=new URL("http://www.baidu.com/index.html");
        InputStreamReader is=new InputStreamReader(url1.openStream());
        System.out.println("协议"+url1.getProtocol());
        System.out.println("主机"+url1.getHost());
        System.out.println("端口"+url1.getPort());
        System.out.println("路径"+url1.getPath());
        System.out.println("文件"+url1.getFile());
        BufferedReader br=new BufferedReader(is);
        String inputLine;
        System.out.println("文件内容");
        while ((inputLine=br.readLine()) !=null){
            System.out.println(inputLine);
        }
        br.close();
    }
}
