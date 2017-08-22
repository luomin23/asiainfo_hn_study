package com.asiainfo.chapter1.liuhj.August17.Session;

        import javax.servlet.ServletException;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import javax.servlet.http.HttpSession;
        import java.io.IOException;

        //
public class PayServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session   =   request.getSession();
        //域中存放的对象是Object类型此处需要强制转换
        String prod = (String) session.getAttribute("prod");
        response.getWriter().write("您购买的是"+prod+"价值999");
    }
}
