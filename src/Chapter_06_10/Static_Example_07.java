package Chapter_06_10;

public class Static_Example_07 {

	public static void main(String[] args) {

		// �̱��� ��ü
		
		/*
		 * Static_Example_06 obj1 = new Static_Example_06(); // ������ ����
		 * Static_Example_06 obj2 = new Static_Example_06(); // ������ ����
		 * 
		 */
		
		Static_Example_06 obj1 = Static_Example_06.getInstance();
		Static_Example_06 obj2 = Static_Example_06.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("���� ��ü�Դϴ�.");
		}else {
			System.out.println("�ٸ� ��ü�Դϴ�.");
		}
		
	}

}
