package com.springbook.ioc.injection;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {
	public static void main(String args[]) {
		// 1. Spring container ����
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2. Spring Container�� ���� ��ü ��û
		CollectionBean bean = (CollectionBean) factory.getBean("collectionBean"); 
		List<String> list = bean.getAddressList();
		for(String s : list) {
			System.out.println(s.toString());
		}
		
		// 3. close spring container
		factory.close();
	}

}
