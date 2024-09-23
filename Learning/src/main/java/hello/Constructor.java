package hello;

public class Constructor {

	public Constructor(int x,String J, boolean s, float f) {
		this.x=x; 
		this.name=J;
		this.data=s;
		this.inti=f;
	}

	int x;
	String name;
	boolean data;
	float inti;	
	
	void display() {
		System.out.println(x + "--" + name + "--" + data + "--" + inti);
	}
	
	public static void main(String[] args) {
		Constructor Cs = new Constructor(1311, "Jaga", true, 1.00F);
		Cs.display();
		Constructor Cs1 = new Constructor(1524, "Jagan", false, 1.11F);
		Cs1.display();
		
	}
}
