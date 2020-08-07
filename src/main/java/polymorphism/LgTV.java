package polymorphism;

public class LgTV implements TV {
	
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
		System.out.println("lg tv volume up");
	}

	public void volumeDown() {
		System.out.println("lg tv volume down");
	}
}
