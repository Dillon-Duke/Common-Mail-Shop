package com.tencent.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AroundAspect {
	
	@Around("execution (* com.tencent.service.impl.*.*(..))")
	public Object around(ProceedingJoinPoint point) throws Throwable {
		System.out.println("qian");
		Object proceed = point.proceed(point.getArgs());
		System.out.println("hou");
		return proceed;
		
	}

}
