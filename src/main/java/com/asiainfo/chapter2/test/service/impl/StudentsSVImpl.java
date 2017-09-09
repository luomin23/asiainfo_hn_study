package com.asiainfo.chapter2.test.service.impl;

import com.asiainfo.chapter2.luomin.entity.Home;
import com.asiainfo.chapter2.test.dao.IStudentsDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Luoo
 * @create 2017-09-08 15:31
 */

@Service
@Transactional(readOnly = true)
public class StudentsSVImpl {
    @Autowired
    private IStudentsDAO iStudentsDAO;

    public Home queryById(String id) {
        Home home = iStudentsDAO.get(id);
        return home;
    }
}
