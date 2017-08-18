package com.asiainfo.chapter1.luomin.mytag;

/**
 * 多次打印标签体内容
 * @author Luoo
 * @create 2017-08-17 16:16
 */

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.io.StringWriter;

public class PrintTag extends SimpleTagSupport {

    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void doTag() throws JspException, IOException {
        //创建一个流，用于接收标签体的内容
        StringWriter sw = new StringWriter();
        getJspBody().invoke(sw);
        String str = sw.toString();
        JspWriter out = getJspContext().getOut();
        for (int i = 0; i < count; i++) {
            out.write(str);
        }
    }
}