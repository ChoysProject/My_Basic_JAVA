package Chapter_03_03;

public class Operator_Example_09 {

	public static void main(String[] args) {

		
		try {
			int result = safeAdd(2, 2000000000);
			System.out.println("result = " + result);
		}catch (ArithmeticException e) {
			System.out.println("���� �÷ο찡 �߻��Ͽ� ��Ȯ�ϰ� ����� �� ����");
		}
		
	}

	public static int safeAdd(int left, int right) {
		
		if(right>0) {
			if(left>(Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("���� �÷ο� �߻�");
			}
		}else {
			if(left<(Integer.MIN_VALUE - right)) {
				throw new ArithmeticException("���� �÷ο� �߻�");
			}
		}
		return left + right;
	}
	
	
	
}
