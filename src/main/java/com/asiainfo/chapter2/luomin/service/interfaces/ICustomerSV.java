package com.asiainfo.chapter2.luomin.service.interfaces;

import com.asiainfo.chapter2.luomin.bo.BOCustomerBean;

/**
 * @author Luoo
 * @create 2017-08-18 10:13
 */

public interface ICustomerSV {
    BOCustomerBean queryCustomerById(long id);

}
