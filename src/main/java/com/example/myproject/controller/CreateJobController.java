package com.example.myproject.controller;

import com.example.myproject.common.AjaxResult;
import com.example.myproject.common.BaseController;
import com.example.myproject.factory.FactoryForCreatejob;
import com.example.myproject.service.OpService;
import com.example.myproject.util.Jwutil;
import com.example.myproject.util.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;

/**
 * @Author: lixl
 * @Date: 2021/8/14 15:05
 */

@Api(value = "任务管理")
@RestController
public class CreateJobController extends BaseController {
    Response response = new Response();
    Jwutil jwutil = new Jwutil();

    @Autowired
    FactoryForCreatejob factoryForCreatejob;
    @Autowired
    OpService opService;

    @ApiOperation("创建建任务")
    @RequestMapping(value = "/createjob", method = RequestMethod.POST)
    public AjaxResult<Object> createjob(HttpServletRequest request) {
        String result = "";
        try {


            BufferedReader reader = request.getReader();
            StringBuilder stringBuilder = new StringBuilder();
            while ((result = reader.readLine()) != null) {
                stringBuilder.append(result);
            }
            System.out.println("1、=========================");
            //System.out.println(result);
            System.out.println(stringBuilder);
            System.out.println("1、==========已获取入参===============");



            String Algorithm = jwutil.Algorithm_Select(String.valueOf(stringBuilder));  //Get algorithm type
            System.out.println("2、=========================");
            System.out.println(Algorithm);
            System.out.println("2、==========已获取算法类型===============");


            String[] task_info = jwutil.Get_task_info(String.valueOf(stringBuilder));
            System.out.println("3、=========================");
            System.out.println(task_info[1]+ "+" + task_info[4]);
            System.out.println("3、==========已获取联邦任务信息===============");


            String[] diaoyongjieguo = factoryForCreatejob.getAlgorithm(Algorithm).doOperation(String.valueOf(stringBuilder));
            System.out.println("4、=========================");
            System.out.println(diaoyongjieguo[0] + diaoyongjieguo[1]);
            System.out.println("4、==========已完成参数替换===============");



            return success("执行成功！");
        }catch (Exception e) {
            e.printStackTrace();
            return fail("执行失败！");
        }


    }

    @ApiOperation("测试普通类方法调用mapper")
    @RequestMapping(value = "/testdiaoyong", method = RequestMethod.POST)
    public AjaxResult<Object> testdiaoyong() throws Exception {
        return success("执行成功", opService.get1());

    }

}

