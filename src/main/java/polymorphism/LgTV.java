package polymorphism;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component()
public class LgTV implements TV {
	@Autowired
	@Qualifier("apple")
	private Speaker appleSpeaker;
	
	//@Resource(name="sony") // == @Autowired @Qualifier("sony")
	@Autowired
	@Qualifier("sony")
	private Speaker sonySpeaker; 
	
	public LgTV() {
		System.out.println("lg tv genereator");
	}
	
	public void powerOn() {
		System.out.println("lg tv power on");
	}
	
	public void powerOff() {
		System.out.println("lg tv power off");
	}
	
	public void volumeUp() {
		appleSpeaker.volumeUp();
	}

	public void volumeDown() {
		sonySpeaker.volumeDown();
	}
}
