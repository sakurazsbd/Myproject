package com.example.myproject.common;

/**
 * @Author: lixl
 * @Date: 2021/11/29 14:53
 * @Descrption
 */
public class BaseController {

    public <T> AjaxResult<T> success() {
        return new AjaxResult<>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(), null);
    }
    public <T> AjaxResult<T> success(T data) {
        return new AjaxResult<>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(), data);
    }
    public <T> AjaxResult<T> success(String msg, T data) {
        return new AjaxResult<>(ResultCode.SUCCESS.getCode(), msg, data);
    }
    public <T> AjaxResult<T> success(Integer code, String msg, T data) {
        return new AjaxResult<>(code, msg, data);
    }


    public AjaxResult fail() {
        return new AjaxResult<>(ResultCode.FAILURE.getCode(), ResultCode.FAILURE.getMessage(), null);
    }
    public <T> AjaxResult<T> fail(T data) {
        return new AjaxResult<>(ResultCode.FAILURE.getCode(), ResultCode.FAILURE.getMessage(), data);
    }
    public <T> AjaxResult<T> fail(String msg, T data) {
        return new AjaxResult<>(ResultCode.FAILURE.getCode(), msg, data);
    }
    public <T> AjaxResult<T> fail(Integer code, String msg, T data) {
        return new AjaxResult<>(code, msg, data);
    }

}
