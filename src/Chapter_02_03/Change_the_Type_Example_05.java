package Chapter_02_03;

public class Change_the_Type_Example_05 {

	public static void main(String[] args) {
		// ���� Ÿ���� �Ǽ� Ÿ������ ��ȯ�� �� ���е� �ս��� ���Ѵ�.
		
		
		int num1 = 123456780;
		int num2 = 123456780;
		
		double num3 = num2;
		num2 = (int) num3;
		
		int result = num1 - num2;
		System.out.println("result : " + result);
		
		
	}

}
