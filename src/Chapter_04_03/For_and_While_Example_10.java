package Chapter_04_03;

public class For_and_While_Example_10 {

	public static void main(String[] args) {

		// break�� while�� ����
		
		while(true) {
			int num = (int)(Math.random()*6) + 1;
			System.out.println("num value = " + num);
			if (num == 6) {
				break;
			}
		}
		System.out.println("���α׷� ����");
		
	}

}
