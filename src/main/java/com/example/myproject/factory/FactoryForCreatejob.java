package com.example.myproject.factory;

import com.example.myproject.strategy.AlgorithmStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: lixl
 * @Date: 2021/8/14 16:06
 */


@Service
public class FactoryForCreatejob {

    @Autowired(required = false)
    Map<String, AlgorithmStrategy> strategys = new ConcurrentHashMap<>(3);

    public AlgorithmStrategy getAlgorithm(String component) throws Exception{
        AlgorithmStrategy algorithmStrategy = strategys.get(component);

        if(algorithmStrategy == null) {
            throw new RuntimeException("no strategy defined");
        }

        return algorithmStrategy;
    }




}
