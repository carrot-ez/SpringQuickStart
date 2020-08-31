package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String args[]) {
		// 1. Spring container 구동
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2. Spring Container로 부터 객체 요청
//		TV tv = (TV)factory.getBean("tv");

//		tv.powerOn();
//		tv.volumeUp();
//		tv.volumeDown();
		
		TV tv2 = (TV)factory.getBean("lgTV"); // default: singleton pattern
	
		tv2.volumeUp();
		tv2.volumeDown();
		
		// 3. close spring container
		factory.close();
	}
}
