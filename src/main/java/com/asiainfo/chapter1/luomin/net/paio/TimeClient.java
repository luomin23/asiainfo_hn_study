package com.asiainfo.chapter1.luomin.net.paio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * 客户端
 */
public class TimeClient {

    public static void main(String[] args) throws IOException {
        int port = 8080;

        if (args != null && args.length > 0) {
            try {
                port = Integer.valueOf(args[0]);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

        Socket socket = null;
        BufferedReader in = null;
        PrintWriter out = null;
        Scanner scanner = null;

        try {
            socket = new Socket("127.0.0.1", port);//连接服务器
            in = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));
            out = new PrintWriter(socket.getOutputStream(), true);

            scanner = new Scanner(System.in);

            while (true) {
                String line = scanner.nextLine();
                if (line.equalsIgnoreCase("exit")) {
                    break;
                }

                out.println(line);

                String receive = in.readLine();
                System.out.println("收到服务器的响应:" + receive);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }

            if (in != null) {
                in.close();
            }

            if (out != null) {
                out.close();
            }
        }
    }
}