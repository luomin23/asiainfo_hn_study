package com.asiainfo.chapter1.luomin.mytag;

/**
 * 获取浏览器端的 ip 地址
 * @author Luoo
 * @create 2017-08-17 16:17
 */

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;


public class IpTag extends SimpleTagSupport {

    /**
     * 向浏览器输出浏览器的ip
     */
    @Override
    public void doTag() throws JspException, IOException {
        String ip = (String) ((PageContext) (getJspContext())).getRequest().getRemoteAddr();
        getJspContext().getOut().write(ip);
    }
}