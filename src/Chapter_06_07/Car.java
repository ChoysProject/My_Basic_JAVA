package Chapter_06_07;

public class Car {

	// 필드 
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자
	Car(){
		// 생성자1
	}
	Car(String model){
		// 생성자2
		this.model = model;
	}
	Car(String model, String color){
		// 생성자3
		this.model = model;
		this.color = color;
	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
	
}
