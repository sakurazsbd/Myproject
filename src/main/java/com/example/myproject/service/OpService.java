package com.example.myproject.service;

import com.example.myproject.factory.FactoryForCreatejob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.myproject.mapper.jonMapper;

import java.util.List;
import java.util.Map;

/**
 * @Author: lixl
 * @Date: 2021/9/21 10:13
 * @Descrption
 */

@Service
public class OpService {
    private static final Logger LOGGER = LoggerFactory.getLogger(OpService.class);


    @Autowired
    jonMapper jonMapper;

    @Autowired
    FactoryForCreatejob factoryForCreatejob;


    public Integer get() {
        return jonMapper.get();
    }

    public String[] get1() throws Exception {
        return factoryForCreatejob.getAlgorithm("HeteroSecureBoost").doOperation("11");
    }

    public List<Map<String, String>> gettaskinfo(String numberId) {
        List<Map<String, String>> result = null;
        if (numberId.equals("lixl")) {
            LOGGER.info("当前用户是管理员用户，执行查询");
            result = jonMapper.selectTaskInfo();
        } else {
            LOGGER.info("当前用户非管理员用户，禁止查询");
        }
        return result;
    }


}
