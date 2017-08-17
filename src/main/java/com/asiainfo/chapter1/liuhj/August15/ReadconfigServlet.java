package com.asiainfo.chapter1.liuhj.August15;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class ReadconfigServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Properties prop =new Properties();
        /* 这个方法的底层会在传入的路径前拼接当前web应用的硬盘路径从而得到当前资源的硬盘路径，这种方式即使换了发布环境，
        *方法的底层也能得到正确额的web应用路径从而永远都是正确的资源路径
        * 注意： 此方法只能在Servlet 中使用，如果在普通的java类可以使用类加载器的方法
        */
        prop.load(new FileReader(this.getServletContext().getRealPath("config.properties")));
        System.out.println(prop.getProperty("username"));
        System.out.println(prop.getProperty("password"));


    }
}
