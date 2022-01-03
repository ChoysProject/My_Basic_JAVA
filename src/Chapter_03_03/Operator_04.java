package Chapter_03_03;

public class Operator_04 {

	public static void main(String[] args) {
		// 비트 반전 연산자(~)
		
		// 비트 반전 연산자는 정수 타입(byte, short, int, long)의 피연산자에만 사용되며, 피연산자를 2진수로 표현했을때 비트값인 0을 1로, 1은 0으로 반전한다.
		// 연산 후, 부호 비트인 최상위 비트를 포함해서 모든 비트가 반전되기 떄문에, 부호가 반대인 새롱ㄴ 값이 산출된다.
		
		// 비트 반전 연산잔자를 사용할때 주의할 점은 비트 반전 연산자 산출 타입은 int 타입이 된다는 것이다.
		// 피연산자는 연산을 수행하기 전에 int 타입으로 변환되고, 비트 반전이 일어난다.
		// 그래서 다음 코드는 컴파일 에러가 발생한다.
		
		byte v1 = 10;
//		byte v2 = ~v1; // 컴파일 에러
		
		// 그렇기 때문에 다음과 같이 변경되어야 한다.
		
		byte v3 = 10;
		int v4 = ~v3;
		
		// 비트 반전 연산잔자의 결과를 이용하면 부호가 반대인 정수를 구할 수도 있다. 물론 간단하게 부호 연산자인 -를 이용해도 되겠지만,
		// 비트 반전 연산자의 산출값에 1을 더하기하면 부호가 반대인 정수를 얻을 수 있다.
		// 10을 비트 반전하면 - 11을 얻는데, 여기에 1을 더하면 -10을 얻는다.
		
		byte v5 = 10;
		int v6 = ~v1 + 1; // -10이 v6에 저장
		
		// 자바의 정수값을 총 32비트의 이진 문자열로 리턴하는 Integer.toBinaryString() 메서드를 제공한다.
		
		String v1BunaryString = Integer.toBinaryString(10);
		

		
//		public static String toBinaryString(int value) {
//			
//			String str = Integer.toBinaryString(value);
//
//			while(str.length() < 32) {
//				str = "0" + str;
//			}
//			return str;
//		}
		
		// toBinaryString() 메서드의 전체 코드는 이 책을 학습하면서, 차츰 알게 될 것이니, 지금은
		// toBinaryString() 메서드를 이용해서 비트 반전 연산자의 산출 결과만 확인해보자.
		
		
	}

}
