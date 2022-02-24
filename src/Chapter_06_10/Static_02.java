package Chapter_06_10;

public class Static_02 {

	public static void main(String[] args) {

		// 정적 멤버 선언
		
		// 정적 필드와 정적 메소드를 선언하는 방법은 필드와 메소드 선언 시 static 키워드를 추가적으로 붙이면 된다.
		// 다음은 정적 필드와 정적 메소드를 선언하는 방법을 보여준다.
		
//		public class 클래스{
//			// 정적필드
//			static 타입 필드 [=초기값]
//
//					
//			// 정적 메소드
//			static 리턴 타입 메소드 (매개변수선언, ---) {---}
//		}
		

		// 정적 필드와 정적 메소드는 클래스에 고정된 멤버이므로 클래스 로더가 클래스 (바이트 코드)를 로딩해서 메소드 메모리 영역에 적재할 때 클래스 별로 관리된다.
		// 따라서 클래스의 로딩이 끝나면 바로 사용할 수 있다.
		
		// 필드를 선언할 때 인스턴스 필드로 선언할 것인가, 아니면 정적 필드로 선언할 것인가의 판단 기준은 객체마다 가지고 있어야 할 데이터라면 인스턴스 필드로 선언하고,
		// 객체마다 가지고 있을 필요성이 없는 공용적인 데이터라면 정적 필드로 선언하는 것이 좋다.
		// 예를 들어 Calculator 클래스에서 원의 넓이나 둘레를 구할 때 필요한 파이는 Calculator 객체마다 가지고 있을 필요가 없는 변하지 않는 공용적인 데이터이므로
		// 정적 필드로 선언하는 것이 좋다.
		// 그러나 객체별로 색깔이 다르다면 색깔은 인스턴스 필드로 선언해야 한다.
		
//		public class Calculator{
//			String color; // 계산기 별로 색깔이 다를 수 있다.
//			static double pi = 3.14159; // 계산기에서 사용하는 파이 값은 동일하다.
//			
//		}
		
		
		// 메소드의 경우, 인스턴스 메소드로 선언할 것인가, 아니면 정적 메소드로 선언할 것인가의 판단 기준은 인스턴스 필드를 이용해서 실행해야 한다면 인스턴스 메소드로 선언하고,
		// 인스턴스 필드를 이용하지 않는다면 정적 메소드로 선언한다.
		// 예를 들어 Calculator 클래스의 덧셈, 뺼셈 기능은 인스턴스 필드를 이용하기보다는 외부에서 주어진 매개값들을 가지고 덧셈과 뺼셈을 수행하므로 정적 메소드로 선언하는 것이 좋다.
		// 그러나 인스턴스 필드인 색깔을 변경하는 메소드는 인스턴스 메소드로 선언해야 한다.
		
//		public class Calculator{
//			String color; // 인스턴스 필드
//			void setColor(String color) { // 인스턴스 메소드
//				this.color = color;
//		
//			static int plus(int x, int y){return x+y;} // 정적 메소드
//			static int minus(int x, int y){return x-y} // 정적 메소드
//			}
//		}
		
		
		
	}

}
