package inheritance;

public class Son extends Father {
	public final int taka; // blank final
	
	public Son(int taka) {
		this.taka = taka;
		super.house = 2;
	}
	

//	public void rideBike() {
//		System.out.println("Son can ride a bike");
//		System.out.println("Son can ride a racing bike");
//	}
	
	public void driveCar() {
		System.out.println("I can drive a car");
	}
	

	@Override
	public String toString() {
		return "Son [taka=" + taka + ", house=" + house + ", land=" + land + "]";
	}
	
}
