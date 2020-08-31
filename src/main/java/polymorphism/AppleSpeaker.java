package polymorphism;

import org.springframework.stereotype.Component;

@Component("apple")
public class AppleSpeaker implements Speaker {
	
	public AppleSpeaker() {
		System.out.println("apple speaker constructor");
	}
	
	public void volumeUp() {
		System.out.println("apple speaker volume up");
	}
	public void volumeDown() {
		System.out.println("apple speaker volume down");
	}
}
