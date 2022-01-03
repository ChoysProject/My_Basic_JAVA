package Chapter_03_03;

public class Operator_Example_13 {

	public static void main(String[] args) {

		// 입력값의 NaN 검사
		
		// 부동 소수점 (실수)을 입력받을 떄는 반드시 NaN검사를 해야한다. 
		// 3라인에서 부동소수점으로 변환이 가능한 문자열을 입력받는다고 가정해보자. 
		// 악의성 있는 사용자는 숫자로 변환이 안 되는 "NaN"을 입력할 수도 있다.
		
		// "NaN" 문자열의 문제점
		
		String userInput = "NaN"; // 사용자로부터 입력받은 값
		double val = Double.valueOf(userInput); // 입력값을 double 타입으로 변환
		
		double currentBalance = 10000.0;
		
		currentBalance = 10000.0;
		
		currentBalance += val; // currentBalance에 NaN이 저장됨.
		System.out.println("currentBalance = " + currentBalance);
	
		// "NaN" 문자열은 Double.valueOf() 메서드에 의해 double 타입으로 변환되면 NaN이 된다.
		// 따라서 val에는 NaN이 저장된다. 문제는 NaN은 산술연산이 가능하다는 점이다. 
		// NaN과 어떤 수가 연산이 수행되면 데이터가 엉망이된다. 
		// 그렇기 때문에 사용자로부터 문자열을 입력받을 때에는 반드시 "NaN" 인지 조사하고 만약 NaN이라면 NaN과 산술 연산을 수행해서는 안된다.
		
		
	}

}
