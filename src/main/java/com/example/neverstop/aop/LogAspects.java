package com.example.neverstop.aop;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * 切面 包含切点 连接点 通知等
 */
@Aspect
@Slf4j
public class LogAspects {


    @Pointcut("execution(public int com.example.neverstop.aop.MathInts.*(..))")
    public void pointCut(){

    }



    @Before("pointCut()")
    public void methodStart(JoinPoint joinPoint){
        //获取入参
        Object[] signature = joinPoint.getArgs();
        System.out.println("方法" + joinPoint.getSignature().getName() + "在方法运行前开始,入参" + Arrays.asList(signature));

        log.info("方法" + joinPoint.getSignature().getName() + "在方法运行前开始,入参" + Arrays.asList(signature));

    }

    @After("pointCut()")
    public void methodEnd(JoinPoint joinPoint){

        System.out.println("方法" + joinPoint.getSignature().getName() + "在方法结束后执行");
        log.info("方法" + joinPoint.getSignature().getName() + "在方法结束后执行");
    }

    @AfterReturning("pointCut()")
    public void methodReturning(JoinPoint joinPoint){
        System.out.println("方法" + joinPoint.getSignature().getName() + "在方法正常返回后执行返回");
        log.info("方法" + joinPoint.getSignature().getName() + "在方法正常返回后执行返回");
    }

    @AfterThrowing("pointCut()")
    public void methodThrowing(JoinPoint joinPoint){

        System.out.println("方法" + joinPoint.getSignature().getName() + "在方法运行异常是返回");

    }


}
