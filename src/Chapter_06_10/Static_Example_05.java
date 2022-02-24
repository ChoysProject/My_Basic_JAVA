package Chapter_06_10;

public class Static_Example_05 {

	
	int speed;
	
	void run() {
		System.out.println(speed + " 으로 달립니다.");
	}
	
	
	public static void main(String[] args) {
		Static_Example_05 myCar = new Static_Example_05();
		myCar.speed = 60;
		myCar.run();
	}
	
	
	
	
	
	
	
}
