package Chapter_03_03;

public class Operator_Example_08 {

	public static void main(String[] args) {

		// 오버 플로우 해결
		
		long x = 1000000;
		long y = 1000000;
		
		long z= x * y;
		
		System.out.println("z = " + z);
	}

	
	// 위에서와 같이 코드에서 피여난자의 값을 직접 리터럴로 주는 경우는 드물다. 
	// 대부분 사용자로부터 입력받거나 프로그램 실행 도중에 생성되는 데이터로 산술 연산이 수행된다.
	// 이런 경우 바로 산술 연산자(+,-,*,/)를 사용하지 말고 메서드를 이용하는 것이 좋다.
	// 메서드는 산술 연산을 하기전에 피연산자들의 값을 조사해서 오버플로우를 탐지할 수 있기 떄문이다.
	
	
}
