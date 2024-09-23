package inheritance;

public class BMW extends Bike {

	int mileage = 20;
	
	String getColour() {
		return "limestone red";
	}
	
	public static void main(String[] args) {
		
		BMW myBike = new BMW();
		int mil =	myBike.mileage;
		myBike.getColour();
		System.out.println(mil);
		boolean hasDisc = myBike.hasDisc();
		System.out.println(hasDisc);
		myBike.applyBrake();
		
		
	}
	
}
		
		
		 
	
