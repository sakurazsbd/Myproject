package com.example.myproject.aoplog.controller;

import com.example.myproject.aoplog.annotation.OperationLog;
import com.example.myproject.aoplog.pro.MessageNote;
import com.example.myproject.common.BaseController;
import com.example.myproject.common.AjaxResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: lixl
 * @Date: 2021/11/26 21:43
 * @Descrption
 */
@Api(tags = "07.Spring-Boot-AOP-Log")
@RestController
public class LogTestController extends BaseController {

    private final static Logger LOGGER = LoggerFactory.getLogger(LogTestController.class);

    @OperationLog(value = "执行方法一", operModul = "菜单一")
    @ApiOperation("执行方法一")
    @GetMapping("/one")
    public String methodOne(String name) {
        LOGGER.info("这个是新增的操作，请知悉！");
        return "新增成功！";
    }

    @OperationLog("执行方法二")
    @ApiOperation("执行方法二")
    @GetMapping("/two")
    public void methodTwo() throws InterruptedException {
        Thread.sleep(2000);
    }

    @OperationLog("执行方法三")
    @ApiOperation("执行方法三")
    @GetMapping("/three")
    public void methodThree(String name, String age) {
    }

//    @OperationLog("留言4")
//    @ApiOperation("留言4")
//    @PostMapping("/four")
//    public AjaxResult<Object> methodFour(@RequestBody MessageNote messageNote) {
//        String result = String.format("%s， 您好！您的留言（%s）已经收到，我们会尽快处理，感谢支持！",
//                messageNote.getName(), messageNote.getMessage());
//        return success(result);
//    }
//
//    @OperationLog("留言5")
//    @ApiOperation("留言5")
//    @PostMapping("/five")
//    public AjaxResult<Object> methodFive(@RequestParam String message) {
//        String result = String.format("您的留言（%s）已经收到，我们会尽快处理，感谢支持！", message);
//        return success(result);
//    }
//
//
//    @OperationLog("留言6")
//    @ApiOperation("留言6")
//    @PostMapping("/six/{name}/{message}")
//    public AjaxResult<Object> methodSix(@PathVariable("name") String name,
//                                        @PathVariable("message") String message) {
//        String result = String.format("%s， 您好！您的留言（%s）已经收到，我们会尽快处理，感谢支持！",
//                name, message);
//        return success(result);
//    }

}
