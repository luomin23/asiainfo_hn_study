package com.asiainfo.chapter1.wangjz.java.javaday1.Servlet2; /**
 * Created by wjz123456 on 2017/8/17.
 */

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class FirstListener implements ServletContextListener,
        HttpSessionListener, HttpSessionAttributeListener ,ServletRequestListener{
static int n;
    // Public constructor is required by servlet spec
    public FirstListener() {
    }

    // -------------------------------------------------------
    // ServletContextListener implementation
    // -------------------------------------------------------
    public void contextInitialized(ServletContextEvent sce) {
      /* This method is called when the servlet context is
         initialized(when the Web application is deployed). 
         You can initialize servlet context related data here.
      */
        System.out.println("ServletContext对象被创建"+sce.getServletContext());
    }

    public void contextDestroyed(ServletContextEvent sce) {
      /* This method is invoked when the Servlet Context 
         (the Web application) is undeployed or 
         Application Server shuts down.
      */
        System.out.println("ServletContext对象被销毁"+sce.getServletContext());
    }

    // -------------------------------------------------------
    // HttpSessionListener implementation
    // -------------------------------------------------------
    public void sessionCreated(HttpSessionEvent se) {
      /* Session is created. */
        n++;
        System.out.println(n);
        System.out.println("Session对象被创建"+se.getSession());

    }

    public void sessionDestroyed(HttpSessionEvent se) {
      /* Session is destroyed. */
        System.out.println("Session对象被销毁"+se.getSession());
    }

    // -------------------------------------------------------
    // HttpSessionAttributeListener implementation
    // -------------------------------------------------------

    public void attributeAdded(HttpSessionBindingEvent sbe) {
      /* This method is called when an attribute 
         is added to a session.

      */
    }

    public void attributeRemoved(HttpSessionBindingEvent sbe) {
      /* This method is called when an attribute
         is removed from a session.
      */
    }

    public void attributeReplaced(HttpSessionBindingEvent sbe) {
      /* This method is invoked when an attibute
         is replaced in a session.
      */
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("Request对象被销毁： "+sre.getServletRequest());

    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
System.out.println("Request对象被创建： "+sre.getServletRequest());

    }
}
