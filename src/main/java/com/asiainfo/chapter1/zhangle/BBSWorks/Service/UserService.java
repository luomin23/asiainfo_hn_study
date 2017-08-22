package com.asiainfo.chapter1.zhangle.BBSWorks.Service;

import com.asiainfo.chapter1.zhangle.BBSWorks.Entity.User;

import java.util.List;

/**
 * Created by del on 2017/8/21.
 */
public interface UserService {
    void insertUser(User user);

    User selectByTelephone(String telephone);
}
