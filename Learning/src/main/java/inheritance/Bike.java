package inheritance;

public class Bike extends vehicle {
	
	public boolean hasDisc() {
		return true;
	}
		
	public void applyBrake() {
		System.out.println("bike -- break applied");
	}

}
