package com.example.myproject.strategy.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.myproject.mapper.jonMapper;
import com.example.myproject.strategy.AlgorithmStrategy;
import com.example.myproject.util.Jwutil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: lixl
 * @Date: 2021/8/14 17:30
 */
@Component("HeteroSecureBoost")
public class HeteroSecureBoost implements AlgorithmStrategy {

    @Autowired
    jonMapper jonMapper;

    public String[] doOperation(String Algorithm_parameters) {

        String restult1 = "This is ";
        String restult2 = "HeteroSecureBoost";

        return new String[]{restult1, restult2};
    }

}
