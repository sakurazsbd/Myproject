package com.example.myproject.mapper.aoplog;

import com.example.myproject.aoplog.pro.SysLog;
import org.apache.ibatis.annotations.Insert;

/**
 * @Author: lixl
 * @Date: 2021/11/27 16:46
 * @Descrption
 */
public interface SysLogMapper {
    @Insert("INSERT INTO sys_log(username, operation, time, method, params, ip, create_time)" +
            "VALUES(#{username}, #{operation}, #{time}, #{method}, #{params}, #{ip}, #{createTime})")
    int saveSysLog(SysLog syslog);
}
