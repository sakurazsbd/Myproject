package com.example.myproject.aoplog.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: lixl
 * @Date: 2021/11/26 21:49
 * @Descrption 自定义操作日志注解
 */
@Target(ElementType.METHOD) //注解放置的目标位置即方法级别
@Retention(RetentionPolicy.RUNTIME) //注解在哪个阶段执行
public @interface OperationLog {
    String value() default "";  //备注

    String operModul() default ""; // 操作模块

    String operType() default "";  // 操作类型

    String operDesc() default "";  // 操作说明
}
