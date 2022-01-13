package com.example.myproject.aoplog.service.impl;

import com.example.myproject.aoplog.pro.SysLog;
import com.example.myproject.aoplog.service.ISysLogService;
import com.example.myproject.mapper.aoplog.SysLogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: lixl
 * @Date: 2021/11/29 19:03
 * @Descrption
 */

@Service("sysLogService")
public class SysLogServiceImpl implements ISysLogService {

    @Autowired
    private SysLogMapper sysLogMapper;

    @Override
    public int saveSysLog(SysLog syslog) {
        // TODO Auto-generated method stub
        return sysLogMapper.saveSysLog(syslog);
    }


}
