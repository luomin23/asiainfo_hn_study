package com.asiainfo.chapter1.liuwy.demo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by LENOVO on 2017/8/24.
 */
public class FindPageServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserBIZ userBIZ=new UserBIZ();
        PageVO<User> pageVO=new PageVO<User>();
        pageVO.setRecordOfPage(2);
        int recordCount=userBIZ.findCount();
        pageVO.setRecordCount(recordCount);
        int pageCount=(recordCount-1)/pageVO.getRecordOfPage()+1;
        pageVO.setPageCout(pageCount);
        int page=1;
        if (req.getParameter("pages")!=null){
            page=Integer.parseInt(req.getParameter("pages"));
            if (page<1){
                page=1;
            }
            if (page>pageCount){
                page=pageCount;
            }
        }
        pageVO.setPage(page);
        pageVO=userBIZ.findByPage(pageVO);
        if (pageVO.getListOfPage()!=null){
            req.setAttribute("pageVO",pageVO);
            req.getRequestDispatcher("chapter1//liuwy//demo//manager//pageshow.jsp").forward(req,resp);

        }else {
            String message="查询失败！";
            req.setAttribute("message", message);
            req.getRequestDispatcher("chapter1//liuwy//demo//errmessage.jsp").forward(req, resp);

        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        this.doGet(req,resp);
    }
}
