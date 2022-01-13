package com.example.myproject.util;

import com.example.myproject.common.AjaxResult;
import com.example.myproject.common.ResultCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: lixl
 * @Date: 2021/10/16 14:26
 * @Descrption 测试这个工具或者功能的运行情况（正确与否）
 */
public class Test {

    private static final Logger LOGGER = LoggerFactory.getLogger(Test.class);

    public static final DateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    public static void main(String[] args) {

        /**
         * Before
         */
        Map<String,Object> data = new HashMap<>();
        data.put("date", dateTimeFormat.format(new Date()));



        /**
         * ResultCode Test
         */
        LOGGER.info("ResultCode Test!");
        System.out.println("one:" + ResultCode.getCode("成功"));

        System.out.println("two ~" + ResultCode.getCode("FAILURE"));
        System.out.println("two ~" + ResultCode.getCode("SUCCESS"));

        System.out.println("three ~" + ResultCode.getMessageFromCode(1));
        System.out.println("three ~" + ResultCode.getMessageFromCode(0));

        System.out.println("four ~" + ResultCode.getCodeFromMessage("成功"));
        System.out.println("four ~" + ResultCode.getCodeFromMessage("失败"));



        /**
         * StatusInfo Test
         */
        LOGGER.info("StatusInfo Test!");
        System.out.println("one : " + StatusInfo.class);
        System.out.println("one : " + StatusInfo.values());
        System.out.println("one : " + StatusInfo.values().length);

        System.out.println("two : " + StatusInfo.valueOf("SUCCESS"));
        System.out.println("two : " + StatusInfo.valueOf("SUCCESS").name());
        System.out.println("two : " + StatusInfo.valueOf("SUCCESS").toString());
        System.out.println("two : " + StatusInfo.valueOf("SUCCESS").getCode());
        System.out.println("two : " + StatusInfo.valueOf("SUCCESS").getMessage());
        System.out.println("two : " + StatusInfo.valueOf("SUCCESS").hashCode());

        System.out.println("three : " + StatusInfo.getCodeFromName("WAITING"));
        System.out.println("three : " + StatusInfo.getMessageFromName("WAITING"));
        System.out.println("three : " + StatusInfo.getCodeFromMessage("失败"));
        System.out.println("three : " + StatusInfo.getMessageFromCode(10));


        /**
         * AjaxResult Test
         */
        LOGGER.info("AjaxResult Test!");
//        AjaxResult ajaxResult = new AjaxResult();
//        System.out.println("four : " + ajaxResult.success());
//        System.out.println("four : " + ajaxResult.success("这是msg2"));
//        System.out.println("four : " + ajaxResult.success(data));
//        System.out.println("four : " + ajaxResult.success("这是msg4", data));
//        System.out.println("four : " + ajaxResult.success(100,"这是msg5", data));
//
//        System.out.println("four : " + ajaxResult.fail());
//        System.out.println("four : " + ajaxResult.fail("这是msg7"));
//        System.out.println("four : " + ajaxResult.fail(data));
//        System.out.println("four : " + ajaxResult.fail("这是msg9", data));
//        System.out.println("four : " + ajaxResult.fail(200,"这是msg10", data));


        /**
         * DateUtil Test
         */
        System.out.println(DateUtil.formatDateTime(new Date()));
        System.out.println(DateUtil.formatDate(new Date()));
        System.out.println(DateUtil.formatTime(new Date()));





    }





}
