package polymorphism;

import org.springframework.stereotype.Component;

@Component("sony")
public class SonySpeaker implements Speaker {
	public SonySpeaker() {
		System.out.println("sony speaker constructor");
	}
	
	public void volumeUp() {
		System.out.println("sony speaker volume up");
	}
	public void volumeDown() {
		System.out.println("sony speaker volume down");
	}
	
}
