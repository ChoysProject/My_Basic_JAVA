package Chapter_03_03;

public class Operator_Example_06 {

	public static void main(String[] args) {

		// char Ÿ�� ����
		
		char c1 = 'A' + 1;
		char c2 = 'A';
		// char c3 = c2 + 1; // ������ ���� ���� ������ �ϰԵǸ� int�� ����� �ްԵȴ�.
		
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
//		System.out.println("c3 = " + c3);
		
//		������ ���� ������ �ؼ� �����ڸ� ���� �� �ֵ��� ������ �ʿ��ϴ�.
		
		char c4 = (char) (c2 + 1);
		System.out.println("c4 = " + c4);
		
		
	}

}
