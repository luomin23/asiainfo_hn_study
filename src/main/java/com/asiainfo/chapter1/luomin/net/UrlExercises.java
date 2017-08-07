package com.asiainfo.chapter1.luomin.net;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author Luoo2
 * @create 2017-08-06 20:04
 */

public class UrlExercises {

    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.baidu.com");
        URLConnection connection = url.openConnection();

        InputStream inputStream = connection.getInputStream();
        OutputStream outputStream = new FileOutputStream("c:/data.txt");
        byte[] buffer = new byte[1024];

        int flag = 0;
        while (-1 != (flag = inputStream.read(buffer, 0, buffer.length))) {

            outputStream.write(buffer, 0, flag);
        }
        outputStream.close();
        inputStream.close();

    }
}
