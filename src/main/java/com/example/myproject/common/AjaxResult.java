package com.example.myproject.common;

/**
 * @Author: lixl
 * @Date: 2021/9/21 20:30
 * @Descrption 优雅的统一restful返回结果
 */
public class AjaxResult<T> {

    private Integer code;
    private String msg;
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public AjaxResult(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

//    public AjaxResult success() {
//        AjaxResult ajaxResult = new AjaxResult();
//        ajaxResult.setCode(ResultCode.SUCCESS.getCode());
//        ajaxResult.setMsg(ResultCode.SUCCESS.getMessage());
//        return ajaxResult;
//    }
//    public AjaxResult success(String message) {
//        AjaxResult ajaxResult = new AjaxResult();
//        ajaxResult.setCode(ResultCode.SUCCESS.getCode());
//        ajaxResult.setMsg(message);
//        return ajaxResult;
//    }
//    public AjaxResult success(T data) {
//        AjaxResult ajaxResult = new AjaxResult();
//        ajaxResult.setCode(ResultCode.SUCCESS.getCode());
//        ajaxResult.setMsg(ResultCode.SUCCESS.getMessage());
//        ajaxResult.setData(data);
//        return ajaxResult;
//    }
//    public AjaxResult success(String msg, T data) {
//        AjaxResult ajaxResult = new AjaxResult();
//        ajaxResult.setCode(ResultCode.SUCCESS.getCode());
//        ajaxResult.setMsg(msg);
//        ajaxResult.setData(data);
//        return ajaxResult;
//    }
//    public AjaxResult success(Integer code, String msg, T data) {
//        AjaxResult ajaxResult = new AjaxResult();
//        ajaxResult.setCode(code);
//        ajaxResult.setMsg(msg);
//        ajaxResult.setData(data);
//        return ajaxResult;
//    }
//
//    public AjaxResult fail() {
//        AjaxResult ajaxResult = new AjaxResult();
//        ajaxResult.setCode(ResultCode.FAILURE.getCode());
//        ajaxResult.setMsg(ResultCode.FAILURE.getMessage());
//        return ajaxResult;
//    }
//    public AjaxResult fail(String message) {
//        AjaxResult ajaxResult = new AjaxResult();
//        ajaxResult.setCode(ResultCode.FAILURE.getCode());
//        ajaxResult.setMsg(message);
//        return ajaxResult;
//    }
//    public AjaxResult fail(T data) {
//        AjaxResult ajaxResult = new AjaxResult();
//        ajaxResult.setCode(ResultCode.FAILURE.getCode());
//        ajaxResult.setMsg(ResultCode.SUCCESS.getMessage());
//        ajaxResult.setData(data);
//        return ajaxResult;
//    }
//    public AjaxResult fail(String msg, T data) {
//        AjaxResult ajaxResult = new AjaxResult();
//        ajaxResult.setCode(ResultCode.FAILURE.getCode());
//        ajaxResult.setMsg(msg);
//        ajaxResult.setData(data);
//        return ajaxResult;
//    }
//    public AjaxResult fail(Integer code, String msg, T data) {
//        AjaxResult ajaxResult = new AjaxResult();
//        ajaxResult.setCode(code);
//        ajaxResult.setMsg(msg);
//        ajaxResult.setData(data);
//        return ajaxResult;
//    }


    @Override
    public String toString() {
        return "AjaxResult{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
