package com.enjoy.cap10.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @Author:waken
 * @Date: Created in 2019/5/28 20:37
 * @Description: 日志切面类
 */
@Aspect
public class LogAspects {

    @Pointcut("execution(public int com.enjoy.cap10.AOP.Calculator.*(..))")
    public void pointCut() {

    }

    @Before("pointCut()")
    public void logStart() {
        System.out.println("除法运行。。。参数列表是：{}");
    }

    @After("pointCut()")
    public void logEnd() {
        System.out.println("除法运行结束");
    }

    @AfterReturning("pointCut()")
    public void logReturn() {
        System.out.println("除法正常返回。。。返回结果是：{}");
    }

    @AfterThrowing("pointCut()")
    public void logException() {
        System.out.println("除法发生异常。。。返回结果是：{}");
    }

    @Around("pointCut()")
    public Object Around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("@Around:执行目标方法之前");
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("@Around:执行目标方法之后");
        return proceed;
    }
}
