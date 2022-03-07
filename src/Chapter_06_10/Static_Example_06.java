package Chapter_06_10;

public class Static_Example_06 {

	
	// ΩÃ±€≈Ê
	
	private static Static_Example_06 singleton = new Static_Example_06();
	
	private Static_Example_06() {}
	
	static Static_Example_06 getInstance() {
		return singleton;
	}
	
	
}
