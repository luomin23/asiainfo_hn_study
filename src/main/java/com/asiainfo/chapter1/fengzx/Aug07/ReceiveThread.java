package com.asiainfo.chapter1.fengzx.Aug07;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by fengzx on 2017/8/7.
 */
public class ReceiveThread implements Runnable {
    private DatagramSocket ds;

    public ReceiveThread(DatagramSocket ds){
        this.ds = ds;
    }

    public void run() {
        try{
            while (true) {
                byte[] bys = new byte[1024];
                DatagramPacket dp = new DatagramPacket(bys, bys.length);

                ds.receive(dp);

                String ip = dp.getAddress().getHostAddress();

                String s = new String(dp.getData(), 0, dp.getLength());

                System.out.println("from " + ip + " data is " + s);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
