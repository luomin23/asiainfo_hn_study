package com.asiainfo.chapter1.zhangle.ServletDay2;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * Created by del on 2017/8/15.
 */
public class GetServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, IOException {
        //得到get的数据
        String name=request.getParameter("name");
        String pwd=request.getParameter("password");
        System.out.println(("name="+name+",pwd="+pwd));
        PrintWriter pw=response.getWriter();
        pw.println("name="+name+",pwd="+pwd);
        //读取复选框的数据sss
        String[] like=request.getParameterValues("check");
        pw.println("读取选中的复选框");
        for(int i=0;i<like.length;i++){
            String s=like[i];
            pw.println(s+" "); //输出on 个数是选中的
        }
        pw.println("选中的复选框个数是:"+like.length);


    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doGet(request,response);
    }
}
