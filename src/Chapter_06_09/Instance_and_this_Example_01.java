package Chapter_06_09;

public class Instance_and_this_Example_01 {

	// �ʵ�
	
	String model;
	int speed;
	
	// ������
	Instance_and_this_Example_01 (String model){
		this.model = model;
	}
	
	// �޼ҵ� 
	
	void setSpeed(int speed){
		this.speed = speed;
	}

	void run() {
		
		for(int i=0; i<=50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model + "�� �޸��ϴ�. (�ü�: " + this.speed + " km/h)");
		}
		
	}
	
}
