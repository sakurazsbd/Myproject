package com.example.myproject.controller;

import com.example.myproject.common.AjaxResult;
import com.example.myproject.common.BaseController;
import com.example.myproject.service.OpService;
import com.example.myproject.util.EncTest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: lixl
 * @Date: 2021/11/6 21:17
 * @Descrption
 */
@Api(tags = "日志打印测试")
@RestController
public class IndexController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    OpService opService;


    @ApiOperation(value = "/index")
    @RequestMapping(value = "/index", method = RequestMethod.POST)
    public String index() {
        return "Hello Spring Security";
    }



    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public AjaxResult<Object> logPrint(@RequestParam int code){
        //日志级别从低到高分为TRACE < DEBUG < INFO < WARN < ERROR < FATAL，如果设置为WARN，则低于WARN的信息都不会输出。
        LOGGER.trace("日志输出 trace");
        LOGGER.debug("日志输出 debug");
        LOGGER.info("日志输出 info");
        LOGGER.warn("日志输出 warn");
        LOGGER.error("日志输出 error");

        try {
            if (code == 1) {
                return success();
            } else if (code == 2) {
                return success();
            } else {
                return success();
            }
        } catch (Exception e) {
            LOGGER.error("zhixing failed.", e);
            return success();
        }
    }

    @ApiOperation("查询任务详细信息")
    @RequestMapping(value = "/gettaskinfo", method = RequestMethod.POST)
    public AjaxResult<Object> getTaskInfo(@RequestParam String numberId) {
        try {
            return success("查询成功", opService.gettaskinfo(numberId));
        } catch (Exception e) {
            LOGGER.error("search failed: ", e);
            return fail("查询失败", e);
        }
    }

    @ApiOperation("测试用例中生成加密后的秘钥")
    @RequestMapping(value = "/makemiyao", method = RequestMethod.POST)
    public AjaxResult<Object> makeMiyao(@RequestParam("管理员身份ID") String managerId) {

        EncTest encTest = new EncTest();
        encTest.getPass();

        return success("生成成功", "please check in from logs.");

    }



}
