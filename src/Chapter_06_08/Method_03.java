package Chapter_06_08;

public class Method_03 {

	
	// Return문
	
	// 리턴값이 있는 메소드
	// 메소드 선언에 리턴 타입이 있는 메소드는 반드시 리턴(return)문을 사용해서 리턴값을 지정해야 한다.
	// 만약 return문이 없다면 컴파일 오류가 발생한다.
	// return 문이 실행되면 메소드는 즉시 종료된다.
	
	// return 리턴값;
	
	// return문의 리턴값은 리턴 타입이거나 리턴 타입으로 변환 될 수 있어야 한다.
	// 예를 들어 리턴타입이 int인 plus() 메소드에서 byte, short, int 타입의 값이 리턴되어도 상관없다.
	// byte와 short은 int로 자동 타입 변환되어 리턴되기 때문이다.
	
//	int plus(int x, int y) {
//		int result = x + y;
//		return result
//	}
	
//	int plus (int x, int y) {
//		byte result = (byte) (x+y);
//		return result;
//	}
	
	// return문을 사용할 때 주의할 점은 return문 이후에 실행문이 오면 "Unreachable code" 라는 컴파일 오류가 발생한다.
	// 왜냐하면 return문 이후의 실행문은 결코 실행되지 않기 떄문이다.
	// 따라서 다음은 잘못된 코딩이다.
	
//	int plus (int x, int y) {
//		int result = x + y;
//		return result;
//		System.out.println(result); // Unreachable code
// }	
	
	
	// 하지만 다음과 같은 경우, 컴파일 에러가 발생하지 않는다. 2는 return false; 다음에 있지만, if문의 조건식이 false가 될 경우 정상적으로 2가 실행되기 때문에 2는 Unreachable code 에러를 발생시키지 않은다.
	// if문의 조건식이 true가 되면 1이 실행되고 return false;가 실행되어 메소드는 즉시 종료한다.
	// 당연히 2는 실행되지 않는다.
	
//	boolean isLeftGas() {
//		if(gas ==0) {
//			System.out.println("gas가 없습니다.");
//			return false;
//		}
//		System.out.println("gas가 있습니다.");
//		return true;
//	}
	
	
	// 리턴값이 없는 메소드 (void)
	
	// void로 선언된 리턴값이 없는 메소드에서도 return문을 사용할 수 있다.
	// 다음과 같이 return문을 사용하면 메소드 실행을 강제 종료 시킨다.
	
	// return;
	
	// 다음은 gas값이 0보다 클 경우 계속해서 while문을 실행하고, 0일 경우 return문을 실행해서 run() 메소드를 즉시 종료한다.
	// while문이 한 번 루필할 때마다 gas를 1씩 감소하기 떄문에 언젠가는 0이 되어 run() 메소드를 종료한다.
	// 이 예제에서는 return문 대신 break문을 사용할 수 있다.
	
	// 만약 while문 뒤에 실행문이 추가적으로 더 있을 경우, break문을 반드시 사용해야 한다.
	// return문은 즉시 메소드를 종료시키기 때문이다.
	
//	void run() {
//		while(true) {
//			if(gas > 0) {
//				System.out.println("달립니다. ( gas 잔량:" + gas + ")");
//				gas -= 1;
//			}else {
//				System.out.println("멈춥니다. ( gas 잔량:" + gas + ")");
//			return;
//			}
//		}
//	}
	
	
	// CarExample 클래스의 5라인에서 Car 객체의 setGas(5) 메소드를 호출해서 Car 객체의 gas 필드값을 5로 변경했다.
	// 7라인에서는 isLeftGas() 메소드를 호출해서 리턴값을 gasState 변수에 저장한다.
	// 8라인에서 gasState 변수값이 true일 경우 10라인에서 run() 메소드를 호출한다.
	// 13라인을 보면 if문의 조건식으로 isLeftGas() 메소드 호출이 들거아 있는데, 이것이 가능한 이유는 메소드가 boolean값을 리턴하기 떄문이다.
	// 리턴값이 true일 경우 if 블록을 실행하고 false일 경우 else 블록을 실행한다.
	
	
}
