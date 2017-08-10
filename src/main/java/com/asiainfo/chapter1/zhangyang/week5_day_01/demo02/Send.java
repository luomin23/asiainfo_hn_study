package com.asiainfo.chapter1.zhangyang.week5_day_01.demo02;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by 11 on 2017/8/7.
 */
/*
发送线程
 */
public class Send implements Runnable {
    private BufferedReader console;
    private DataOutputStream dos;
    private boolean isRunning = true;
    public Send(){
        console = new BufferedReader(new InputStreamReader(System.in));
    }
    public Send(Socket client){
        this();
        try {
            dos = new DataOutputStream(client.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
            isRunning = false;
            CloseUtil.closeAll(dos);
        }
    }//从控制台接受线程
    private String getMsgFromConsole(){
        try {
            return console.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
    /*
    1、从控台接受数据
    2、发送数据
     */
    public void send(){
        String str = getMsgFromConsole();
        if (null!=str&&!str.equals("")){
            try {
                dos.writeUTF(str);
                dos.flush();
            } catch (IOException e) {
                e.printStackTrace();
                isRunning=false;
                CloseUtil.closeAll(dos);
            }
        }
    }
    @Override
    public void run() {
        //线程体
        while (isRunning){
            send();
        }
    }
}
