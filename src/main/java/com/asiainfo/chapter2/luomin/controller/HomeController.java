package com.asiainfo.chapter2.luomin.controller;

import com.alibaba.fastjson.JSON;
import com.asiainfo.chapter2.luomin.entity.Home;
import com.asiainfo.chapter2.luomin.service.impl.HomeSVImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Luoo
 * @create 2017-09-07 15:43
 */

@Controller
@RequestMapping("/home")
public class HomeController {
    //添加一个日志器
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    private HomeSVImpl homeSV;


    //映射一个action
    @RequestMapping("/index")
    public String index() {
        String id = "3";
        Home home = homeSV.getHomeById(id);
        String name = home.getName();
        //输出日志文件
        logger.debug("the first jsp pages==========" + name);
        //返回一个index.jsp这个视图
        return "index";
    }


    //查询用户  
    @RequestMapping("/list")
    public String list(HttpServletRequest request, Model model) {
        int homeId = Integer.parseInt(request.getParameter("id"));
        Home home = homeSV.getHomeById(homeId + "");
        model.addAttribute("home", home);
        return "home";
    }

    //更新用户
    @RequestMapping("/update")
    public String update(HttpServletRequest request, Model model) {
        int homeId = Integer.parseInt(request.getParameter("id"));
        Home home = new Home();
        home.setId(homeId + "");
        home.setName("隔壁老王");
        int status = homeSV.updateHomeById(home);
        model.addAttribute("msg", status);
        return "ok";
    }

    //添加用户
    @RequestMapping("/add")
    public String addHome(HttpServletRequest request, Model model) {
        Home home = new Home();
        home.setName("panyx");
        int status = homeSV.insertHome(home);
        model.addAttribute("msg", status);
        return "ok";

    }

    //映射一个action
    @RequestMapping("/ajaxtest")
    public String test() {
        return "test";
    }

    //测试ajax请求，返回json数据
    @RequestMapping(value = "jsontest", method = RequestMethod.POST)
    @ResponseBody
    public Home jsonTest(HttpServletRequest request, Model model) {
        int homeId = Integer.parseInt(request.getParameter("id"));
        Home home = homeSV.getHomeById(homeId + "");
        return home;
    }

    /**
     * 获取用户
     */
    @RequestMapping("/getHomeList")
    public void getJson(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        int homeId = Integer.parseInt(request.getParameter("id"));
        Home user = homeSV.getHomeById(homeId + "");
        response.setContentType("application/json;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println(JSON.toJSONString(user));
        out.flush();
        out.close();
    }

    @RequestMapping("views")
    public String views(ModelMap map, HttpServletRequest request){
        List<Home> articles = new ArrayList<Home>();
        for(int i = 0 ; i < 5; i ++){
            Home article = new Home();
            article.setId("id" +i);
            article.setName("name" + i);
            articles.add(article);
        }
        map.addAttribute("articles",articles);//将文章对象绑定到
        return "views";
    }


}