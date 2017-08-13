package com.asiainfo.chapter1.liuwy.zuoye;



import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by LENOVO on 2017/8/12.
 */
public class Servers {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket=new ServerSocket(9999);
            System.out.println("服务器开启！");
            Socket socket=serverSocket.accept();

            //输出解析内容
            ObjectInputStream ois=new ObjectInputStream(socket.getInputStream());
            Demo demo=(Demo) ois.readObject();
            //demo.reader();

            //第二部分：得到客户端输入手机号进行查询

            BufferedReader br=new BufferedReader(new InputStreamReader(
                    socket.getInputStream()));
            String line=null;
            while ((line=br.readLine())!=null){
                System.out.println("查询手机号为"+line+"的用户信息...");

                //int a = Integer.parseInt(str);
                int i=Integer.parseInt(line);
                //调用业务层查询数据库
//                Person person=new Person();
//                Class c=Class.forName("com.asiainfo.chapter1.liuwy.August08.PersonDao");
//                Constructor con=c.getConstructor();
//                Object obj=con.newInstance();
//
//                Method m=c.getMethod("findByPhone");
//                m.invoke(obj);


                PersonBIZ personBIZ = new PersonBIZ();
                Person person = personBIZ.findByPhone(i);
                if (person == null) {
                    System.out.println("查询失败！");
                } else {

                    OutputStream os=socket.getOutputStream();
                    PrintWriter pw=new PrintWriter(os);
                    pw.write("查询结果：id："+person.getId()+"  "+"姓名："+person.getName()+"  "+"手机号："+person.getPhonenumber()
                            +"  "+"地址："+person.getAddress()+"  "+"email："+person.getEmil()+"  "+"生日："+person.getBirth());
                    pw.flush();
                    Write.write(person.getId(),person.getName(),person.getPhonenumber(),person.getAddress(),person.getEmil(),person.getBirth());
                    System.out.println("查询完毕并写入文件中。");


               }
            }
            socket.close();
            serverSocket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
