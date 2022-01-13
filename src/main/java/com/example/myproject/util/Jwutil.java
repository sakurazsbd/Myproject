package com.example.myproject.util;


import com.alibaba.fastjson.JSONObject;

import java.io.*;

/**
 * @Author: lixl
 * @Date: 2021/8/14 15:24
 */
public class Jwutil {

    /**
     * Get algorithm type
     * @param JSONString
     * @return result_Algorithm_Select
     */
    public String Algorithm_Select(String JSONString) {

        JSONObject jsonObject = JSONObject.parseObject(JSONString);
        String result_Algorithm_Select = jsonObject.getString("algorithm");
        System.out.println("The algorithm selected by the user is " + result_Algorithm_Select);

        return result_Algorithm_Select;
    }

    /**
     * Get task information
     * @param JSONString
     * @return task_info
     */
    public String[] Get_task_info(String JSONString) {

        //String[] task_info = new String[0];

        JSONObject jsonObject = JSONObject.parseObject(JSONString);
        String get_Task_name = jsonObject.getString("Task_name");
        String get_Task_description = jsonObject.getString("Task_description");
        String get_Task_type = jsonObject.getString("Task_type");
        String get_Model_Name = jsonObject.getString("Model_Name");
        String get_algorithm = jsonObject.getString("algorithm");

        return new String[]{get_Task_name, get_Task_description, get_Task_type, get_Model_Name, get_algorithm};
    }

    /**
     * Parse the json template
     * @param pactFile
     * @return JsonString
     * @throws IOException
     */
    public String ReadJsonData(String pactFile) throws IOException {
        //System.out.println("读取文件数据util");
        System.out.println("Start read file!");

        StringBuffer strbuffer = new StringBuffer();
        File myFile = new File(pactFile);//"D:"+File.separatorChar+"DStores.json"
        if (!myFile.exists()) {
            System.err.println("Can't Find " + pactFile);
        }
        try {
            FileInputStream fis = new FileInputStream(pactFile);
            InputStreamReader inputStreamReader = new InputStreamReader(fis, "UTF-8");
            BufferedReader in  = new BufferedReader(inputStreamReader);
            String str;
            while ((str = in.readLine()) != null) {
                strbuffer.append(str);  //new String(str,"UTF-8")
            }
            in.close();
        } catch (IOException e) {
            e.getStackTrace();
        }
        System.out.println("Read successfully!");
        return strbuffer.toString();
    }

}
