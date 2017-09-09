package com.asiainfo.chapter2.luomin.service.impl;

import com.asiainfo.chapter2.luomin.dao.IHomeDAO;
import com.asiainfo.chapter2.luomin.entity.Home;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Luoo
 * @create 2017-09-08 15:31
 */

@Service
@Transactional(readOnly = true)
public class HomeSVImpl {
    @Autowired
    private IHomeDAO iHomeDAO;

    public Home getHomeById(String id) {
        Home home = iHomeDAO.get(id);
        System.out.println("=====");
        return home;
    }

    public int updateHomeById(Home home) {
        return iHomeDAO.update(home);
    }

    public int insertHome(Home home) {
        return iHomeDAO.insert(home);
    }
}
