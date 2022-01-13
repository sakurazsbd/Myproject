package com.example.myproject.message;

/**
 * @Author: lixl
 * @Date: 2021/11/6 19:01
 * @Descrption
 */
public class ResponseMessage {

    private String message;

    /**
     *
     */
    public ResponseMessage() {

    }

    /**
     * @param message
     */
    public ResponseMessage(String message) {
        this.message = message;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

}
