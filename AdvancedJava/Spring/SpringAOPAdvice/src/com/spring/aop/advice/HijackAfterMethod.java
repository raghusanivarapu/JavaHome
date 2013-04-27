package com.spring.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class HijackAfterMethod implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object obj, Method method, Object[] aobj,
			Object obj1) throws Throwable {
		System.out.println("HijackAfterMethod : After method hijacked!");
	}

}