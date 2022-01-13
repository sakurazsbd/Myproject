package com.example.myproject.util;

import org.jasypt.encryption.StringEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

/**
 * @Author: lixl
 * @Date: 2022/1/8 22:31
 * @Descrption
 */
public class EncTest {

//    @Autowired
//    private StringEncryptor encryptor;
    @Value("jasypt.encryptor.password")
    private StringEncryptor encryptor;



    public int getPass() {
        System.out.println("encryptor: " + encryptor);
        String url = encryptor.encrypt("jdbc:mysql://localhost:3306/test_info?autoReconnect=true&serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=utf-8");
        String name = encryptor.encrypt("root");
        String password = encryptor.encrypt("123456");
        System.out.println("database url: " + url);
        System.out.println("database name: " + name);
        System.out.println("database password: " + password);
//        Assert.assertTrue(url.length() > 0);
//        Assert.assertTrue(name.length() > 0);
//        Assert.assertTrue(password.length() > 0);


        return 1;
    }




}
