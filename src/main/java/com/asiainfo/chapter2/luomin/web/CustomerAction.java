package com.asiainfo.chapter2.luomin.web;

import com.asiainfo.asframe.complex.web.BaseAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Luoo
 * @create 2017-08-18 10:16
 */

public class CustomerAction extends BaseAction {


    public void queryCustomerInfo(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String start = request.getParameter("start");
        String limit = request.getParameter("limit");
        String name = request.getParameter("name");

        response.setContentType("text/xml;charset=UTF-8");
        response.setHeader("Cache-Control", "no-store");
        response.setHeader("Pragrma", "no-cache");
        response.setDateHeader("Expires", 0);
        String strjson = "";
        response.getWriter().print(strjson);
    }
}
