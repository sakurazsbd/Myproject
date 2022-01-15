package com.example.myproject.common;

/**
 * @Author: lixl
 * @Date: 2022/1/15 13:58
 * @Descrption
 */
public enum ErrorCode {

    REQUEST_PARAMETER_ERROR(10001, "Some request parameters are wrong!"),
    REQUESTBODY_ERROR(10001, "Request body error!");

    private int code;
    private String msg;

    ErrorCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
