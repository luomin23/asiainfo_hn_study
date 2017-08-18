package com.asiainfo.chapter1.liuhj.August17.Session;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

//使用Session技术实现一个简单的购物车功能

public class BuyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //用此无法解决乱码因为只对POST请求有效果设置请求体中的参数
        // request.setCharacterEncoding();
        //以prod为名字获取得到一个字符串
     String prod =request.getParameter("prod");
     prod = new String(prod.getBytes("iso8859-1"),"utf-8");
        //当选择好物品时忽然关闭网页，此时选择的信息会忽然消失（因为session是一个会话级别的）。
        // 此时就需要设置Cookie来解决
       //HttpSession session =  request.getSession();
        //Cookie jc =new Cookie("JSESSIONID",session.getId()); 自己设置一个JSESSIONID，ID也一样
        //jc.setPath(request.getContextPath());      默认的路径也是当前WEB应用的名称
        //  jc.setMaxAge(1800);    以文件的形式存储，设置时间为30分钟
        //response.addCookie(jc);
       //如果没有Session对象会创建一个
     request.getSession().setAttribute("prod",prod);


    }
}
