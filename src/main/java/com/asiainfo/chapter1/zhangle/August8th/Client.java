package com.asiainfo.chapter1.zhangle.August8th;

import java.io.IOException;
import java.net.Socket;

/**
 * Created by del on 2017/8/8.
 */
public class Client {

    public static void main(String[] args) {
        final int length=10;
        String host="localhost";
        int port=7600;
        Socket[] socket=new Socket[length];
        for(int i=0;i<length;i++){
            try {
                socket[i]=new Socket(host,port);
                System.out.println((i+1)+"次连接成功");
            } catch (IOException e) {
                System.out.println((i+1)+"次连接异常");
            }
            try {
                Thread .sleep(1000);  //程序暂停执行指定的时间（毫秒）

            } catch (InterruptedException e) {
                System.out.println("中断异常");
            }

        }
        for(int j=0;j<length;j++){
            try {
                socket[j].close();
            } catch (IOException e) {
                System.out.println("关闭异常");
            }

        }

    }
}
