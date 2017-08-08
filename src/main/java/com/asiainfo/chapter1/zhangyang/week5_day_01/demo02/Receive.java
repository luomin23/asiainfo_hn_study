package com.asiainfo.chapter1.zhangyang.week5_day_01.demo02;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Created by 11 on 2017/8/7.
 */
/*
接受线程
 */
public class Receive implements Runnable {
    //输入流
    private DataInputStream dis ;
    //线程标识
    private boolean isRunning = true;
    public Receive(){

    }
    public Receive(Socket client){
        try {
            dis = new DataInputStream(client.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
            isRunning = false;
            CloseUtil.closeAll(dis);
        }
    }
    /*
    接受数据
     */
    public String receive(){
        String str = "";
        try {
            str = dis.readUTF();
        } catch (IOException e) {
            e.printStackTrace();
            isRunning=false;
            CloseUtil.closeAll(dis);
        }
        return str;
    }
    @Override
    public void run() {
        while (isRunning){
            System.out.println(receive());
        }
    }
}
