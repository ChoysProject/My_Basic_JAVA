package Chapter_06_06;

public class Field_Example_02 {

	public static void main(String[] args) {

		
		// �ܺ� Ŭ�������� Car �ʵ尪 �б�� ����
		
		
		// ��ü ����
		Field_Example_01 myCar = new Field_Example_01();
		
		// �ʵ尪 �б�
		System.out.println("����ȸ�� : " + myCar.company);
		System.out.println("�𵨸� : " + myCar.model);
		System.out.println("�÷� : " + myCar.color);
		System.out.println("�ִ� �ӵ� : " + myCar.maxSpeed);
		System.out.println("���� �ӵ� : " + myCar.speed);
		
		// �ʵ尪 ����
		myCar.speed = 60;
		System.out.println("���� �ӵ� : " + myCar.speed);
		
	}

}
