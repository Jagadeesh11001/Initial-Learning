package hello;

public class ThisAndInstance {
	
	int c; //Instance or global Variable 
	
	void addTwoNumbers(int a,int b) {
		int c=20; //local variable 
		System.out.println(a+b+c+this.c);
		
	}
	
	public static void main(String[] args) {
		ThisAndInstance ti = new ThisAndInstance();
				ti.addTwoNumbers(25, 15);
	}
	
}
