package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;

import com.springbook.biz.user.UserVO;

public class AfterRetruningAdvice {
	public void afterReturningLog(JoinPoint jp, Object returnObj) {
		String methodNmae = jp.getSignature().getName();
		Object args[] = jp.getArgs();
		
		if(returnObj instanceof UserVO) {
			System.out.println(((UserVO) returnObj).getRole());
		}
		
		System.out.println("args = "+args[0].toString());
	}
}
