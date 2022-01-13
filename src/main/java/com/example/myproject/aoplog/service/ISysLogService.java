package com.example.myproject.aoplog.service;

import com.example.myproject.aoplog.pro.SysLog;

/**
 * @Author: lixl
 * @Date: 2021/11/29 19:00
 * @Descrption
 */
public interface ISysLogService {

    /**
     *
     * @param syslog
     * @return
     */
    int saveSysLog(SysLog syslog);


}
