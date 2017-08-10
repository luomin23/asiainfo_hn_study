package com.asiainfo.chapter1.fengzx.Aug07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by fengzx on 2017/8/7.
 */
public class SendThread implements Runnable {
    private DatagramSocket ds;

    public SendThread(DatagramSocket ds){
        this.ds = ds;
    }

    public void run(){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = null;
            while ((line = br.readLine()) != null){
                if ("over".equals(line)){
                    break;
                }
                byte[] bys = line.getBytes();

                DatagramPacket dp = new DatagramPacket(bys,bys.length, InetAddress.getByName("192.168.199.255"),12580);
                ds.send(dp);
            }
            ds.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
