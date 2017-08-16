package com.asiainfo.chapter1.luomin.net.demo3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Luoo2
 * @create 2017-08-14 0:19
 */

public class SocketService {
    public static final String BACK_ADDRESS_LIST_NAME ="backaddresslist.txt";


    /**
     * 总结
     1. 使用工程相对路径是靠不住的。
     2. 使用CLASSPATH路径是可靠的。
     3. 对于程序要读取的文件，尽可能放到CLASSPATH下，这样就能保证在开发和发布时候均正常读取。
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
//        /C:/idea_workspace/asiainfo_hn_study/target/classes/backaddresslist.txt
//        String path = SocketService.class.getClassLoader().getResource("").getPath() + BACK_ADDRESS_LIST_NAME;

//      文件必须存在,/C:/idea_workspace/asiainfo_hn_study/target/classes/com/asiainfo/chapter1/luomin/net/demo3/backaddresslist.txt
//        String path = SocketService.class.getResource(BACK_ADDRESS_LIST_NAME).getPath();

//           /C:/idea_workspace/asiainfo_hn_study/target/classes/com/asiainfo/chapter1/luomin/net/demo3/backaddresslist.txt
        System.out.println("服务端启动监听...");
        String path = SocketService.class.getResource("").getPath()+BACK_ADDRESS_LIST_NAME;
//        System.out.println(path);

        ServerSocket ss = new ServerSocket(4007);
        Socket s = ss.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        String data = br.readLine();
        System.out.println(data);

        BufferedWriter rw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        rw.write("上传成功！");

        rw.close();
        s.close();
        ss.close();
    }
}
