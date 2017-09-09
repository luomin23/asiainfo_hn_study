package com.asiainfo.chapter2.test.dao;

import com.asiainfo.chapter2.common.persistence.CrudDao;
import com.asiainfo.chapter2.common.persistence.annotation.MyBatisDao;
import com.asiainfo.chapter2.luomin.entity.Home;

/**
 * Created by Luoo on 2017/9/8.
 */
@MyBatisDao
public interface IStudentsDAO extends CrudDao<Home> {
}
