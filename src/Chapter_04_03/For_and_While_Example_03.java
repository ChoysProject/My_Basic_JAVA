package Chapter_04_03;

public class For_and_While_Example_03 {

	public static void main(String[] args) {

		// 1���� 100���� ���� ���
		
		int sum = 0;
		
		int i = 0;
		for(i=1; i<=100;i++) {
			sum += i;
		}
		System.out.println("1~" + (i-1) + " �� : " + sum);
	}

}
