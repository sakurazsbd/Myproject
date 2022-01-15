package com.example.myproject.swagger2.controller;

import com.example.myproject.common.AjaxResult;
import com.example.myproject.common.BaseController;
import com.example.myproject.common.ErrorCode;
import com.example.myproject.service.OpService;
import com.example.myproject.swagger2.pro.BizComponent;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @Author: lixl
 * @Date: 2021/9/17 20:20
 * @Descrption
 */
@RestController
@Api(tags = "swagger实例验证")
@RequestMapping(value = "/api/helloswagger")
public class HelloSwaggerController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloSwaggerController.class);

    @Autowired
    OpService op;


    @ApiIgnore
    @GetMapping("/helloignore")
    public @ResponseBody AjaxResult<String> hello() {
        return success("hello");
    }


    @ApiOperation(value = "欢迎界面", notes = "welcome")
//    @ApiImplicitParams(value = {
//            @ApiImplicitParam(value = "username", name = "username", required = true, paramType = "query"),
//            @ApiImplicitParam(value = "password", name = "password", required = true, paramType = "query")
//    })
    @ApiResponses(value = {
            @ApiResponse(code = 0, message = "succed"),
            @ApiResponse(code = -1, message = "failed")
    })
    @PostMapping(value = "/hello")
    public AjaxResult<Object> welcome(@RequestParam(value = "账号") String account,
                                          @RequestParam(value = "密码") String password) {
        return success("succeed1, demo/indx");
    }


    @ApiOperation(value = "获取总数", notes = "welcome")
    @PostMapping(value = "/getsum")
    public AjaxResult<Object> getSum() {
        try {
            return success(op.getSum());
        } catch (Exception e) {
            LOGGER.error("Database query execution error.", e);
            return fail("Database query execution error.");
        }
    }


    @ApiOperation(value = "列表", notes = "分页列表")
    @PostMapping("/list")
    public AjaxResult<Object> list(@RequestBody BizComponent bizComponent) {
        if (bizComponent.getId() == 0) {
            LOGGER.error(ErrorCode.REQUESTBODY_ERROR.getMsg());
            return fail(ErrorCode.REQUESTBODY_ERROR);
        }
        return success("执行成功", bizComponent);
    }


}
