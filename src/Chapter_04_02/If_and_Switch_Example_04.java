package Chapter_04_02;

public class If_and_Switch_Example_04 {

	public static void main(String[] args) {

		// �ֻ��� ��ȣ�� �̴� ����
		
		int num = (int)(Math.random()*6) + 1; // �ֻ��� ��ȣ �ϳ� �̱�
		
		System.out.println("num value = " + num);
		
		if(num==1) {
			System.out.println("1���� ���Խ��ϴ�.");
		}else if (num==2) {
			System.out.println("2���� ���Խ��ϴ�.");
		}else if (num==3) {
			System.out.println("3���� ���Խ��ϴ�.");
		}else if (num==4) {
			System.out.println("4���� ���Խ��ϴ�.");
		}else if (num==5) {
			System.out.println("5���� ���Խ��ϴ�.");
		}else if (num==6) {
			System.out.println("6���� ���Խ��ϴ�.");
		}
		
	}

}
