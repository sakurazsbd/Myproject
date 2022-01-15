package com.example.myproject.mapper;

import org.apache.ibatis.annotations.Select;

import javax.el.MapELResolver;
import java.util.List;
import java.util.Map;

/**
 * @Author: lixl
 * @Date: 2021/9/21 10:08
 * @Descrption
 */
public interface jonMapper {

    @Select({"SELECT COUNT(*) FROM test_info.personal_information"})
    Integer getSumOfPersonalInformation();

    @Select({"SELECT* FROM test_info.task_info"})
    List<Map<String, String>> selectTaskInfo();



}
