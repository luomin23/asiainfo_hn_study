package com.asiainfo.chapter2.luomin.controller;

import com.asiainfo.chapter2.common.util.StringUtil;
import com.asiainfo.chapter2.luomin.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Luoo
 * @create 2017-09-09 18:01
 */

@Controller
public class UserController {

    /**
     * Static list of users to simulate Database
     */
    private static List<User> userList = new ArrayList<User>();

    // Initialize the list with some data for index screen
    static {
        userList.add(new User("Bill", "Gates"));
        userList.add(new User("Steve", "Jobs"));
        userList.add(new User("Larry", "Page"));
        userList.add(new User("Sergey", "Brin"));
        userList.add(new User("Larry", "Ellison"));
    }

    /**
     * Saves the static list of users in model and renders it via freemarker
     * template.
     *
     * @param model
     * @return The index view (FTL)
     */
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String index(@ModelAttribute("model") ModelMap model) {

        model.addAttribute("userList", userList);

        return "users";
    }

    /**
     * Add a new user into static user lists and display the same into FTL via
     * redirect
     *
     * @param user
     * @return Redirect to /index page to display user list
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@ModelAttribute("user") User user) {

        if (null != user && StringUtil.isNoneBlank(user.getName()) && StringUtil.isNoneBlank(user.getAddress())) {

            synchronized (userList) {
                userList.add(user);
            }

        }

        return "redirect:users.html";
    }

}
