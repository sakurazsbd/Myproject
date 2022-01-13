package com.example.myproject.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: lixl
 * @Date: 2021/10/16 19:43
 * @Descrption 时间格式工具类
 */
public class DateUtil {

    public static final DateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    public static final DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");

    public static String formatDateTime(Date date) {
        return dateTimeFormat.format(date);
    }

    public static String formatDate(Date date) {
        return dateFormat.format(date);
    }

    public static String formatTime(Date date) {
        return timeFormat.format(date);
    }


}
