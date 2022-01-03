package Chapter_03_03;

public class Operator_Example_10 {

	public static void main(String[] args) {

		
		// 정확하게 계싼할 떄에는 부동소수점 타입을 사용하지 않는다.
		
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number * pieceUnit;
		
		System.out.println("사과 한개에서 ");
		System.out.println("0.7 조각을 뺴면,");
		System.out.println(result + "조각이 남는다.");
	
		// 출력된 결과를 보면 result 변수의 값은 0.29999999999999993이 되어 정확히 0.3이 되지 않는다.
		// 이것은 이진 포맷의 가수를 사용하는 부동소수점 타입 (float, double)은 0.1을 정확히 표현할 수 없어 근사치로 처리하기 떄문이다.
		// 정확한 계산이 필요하다면 정수 연산으로 변경해서 다음 Example과 같이 계산해야 한다.
	
	}

}
