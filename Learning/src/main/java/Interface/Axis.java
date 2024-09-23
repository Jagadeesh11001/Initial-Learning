package Interface;

public class Axis implements RBI{

	public void interestFreeLoan() {
		System.out.println("Free Loan");
		
	}
	
	@Override
	public void aadhaarManadatory() {
		System.out.println("Aadhar Added");
	}

	@Override
	public boolean panMandatory() {
		return true;
	}

}
