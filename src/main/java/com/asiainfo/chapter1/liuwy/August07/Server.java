package com.asiainfo.chapter1.liuwy.August07;



import java.io.IOException;

import java.net.ServerSocket;
import java.net.Socket;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


/**
 * Created by LENOVO on 2017/8/7.
 */
public class Server {
    public static void main(String[] args){
        ExecutorService executorService= Executors.newCachedThreadPool();
        try {
            ServerSocket serverSocket=new ServerSocket(9999);
            System.out.println("服务器开启！");
            boolean bool=true;

            while (bool) {
                Socket socket = serverSocket.accept();

                MyCallable call=new MyCallable(socket);
                Future<Boolean> future=executorService.submit(call);
                try {
                    bool=future.get();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            executorService.shutdown();
        }
            System.out.println("连接结束！");


    }

}
