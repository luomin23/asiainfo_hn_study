package com.asiainfo.chapter1.hanjunwen.webDemo.servletDemo;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;


public class TestBodyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String body = readBody(request);
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet BodyView</title>");
        out.println("</head>");
        out.println("<body>");
        out.println(body);
        out.println("</body>");
        out.println("</html>");

    }

    public String readBody(HttpServletRequest request) throws IOException {
        BufferedReader reader= request.getReader();//取得BufferedReader对象
        String input = null;
        String requestBody = "";
        while((input = reader.readLine())!= null){
            requestBody = requestBody+input+"<br/>";
        }
        return requestBody;
    }
}
