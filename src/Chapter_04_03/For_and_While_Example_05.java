package Chapter_04_03;

public class For_and_While_Example_05 {

	public static void main(String[] args) {

		// ������ ����ϱ�
		
		for (int m=2; m<=9; m++) {
			System.out.println("*** " + m + "�� ***");
			for(int n=1 ; n<=9; n++) {
				System.out.println(m + " x " + n + " = " + (m*n));
			}
		}
		
	}

}
