package com.example.myproject.aoplog.util;

import com.example.myproject.util.StatusInfo;

/**
 * @Author: lixl
 * @Date: 2021/11/28 17:25
 * @Descrption
 */
public enum OperationType {

    CREATE("create", "新增"),
    DELETE("delete", "删除"),
    UPDATE("update", "修改"),
    GET("get", "查询");


    private String method;
    private String methodName;

    OperationType(String method, String methodName) {
        this.method = method;
        this.methodName = methodName;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getMethodFromName(String operType) {
        for (OperationType item : OperationType.values()) {
            if (item.name().equals(operType)) {
                return item.method;
            }
        }
        return null;
    }

    public String getMethodNameFromName(String operType) {
        for (OperationType item : OperationType.values()) {
            if (item.name().equals(operType)) {
                return item.methodName;
            }
        }
        return null;
    }
}
