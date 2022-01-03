package Chapter_03_03;

public class Operator_Example_09 {

	public static void main(String[] args) {

		
		try {
			int result = safeAdd(2, 2000000000);
			System.out.println("result = " + result);
		}catch (ArithmeticException e) {
			System.out.println("오버 플로우가 발생하여 정확하게 계산할 수 없음");
		}
		
	}

	public static int safeAdd(int left, int right) {
		
		if(right>0) {
			if(left>(Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("오버 플로우 발생");
			}
		}else {
			if(left<(Integer.MIN_VALUE - right)) {
				throw new ArithmeticException("오버 플로우 발생");
			}
		}
		return left + right;
	}
	
	
	
}
