package Chapter_06_08;

public class Method_Example_09 {

	//�ʵ�
	int speed;
	
	//������
	
	//�޼ҵ�
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("Ű�� �����ϴ�.");
	}
	
	void run() {
		for(int i = 0; i<=50; i+=10) {
			speed = i;
			System.out.println("�ü� : "+speed+"km/j)");
		}
	}
}
