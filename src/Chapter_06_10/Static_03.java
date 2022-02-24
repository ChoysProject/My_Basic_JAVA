package Chapter_06_10;

public class Static_03 {

	public static void main(String[] args) {

		// 정적 멤버 사용
		
		// 클래스가 메모리로 로딩되면 정적 멤버를 바로 사용할 수 있는데, 클래스 이름과 함꼐 (.) 연산자로 접근한다.
		
		// 클래스.필드;
		// 클래스.메소드(매개값, --)

		
		// 예를들어
		
//		public class Calculator{
//			static double pi = 3.14159;
//			static int plus(int x, int y) {---}
//			static int minus(int x, int y) {---}
//		}
		
		// 정적 필드 pi와 정적 메소드 plus(), minus()는 다음과 같이 사용할 수 있다.
		
//		double result1 = 10*10 * Calculator.pi;
//		int result2 = Caluculator.plus(10, 5);
//		int result3 = Caluculator.minus(8, 5);
		
		// 하지만 정적 요소는 클래스 이름으로 접근하는 것이 좋다.
		// 이클립스에서는 정적 멤버를 클래스 이름으로 접근하지 않고 객체 참조 변수로 접근했을 경우, 경고 표시가 나타난다.
		
		
		
	}

}
