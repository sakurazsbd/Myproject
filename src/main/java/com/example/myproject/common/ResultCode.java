package com.example.myproject.common;

/**
 * @Author: lixl
 * @Date: 2021/10/16 14:13
 * @Descrption 响应请求状态信息枚举
 */
public enum ResultCode {

    SUCCESS(1, "success"),
    WARN(0, "warn"),
    FAILURE(-1, "fail");


    private Integer code;
    private String message;


    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    ResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public static String getMassage(String name) {
        for (ResultCode item : ResultCode.values()) {
            if (item.name().equals(name)) {
                return item.message;
            }
        }
        return name;
    }

    public static Integer getCode(String name) {
        for (ResultCode item : ResultCode.values()) {
            if (item.name().equals(name)) {
                return item.code;
            }
        }
        return null;
    }

    public static String getMessageFromCode(int code) {
        for (ResultCode item : ResultCode.values()) {
            if (item.getCode().equals(code)) {
                return item.message;
            }
        }
        return null;
    }

    public static Integer getCodeFromMessage(String message) {
        for (ResultCode item : ResultCode.values()) {
            if (item.getMessage().equals(message)) {
                return item.code;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "ResultCode{" +
                "code=" + code +
                ", message='" + message + '\'' +
                '}';
    }

}
