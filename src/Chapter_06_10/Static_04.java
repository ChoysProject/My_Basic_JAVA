package Chapter_06_10;

public class Static_04 {

	public static void main(String[] args) {

		// 정적 초기화 블록
		
		// 정적 필드는 다음과 같이 필드 선언과 동시에 초기값을 주는 것이 보통이다.
		
		// static double pi = 3.14159;
		// 그러나 계산이 필요한 초기화 작업이 있을 수 있다.
		// 인스턴스 필드는 생성자에서 초기화하지만, 정적 필드는 객체 생성 없이도 사용해야하므로 생성자에서 초기화 작업을 할 수 없다.
		// 생성자는 객체 생성 시에만 실행되기 떄문이다.
		// 그렇다면 정적 필드를 위한 초기화 작업은 어디에서 해야할까 ?
		// 자바는 정적 필드의 복잡한 초기화 작업을 위해서 정적 블록(static block)을 제공한다.
		// 다음은 정적 블록의 형태를 보여준다.
		
//		static {
//			--
//		}
		
		// 정적 블록은 클래스가 메모리로 로딩될 떄 자동적으로 실행된다.
		// 정적 블록은 클래스 내부에 여러개가 선언되어도 상관없다.
		// 클래스가 메모리로 로딩될 떄 선언된 순서대로 실행된다.
		// 다음 예제를 보자.
		// Television은 세 개의 정적 필드를 가지고 있는데, complny와 model은 선언 시 초기값을 주었고 info는 초기화 하지 않았다.
		// info 필드는 정적 블록에서 company와 model 필드값을 서로 연결해서 초기값으로 설정한다.
		
		
		

	}

}
