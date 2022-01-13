package com.example.myproject.swagger2.controller;

import com.example.myproject.aoplog.annotation.OperationLog;
import com.example.myproject.service.OpService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @Author: lixl
 * @Date: 2021/9/17 20:20
 * @Descrption
 */
@Api(tags = "HelloWorld", description = "Swagger实例")
@RequestMapping(value = "/swagger")
@RestController
public class HelloWorldController {

    @Autowired
    OpService op;


    @ApiIgnore
    @GetMapping("helloignore")
    public @ResponseBody String hello() {
        return "hello";
    }


    @ApiOperation(value = "欢迎界面", notes = "welcome")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(value = "username", name = "username", required = true, paramType = "query"),
            @ApiImplicitParam(value = "password", name = "password", required = true, paramType = "query")
    })
    @ApiResponses(value = {
            @ApiResponse(code = 0, message = "succed"),
            @ApiResponse(code = -1, message = "failed")
    })
    @PostMapping(value = "/hello")
    public String adduser1(String username, String password) {

        System.out.println("username：" +username);
        System.out.println("password：" +password);

        return "succeed1, demo/indx";

    }



    @ApiOperation(value = "欢迎界面", notes = "welcome")
    @ApiResponses(value = {
            @ApiResponse(code = 0, message = "succed"),
            @ApiResponse(code = -1, message = "failed")
    })
    @PostMapping(value = "/get")
    public Integer adduser1() {
        return op.get();
    }


}
