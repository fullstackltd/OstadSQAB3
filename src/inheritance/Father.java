package inheritance;

public class Father extends GF {

	public int house;
	
	public Father() {
		super();
		System.out.println("I am Father");
	}
	
	public final void rideBike() {
		System.out.println("Father can ride a bike");
	}

	@Override
	public String toString() {
		return "Father [house=" + house + ", land=" + land + "]";
	}
	
}
