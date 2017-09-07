package com.asiainfo.chapter2.luomin.dao.interfaces;

import com.asiainfo.chapter2.luomin.bo.BOCustomerBean;

/**
 * @author Luoo
 * @create 2017-08-18 10:11
 */

public interface ICustomerDAO {

    BOCustomerBean queryCustomerById(long id);
}
