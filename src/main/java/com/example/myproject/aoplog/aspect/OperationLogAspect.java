package com.example.myproject.aoplog.aspect;

import com.example.myproject.aoplog.annotation.OperationLog;
import com.example.myproject.aoplog.pro.SysLog;
import com.example.myproject.aoplog.service.ISysLogService;
import com.example.myproject.aoplog.util.HttpContextUtils;
import com.example.myproject.aoplog.util.IPUtils;
import com.example.myproject.mapper.aoplog.SysLogMapper;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.LocalVariableTableParameterNameDiscoverer;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;

/**
 * @Author: lixl
 * @Date: 2021/11/27 16:04
 * @Descrption 定义一个LogAspect类，使用@Aspect标注让其成为一个切面，切点为使用@Log注解标注的方法，使用@Around环绕通知：
 */
@Aspect
@Component
public class OperationLogAspect {
    private final static Logger LOGGER = LoggerFactory.getLogger(OperationLogAspect.class);

//    @Autowired
//    private SysLogMapper sysLogMapper;

    @Autowired
    private ISysLogService iSysLogService;

    /**
     * 设置操作日志切入点   在注解的位置切入代码
     */
    @Pointcut("@annotation(com.example.myproject.aoplog.annotation.OperationLog)")
    public void pointcut() {}

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint point) {
        long beginTime = System.currentTimeMillis();
        Object retMsg = null;
        try {
            LOGGER.info("我在目标方法之前执行！");
            // 执行方法
            retMsg = point.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        // 执行时长(毫秒)
        long time = System.currentTimeMillis() - beginTime;
        // 保存日志
        saveLog(point, time);
        return retMsg;
    }

    private void saveLog(ProceedingJoinPoint joinPoint, long time) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        SysLog syslog = new SysLog();
        OperationLog logAnnotation = method.getAnnotation(OperationLog.class);
        if (logAnnotation != null) {
            // 注解上的描述
            syslog.setOperation(logAnnotation.value());
        }
        // 请求的方法名
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = signature.getName();
        syslog.setMethod(className + "." + methodName + "()");
        // 请求的方法参数值
        Object[] args = joinPoint.getArgs();


        System.out.println(args.length);
        System.out.println("传入的参数是:" + Arrays.toString(args));


        // 请求的方法参数名称
        LocalVariableTableParameterNameDiscoverer u = new LocalVariableTableParameterNameDiscoverer();
        String[] paramNames = u.getParameterNames(method);
        System.out.println(paramNames.toString());
        if (args != null && paramNames != null) {
            String params = "";
            for (int i = 0; i < args.length; i++) {
                params += "  " + paramNames[i] + ": " + args[i];
            }
            syslog.setParams(params);
        }

        // 获取request
        HttpServletRequest request = HttpContextUtils.getHttpServletRequest();
        // 设置IP地址
        syslog.setIp(IPUtils.getIpAddr(request));
        // 模拟一个用户名
        syslog.setUsername("mrbird");
        syslog.setTime((int) time);
        Date date = new Date();
        syslog.setCreateTime(date);
        // 保存系统日志
//        sysLogMapper.saveSysLog(syslog);
        iSysLogService.saveSysLog(syslog);
    }

}
