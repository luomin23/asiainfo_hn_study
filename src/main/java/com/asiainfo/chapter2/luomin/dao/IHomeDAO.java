package com.asiainfo.chapter2.luomin.dao;

import com.asiainfo.chapter2.common.persistence.CrudDao;
import com.asiainfo.chapter2.common.persistence.annotation.MyBatisDao;
import com.asiainfo.chapter2.luomin.entity.Home;

/**
 * Created by Luoo on 2017/9/8.
 */
@MyBatisDao
public interface IHomeDAO extends CrudDao<Home> {
}
