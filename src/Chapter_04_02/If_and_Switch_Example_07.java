package Chapter_04_02;

public class If_and_Switch_Example_07 {

	public static void main(String[] args) {

		// break���� ���� case
		
		int time = (int)(Math.random()*4) + 8; // 8<= --- <= 11 ������ ���� �̱�
		
		System.out.println("[ ����ð� : " + time + " �� ]");
		
		switch (time) {
		case 8: 
			System.out.println("����սô�.");
		case 9:
			System.out.println("ȸ�Ǹ� �սô�.");
		case 10:
			System.out.println("������ ���ô�.");
		default:
			System.out.println("�ܱ��� �����ϴ�.");
		}
		
	}

}
