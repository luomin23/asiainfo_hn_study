package com.asiainfo.chapter1.zhangyang.week5_day_04;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by 11 on 2017/8/10.
 */
@WebServlet(name="LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("gbk");//处理请求与响应中文字体乱码，只适用于post提交
        response.setCharacterEncoding("gbk");//设置编码一定放在程序的最前面
        String username = request.getParameter("username");//使用该方法获取请求的值
        String password = request.getParameter("password");
        PrintWriter out = response.getWriter();
        if(username==null||username.equals("")){//处理用户名为空
            out.println("please input username");
            out.close();
            return;
        }
        if(username.equals("张")&&password.equals("12345")){
            out.println(username+"login success!");
        }else{
            out.println(username+"login error!");
        }
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
