package com.springbook.biz.board;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.springbook.biz.user.UserService;
import com.springbook.biz.user.UserVO;

public class UserServiceClient {
	public static void main(String args[]) {
		// 1. spring container ����
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2. BoardServcieImpl�� lookup
		UserService userService = (UserService) container.getBean("userService");
		
		// 3. �α��� ��� �׽�Ʈ
		UserVO vo = new UserVO();
		vo.setId("test");
		vo.setPassword("test123");
		
		UserVO user = userService.getUser(vo);
		if(user != null) {
			System.out.println(user.getName() + "�� ȯ���մϴ�");
		}
		else {
			System.out.println("�α��� ����");
		}
		
		// 4. close spring container
		container.close();
	
	}
}