package Interface;

public interface RBI {

	int UPICash = 100000;
	
	void aadhaarManadatory();
	
	boolean panMandatory();

	default void housingLoan() {
		System.out.println("get loan");
	}
	
	static void bikeLoan() {
		System.out.println("bike loan");
	}
}
