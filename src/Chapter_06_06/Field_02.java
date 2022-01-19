package Chapter_06_06;

public class Field_02 {

	public static void main(String[] args) {

		// 필드 선언
		
		// 필드 선언은 클래스 중괄호 {} 블록 어디서든 존재할 수 있다.
		// 생성자 선언과 메소드 선언의 앞과 뒤 어떤 곳에서도 필드 선언이 가능하다.
		// 하지만 생성자와 메소드 중괄호 블록 내부에는 선언될 수 없다.
		// 생성자와 메소드 중괄호 블록 내부에 선언된 것은 모두 로컬변수가 된다.
		// 필드 선언은 변수의 선언 형태와 비슷하다.
		// 그래서 일부 사람들은 클래스 멤버 변수라고 부르기도 하는데, 될 수 있으면 필드라는 용어를 그대로 사용하길 바란다.
		
//		타입 필드 [ = 초기값 ];
		
		// 타입은 필드에 저장할 데이터의 종류를 결정한다.
		// 타입에는 기본타입 (byte, short, int, long, float, double, boolean)과 참조타입(배열, 클래스, 인터페이스)이 모두 올 수 있다.
		// 필드의 초기값은 필드 선언 시 주어질 수도 있고, 생략될 수도 있다.
		// 다음은 올바르게 필드를 선언한 예를 보여준다
		
		// String company = "현대자동차";
		// String model = "그랜저";
		// int maxSpeed = "300";
		// int productionYear;
		// int currentSpeed;
		// boolean engineStart;
		
		// 초기값이 지정되지 않은 필드들은 객체 생성 시 자동으로 기본 초기값으로 설정된다.
		// 필드의 타입에 따라 초기값이 다른데, 다음 표는 필드 타입별 기본 초기값을 보여준다.
		
		//		분류				데이터타입					초기값
		//기본타입		정수타입		byte					0
		//기본타입		정수타입		char					\u0000(빈 공백)
		//기본타입		정수타입		short					0
		//기본타입		정수타입		int						0
		//기본타입		정수타입  		long					0L
		//기본타입		실수타입		float					0.0F
		//기본타입		실수타입		double					0.0
		//기본타입		논리타입		boolean					false
		//참조타입					배열						null
		//참조타입					클래스(String)포함			null
		//참조타입					인터페이스					null
		
		// 정수타입 필드는 0, 실수타입 필드는0.0 그리고 boolean 필드는 false로 초기화되는 것을 볼 수 있다.
		// 참조 타입은 객체를 참조하고 있지 않은 상태인 null로 초기화한다.
		
		
		
	}

}
