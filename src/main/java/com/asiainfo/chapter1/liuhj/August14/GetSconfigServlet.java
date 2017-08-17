package com.asiainfo.chapter1.liuhj.August14;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class GetSconfigServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {





    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                  ServletConfig config =this.getServletConfig();
                  // 获取当前Servlet在web.xml中配置名称并打印在控制台上（开发中不经常用）
                  String sName =config.getServletName();
                        System.out.println(sName);


    }
}
