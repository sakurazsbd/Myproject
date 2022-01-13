package com.example.myproject.util;

/**
 * @Author: lixl
 * @Date: 2021/10/16 15:30
 * @Descrption 状态枚举
 */
public enum StatusInfo {

    WAITING(1, "等待中"),
    RUNNING(2, "进行中"),
    SUCCESS(3, "成功"),
    FAILURE(4, "失败"),
    OPENING(10, "打开"),
    CLOSURE(20, "关闭");

    private Integer code;
    private String message;

    StatusInfo(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static Integer getCodeFromName(String statusName) {
        for (StatusInfo item : StatusInfo.values()) {
            if (item.name().equals(statusName)) {
                return item.code;
            }
        }
        return null;
    }

    public static String getMessageFromName(String statusName) {
        for (StatusInfo item : StatusInfo.values()) {
            if (item.name().equals(statusName)) {
                return item.message;
            }
        }
        return null;
    }

    public static Integer getCodeFromMessage(String message) {
        for (StatusInfo item : StatusInfo.values()) {
            if (item.getMessage().equals(message)) {
                return item.code;
            }
        }
        return null;
    }
    public static String getMessageFromCode(Integer code) {
        for (StatusInfo item : StatusInfo.values()) {
            if (item.getCode().equals(code)) {
                return item.message;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "StatusInfo{" +
                "code=" + code +
                ", message='" + message + '\'' +
                '}';
    }

}
