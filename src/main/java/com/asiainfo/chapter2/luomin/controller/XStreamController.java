package com.asiainfo.chapter2.luomin.controller;

/**
 * @author Luoo
 * @create 2017-09-09 16:13
 */

import com.asiainfo.chapter2.luomin.entity.Account;
import com.asiainfo.chapter2.luomin.entity.Birthday;
import com.asiainfo.chapter2.luomin.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 利用xStream进行Java对象到XML的转换技术
 */
@Controller
@RequestMapping("/xstream/view")
public class XStreamController {

    // 普通JavaBean转换成XML
    // url: http://localhost:8080/xstream/view/doXMLXstream
    @RequestMapping("/doXMLXstream")
    public ModelAndView doXMLJaxb2View() {
        ModelAndView mav = new ModelAndView("xStreamMarshallingView");
        Account account = new Account();
        account.setAddress("address");
        account.setEmail("email");
        account.setId(1);
        account.setName("haha");
        Birthday day = new Birthday();
        day.setBirthday("2010-11-22");
        account.setBirthday(day);
        mav.addObject(BindingResult.MODEL_KEY_PREFIX, account);
        return mav;
    }

    // 转换带List属性的JavaBean
    // url: http://localhost:8080/xstream/view/doListXMLXstream
    @RequestMapping("/doListXMLXstream")
    public ModelAndView doListXMLXStreamView() {
        ModelAndView mav = new ModelAndView("xStreamMarshallingView");
        List<Object> list = new ArrayList<Object>();
        for (int i = 0; i < 3; i++) {
            Account account = new Account();
            account.setAddress("北京#" + i);
            account.setEmail("email" + i + "@12" + i + ".com");
            account.setId(1 + i);
            account.setName("haha#" + i);
            Birthday birthday = new Birthday();
            birthday.setBirthday("2010-11-2" + i);
            account.setBirthday(birthday);
            list.add(account);

            User user = new User();
            user.setAddress("china GuangZhou 广州# " + i);
            user.setAge(23 + i);
            user.setBirthday(birthday);
            user.setName("jack#" + i);
            user.setSex(Boolean.parseBoolean(i + ""));
            list.add(user);
        }

        mav.addObject(list);
        return mav;
    }

    // 转换带有Map属性的JavaBean
    // url: http://localhost:8080/xstream/view/doMapXMLXstream
    @RequestMapping("/doMapXMLXstream")
    public ModelAndView doDifferXMLXStreamView() {
        ModelAndView mav = new ModelAndView("xStreamMarshallingView");
        Account account = new Account();
        account.setAddress("广东");
        account.setEmail("email");
        account.setId(1);
        account.setName("haha");
        Birthday birthday = new Birthday();
        birthday.setBirthday("2010-11-22");
        account.setBirthday(birthday);

        User user = new User();
        user.setAddress("china GuangZhou");
        user.setAge(23);
        user.setBirthday(birthday);
        user.setName("jack");
        user.setSex(true);

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("account", account);
        map.put("user", user);
        mav.addObject(map);
        return mav;
    }

    // 转换数组
    // url: http://localhost:8080/xstream/view/doArrayXMLXstream
    @RequestMapping("/doArrayXMLXstream")
    public ModelAndView doArrayXMLXStreamView() {
        ModelAndView mav = new ModelAndView("xStreamMarshallingView");
        Account[] accountArr = new Account[2];

        Account account = new Account();
        account.setAddress("北京");
        account.setEmail("email");
        account.setId(1);
        account.setName("haha");
        Birthday birthday = new Birthday();
        birthday.setBirthday("2010-11-22");
        account.setBirthday(birthday);
        accountArr[0] = account;

        account = new Account();
        account.setAddress("上海");
        account.setEmail("email");
        account.setId(1);
        account.setName("haha");
        birthday = new Birthday();
        birthday.setBirthday("2014-11-22");
        account.setBirthday(birthday);
        accountArr[1] = account;

        mav.addObject(accountArr);
        return mav;
    }
}
