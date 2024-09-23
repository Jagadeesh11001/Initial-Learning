package Interface;

public class Customer {

	public static void main(String[] args) {

		Axis myBank = new Axis();
		myBank.aadhaarManadatory();
		boolean value = myBank.panMandatory();
		System.out.println(value);
		myBank.interestFreeLoan();
		System.out.println(Axis.UPICash);
		
		
		RBI myRbi = new Axis();
		myRbi.housingLoan();
		RBI.bikeLoan();
		
	
	}

}
