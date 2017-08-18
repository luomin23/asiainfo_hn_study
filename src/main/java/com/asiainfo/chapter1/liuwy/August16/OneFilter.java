package com.asiainfo.chapter1.liuwy.augus16;

import java.util.logging.Filter;
import java.util.logging.LogRecord;

/**
 * Created by LENOVO on 2017/8/16.
 */
public class OneFilter implements Filter{
    @Override
    public boolean isLoggable(LogRecord logRecord) {
        return false;
    }
}
