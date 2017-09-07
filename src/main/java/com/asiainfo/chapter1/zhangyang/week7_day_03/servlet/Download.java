package com.asiainfo.chapter1.zhangyang.week7_day_03.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by 11 on 2017/8/28.
 */
public class Download extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public Download() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获得请求文件名
        String filename = request.getParameter("filename");
//        System.out.println(filename);
//
//        //设置文件MIME类型
        response.setContentType(getServletContext().getMimeType(filename));
       //设置Content-Disposition
        response.setHeader("Content-Disposition", "attachment;filename="+filename);
//        //读取目标文件，通过response将目标文件写到客户端
//        //获取目标文件的绝对路径
       String fullFileName = getServletContext().getRealPath("/chapter1/zhangyang/week7_day_03/down/" + filename);
//        //System.out.println(fullFileName);
//        //读取文件
  //      String fullFileName = "D:\\work\\Git\\gitworkspace\\asiainfo_hn_study\\src\\main\\webapp\\chapter1\\zhangyang\\week7_day_03\\down";
        InputStream in = new FileInputStream(fullFileName);
        OutputStream out = response.getOutputStream();
        //写文件
        int b;
        while((b=in.read())!= -1)
        {
            out.write(b);
        }

        in.close();
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
