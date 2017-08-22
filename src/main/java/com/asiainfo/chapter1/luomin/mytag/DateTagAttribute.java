package com.asiainfo.chapter1.luomin.mytag;

/**
 * @author Luoo
 * @create 2017-08-17 16:50
 */

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;
import java.util.Date;

public class DateTagAttribute extends TagSupport {

    private String pattern;

    @Override
    public int doStartTag() throws JspException {
        HttpServletRequest request;
        // 是TagSupport类中定义的一个属性，它是javax.servlet.jsp.PageContext的对象
        request = (HttpServletRequest) pageContext.getRequest();
        java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat(pattern);
        String date = formater.format(new Date());
        JspWriter out = pageContext.getOut();
        try {
            out.print(date);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // doStartTag() 方法返回 SKIP_BODY 。当然其原因是我们的简单日期标记没有正文。
        return Tag.SKIP_BODY;
    }

    // 必须实现setXX()方法
    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
}
