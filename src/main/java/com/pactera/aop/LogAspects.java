package com.pactera.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

//日志切面类
@Aspect
public class LogAspects {
    @Pointcut("execution(public int com.pactera.aop.Calculator.*(..))")
    public void pointCut(){};

    @Before("pointCut()")
    public void logStart(){
        System.out.println("@Before");
    }
    @After("pointCut()")
    public void logEnd(){
        System.out.println("@After");
    }
    @AfterReturning("pointCut()")
    public void logReturn(){
        System.out.println("@AfterReturning");
    }
    @AfterThrowing("pointCut()")
    public void logException(){
        System.out.println("@AfterThrowing");
    }
    @Around("pointCut()")
    public Object Around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("@Around:执行目标方法之前...");
        Object obj = proceedingJoinPoint.proceed();//相当于开始调div地
        System.out.println("@Around:执行目标方法之后...");
        return obj;
    }
}
