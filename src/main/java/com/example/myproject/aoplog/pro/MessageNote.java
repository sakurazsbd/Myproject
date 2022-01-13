package com.example.myproject.aoplog.pro;

/**
 * @Author: lixl
 * @Date: 2021/11/27 18:22
 * @Descrption
 */
public class MessageNote {

    String name;
    String message;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MessageNote{" +
                "name='" + name + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
