package com.asiainfo.chapter1.liuwy.August11;

import org.apache.commons.io.IOUtils;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.Callable;

/**
 * Created by LENOVO on 2017/8/7.
 */
public class MyCallable implements Callable<Boolean>{
    private Socket socket;

    public MyCallable(Socket socket) {
        this.socket = socket;
    }

   @Override
    public Boolean call() throws Exception {
        //Thread.sleep(5000);
        InputStream is = socket.getInputStream();
        String s =IOUtils.toString(is);
        System.out.println(s);
        //is.close();
        socket.shutdownInput();
        OutputStream os = socket.getOutputStream();

        os.write("你也好！".getBytes());
        //os.close();
        socket.shutdownOutput();
        if(s.equals("关闭")){

            return false;
        }else {
            return true;
        }
  }

}

