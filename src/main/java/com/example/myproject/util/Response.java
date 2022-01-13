package com.example.myproject.util;

/**
 * @Author: lixl
 * @Date: 2021/8/14 15:14
 */
public class Response {


    public String OKresponse(){
        String result = "{\n" +
                "    \"Code\": \"0\",\n" +
                "\t\"ReMsg\": \"OK\",\n" +
                "    \"Data\": null\n" +
                "}";
        //System.out.println("22");
        return result;
    }
    public String Errorresponse(){
        String result = "{\n" +
                "    \"Code\": \"-1\",\n" +
                "\t\"ReMsg\": \"error\",\n" +
                "    \"Data\": error\n" +
                "}";
        //System.out.println("33");
        return result;
    }


}
