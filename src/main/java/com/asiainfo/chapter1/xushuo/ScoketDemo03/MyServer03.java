package com.asiainfo.chapter1.xushuo.ScoketDemo03;

import com.asiainfo.chapter1.xushuo.ScoketDemo03.OperationDB02;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Created by root on 2017/8/12.
 */
public class MyServer03 {
    InfoBean infoBean = new InfoBean();
    String filePath = "C:\\Users\\root\\Desktop\\tt.txt";
    private ServerSocket server = null;
    private Socket socket = null;
    private DataInputStream din;
    private DataOutputStream dout;


    public MyServer03() {
        System.out.println("服务器端已启动");
        try {
            server = new ServerSocket(5000);
            //声明一个socket端口号
            socket = server.accept();
            //当发现客户端有socket试图链接，会accept该socket请求，并建立一个socket与之通信
            din = new DataInputStream(new FileInputStream("C:\\Users\\root\\Desktop\\JAVA.txt"));
            //阻塞式 读取该文件夹
            dout = new DataOutputStream(socket.getOutputStream());
            //并输出
            int i = 0;
            byte[] b = new byte[512];
            while ((i = din.read(b)) > 0) {
                //写入到txt的文件夹里
                dout.write(b, 0, i);

            }

            dout.flush();
            //要使用flush，这样服务端才能收到客户端发送的数据，否则可能会引起两边无限的互相等待
            dout.close();
            din.close();
            socket.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        String encoding = "UTF-8";
        File file = new File(filePath);
        if (file.isFile() && file.exists()) { //判断文件是否存在
            InputStreamReader read = null;//考虑到编码格式
            try {
                read = new InputStreamReader(
                        new FileInputStream(file), encoding);
                //读取一个文件夹tt
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                System.out.println("文件存在异常");
            }
            System.out.println("文件存在");
            BufferedReader bufferedReader = new BufferedReader(read);
            //声明BuffereReader用来读取 tt-实体类
            String lineTxt = null;
            //以行来读取文件
            OperationDB02 operationDB = new OperationDB02();
            try {
                while ((lineTxt = bufferedReader.readLine()) != null) {
                    //读取一行是否为空
                    String[] s = lineTxt.trim().split(",");
                    //trim去除空格 split以”，“隔开
                    infoBean.setNumberz(s[0].toString());
                    infoBean.setNamez(s[1].toString());
                    infoBean.setSite(s[2].toString());
                    infoBean.setEmil(s[3].toString());
                    infoBean.setBitrthday(s[4].toString());
                    //赋值0~4 到infobean的各个属性中
                    operationDB.addRcorder(infoBean);
                    //声明一个操作类的对象，来调用增加方法

                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                read.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("找不到需要上传数据库的文件");
        }
    }
    public static void main(String[]args){
        new MyServer03();
        //执行上面所有代码
       Scanner sc=new Scanner(System.in);
        //获取控制台输入的值
        String numberz=sc.next();
        //获取并存到numberz中
        OperationDB02 operationDB2 = new OperationDB02();
        //声明一个操作类的对象，来调用查询方法
        try {
            operationDB2.selectUser(numberz);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("谢谢使用~");
    }
}
