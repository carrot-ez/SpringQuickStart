package com.srpingbook.biz.board;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.srpingbook.biz.user.UserService;
import com.srpingbook.biz.user.UserVO;

public class BoardServiceClient {
	public static void main(String args[]) {
		// 1. spring container 구동
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2. BoardServcieImpl을 lookup
		UserService userService = (UserService) container.getBean("userService");
		
		// 3. 로그인 기능 테스트
		UserVO vo = new UserVO();
		vo.setId("test");
		vo.setPassword("test123");
		
		UserVO user = userService.getUser(vo);
		if(user != null) {
			System.out.println(user.getName() + "님 환영합니다");
		}
		else {
			System.out.println("로그인 실패");
		}
		
		// 4. close spring container
		container.close();
	}

}
