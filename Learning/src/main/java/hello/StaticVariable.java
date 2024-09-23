package hello;

public class StaticVariable {

	int x=0; //Instance variabe - wthout 'Static'
	static int y=0;
	
	void counter() {
		x++;
		y++;
		System.out.println("non-static =>"+x+ "static =>"+y);
	}
	public static void main(String[] args) {
		StaticVariable sv = new StaticVariable();
		sv.counter();
		sv.counter();

	}
		
}
