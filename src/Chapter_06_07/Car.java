package Chapter_06_07;

public class Car {

	// �ʵ� 
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	// ������
	Car(){
		// ������1
	}
	Car(String model){
		// ������2
		this.model = model;
	}
	Car(String model, String color){
		// ������3
		this.model = model;
		this.color = color;
	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
	
}
