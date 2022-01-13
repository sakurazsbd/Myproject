//package com.example.myproject.config;
//
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
///**
// * @Author: lixl
// * @Date: 2021/11/25 11:18
// * @Descrption
// */
//public class CloseSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
////        super.configure(http);
//
//        http.csrf().disable();
//        http.authorizeRequests().anyRequest().permitAll().and().logout().permitAll();
//
//    }
//}
