package com.asiainfo.chapter1.dongwenchao.web.day1;


import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by 超超 on 2017/8/16 0016.
 */
public class IndexFilter implements Filter {
    public void destroy() {
        // TODO Auto-generated method stub
    }
    public void doFilter(ServletRequest arg0, ServletResponse arg1,
                         FilterChain arg2) throws IOException, ServletException {
        System.out.println("every request pass here haha");
        HttpServletRequest request = (HttpServletRequest) arg0;
        HttpServletResponse response = (HttpServletResponse) arg1;
        Cookie[] cookies = request.getCookies();
//        Cookie cookie = new Cookie("user",null);
//        cookie.setMaxAge(0);
//        response.addCookie(cookie);
        String[] cooks = null;
        String username = null;
        String password = null;
        if (cookies != null) {
            for (Cookie coo : cookies) {
                String aa = coo.getValue();
                System.out.println("1");
                cooks = aa.split("==");
                if (cooks.length == 2) {
                    System.out.println(cooks[0]+cooks[1]);
                    username = cooks[0];
                    password = cooks[1];
                }
            }
        }
        System.out.println("cookie username | " + username);
        System.out.println("cookie password | " + password);
        if (CheckLogin.login(username, password)) {
            System.err.println("check successfully cookie data ");
            request.getSession().setAttribute("username",username);
            request.getRequestDispatcher("chapter1/dongwenchao/web/day1/main126.jsp").forward(request, response);
        }else{
            arg2.doFilter(request,response );
        }
    }
    public void init(FilterConfig arg0) throws ServletException {
        // TODO Auto-generated method stub
    }



}
