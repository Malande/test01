package com.shsxt.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogCut {
	@Pointcut("execution (* com.shsxt.service..*.*(..))")
	public void cut(){}
	
	
	@Before(value="cut()")
	public void before(){
		System.out.println("前置通知，方法执行前执行该方法。。。");
	}
	@AfterReturning(value="cut()")
	public void after(){
		System.out.println("最后");
	}
}
