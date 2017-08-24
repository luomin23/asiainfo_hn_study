package com.asiainfo.chapter1.liangzhiqiang.BBSzuoye;

/**
 * Created by 君不悔 on 2017/8/23.
 */
import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name="login", urlPatterns={"/login"})
public class LoginServlet extends HttpServlet{
    public void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String errMsg = "";
        RequestDispatcher rd;
        String username = request.getParameter("username");
        String pass = request.getParameter("pass");
        try {
            DbDao dd = new DbDao("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/test",
                    "root", "root");

            // 查询结果
            ResultSet rs = dd.query("select pass from user_table where username = ?", username);


            if(rs.next()){
                //用户名和密码匹配
                if(rs.getString("pass").equals(pass)) {
                    //获取session对象
                    HttpSession session = request.getSession(true);
                    session.setAttribute("name", username);

                    //获取转发对象
                    rd = request.getRequestDispatcher("/welcome.jsp");

                    // 转发请求
                    rd.forward(request, response);
                } else {
                    errMsg += "您的用户名密码不匹配，请重新输入";
                }
            } else {
                errMsg += "您的用户名不存在，请先注册";
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        // 如果出错，转发到重新登陆
        if(errMsg != null && !errMsg.equals("")){
            rd = request.getRequestDispatcher("/login.jsp");
            request.setAttribute("err", errMsg);
            rd.forward(request, response);
        }
    }

    private class DbDao {
        public DbDao(String s, String s1, String root, String root1) {
        }
        public ResultSet query(String s, String username) {
            return null;
        }

    }

    }
