package Chapter_03_03;

public class Operator_Example_14 {

	public static void main(String[] args) {

		// NaN을 체크하고 연산 수행
		
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		
		if(Double.isNaN(val)) { // NaN을 검사함
			System.out.println("NaN이 입력되어 처리할 수 없음"); // NaN일때 실행되는 코드
			val = 0.0;
		}
		currentBalance += val; // NaN이 아닐때 사용되는 val의 값.
		System.out.println("currentBalance = " + currentBalance);
		
	}

}
