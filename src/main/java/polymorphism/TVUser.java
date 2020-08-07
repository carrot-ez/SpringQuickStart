package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String args[]) {
		// 1. Spring container 구동
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2. Spring Container로 부터 객체 요청
		TV tv = (TV)factory.getBean("tv");
		TV tv2 = (TV)factory.getBean("tv"); // default: singleton pattern
		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		
		// 3. close spring container
		factory.close();
	}
}
