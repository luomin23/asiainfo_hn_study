package com.asiainfo.chapter2.test.dao;

import com.asiainfo.chapter2.common.persistence.CrudDao;
import com.asiainfo.chapter2.test.entity.User;

public interface UserDao extends CrudDao {
    int insert(User record);

    int insertSelective(User record);
}