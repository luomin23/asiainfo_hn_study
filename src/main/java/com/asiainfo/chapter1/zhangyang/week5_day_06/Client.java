package com.asiainfo.chapter1.zhangyang.week5_day_06;


import java.io.*;
import java.net.Socket;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Created by 11 on 2017/8/13.
 */
public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端已经启动。。。。");
        //选择传入文件的路径
        File file = new File("D:\\work\\Git\\gitworkspace\\asiainfo_hn_study\\src\\main\\java\\com\\asiainfo\\chapter1\\zhangyang\\week5_day_06\\a.txt");
        System.out.println("文件存在：" + file.exists());
        //向服务器建立连接
        Socket socket = new Socket("localhost", 8888);
        //printwriter更容易操作文本
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        //获取文本文件的输入流
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = null;
        //把文本文件读入缓冲区，然后写到服务器端
        while ((line = br.readLine()) != null) {
            out.println(line);
        }
        //输出流结束标记
        socket.shutdownOutput();
        //接收服务器端返回的信息
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println(in.readLine());
        //关闭资源
        socket.close();
       // ReadTxt read = new ReadTxt();
       // read.readTxtFile();
        while (true) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            try {
                String str = sqlUtil.selectByPhoneNumber(s);
                if (str.equals("0")) {
                    System.out.println("写入失败！");
                    System.out.println("查询不到结果，请检查输入的电话号码是否有误！");
                } else {
                    System.out.println(str);
                    File f = new File("D:\\work\\Git\\gitworkspace\\asiainfo_hn_study\\src\\main\\java\\com\\asiainfo\\chapter1\\zhangyang\\week5_day_06\\c.txt");
                    FileWriter fw = new FileWriter(f, true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    if (f.exists()) {
//                    bw.write(str);
                        bw.append(str + "\n");
                    } else {
                        f.createNewFile();
                        bw.write(str);
//                    bw.append(str);
                    }
                    bw.close();
                    fw.close();
                    System.out.println("写入成功！");
                    System.out.println();
                }
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("查询失败！");
            }
        }
    }
}
