package com.asiainfo.chapter1.luomin.mytag;

/**
 * @author Luoo
 * @create 2017-08-17 16:50
 */

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.tagext.Tag;
import java.io.IOException;
import java.util.Date;

public class DateTagNoBody  extends SimpleTagSupport {

    @Override
    public void doTag() throws JspException {
        HttpServletRequest request;
        // 是TagSupport类中定义的一个属性，它是javax.servlet.jsp.PageContext的对象
        java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat("yyyy-MM-dd");
        String date = formater.format(new Date());
        JspWriter out = getJspContext().getOut();

        try {
            out.print(date);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
