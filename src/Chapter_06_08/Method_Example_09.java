package Chapter_06_08;

public class Method_Example_09 {

	//필드
	int speed;
	
	//생성자
	
	//메소드
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("키를 돌립니다.");
	}
	
	void run() {
		for(int i = 0; i<=50; i+=10) {
			speed = i;
			System.out.println("시속 : "+speed+"km/j)");
		}
	}
}
