package com.asiainfo.chapter2.test.controller;

import com.asiainfo.chapter2.luomin.entity.Home;
import com.asiainfo.chapter2.test.service.impl.StudentsSVImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Luoo
 * @create 2017-09-07 15:43
 */

@Controller
@RequestMapping("/students")
public class StudentsController {
    //添加一个日志器
    private static final Logger logger = LoggerFactory.getLogger(StudentsController.class);

    @Autowired
    private StudentsSVImpl studentsSV;


    //映射一个action
    @RequestMapping("/index")
    public String index() {
        String id = "6";
        Home home = studentsSV.queryById(id);
        String name = home.getName();
        //输出日志文件
        logger.debug("the first jsp pages==========" + name);
        //返回一个index.jsp这个视图
        return "index";
    }
}