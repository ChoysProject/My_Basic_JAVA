package Chapter_05_06;

public class Arrangement_Type_06 {

	public static void main(String[] args) {

		// 커맨드 라인 입력.
		
		// 우리는 이제 프로그램 실행을 위해 main() 메소드가 필요하다는 것을 알고있다. 하지만 main() 메서드의 매개값인 String[] args가 왜 필요한 것인지 궁금하였을 것이다.
		// 이제 이 궁금증을 풀어보자.
		
//		public static void main(Stirng[] args) {}
		
		// java 클래스로 프로그램을 실행하면 JVM은 길이가 0인 String 배열을 먼저 생성하고 main() 메서드를 호출할 때 매개값으로 전달한다.
		
		// 만약 다음과 같이 java 클래스 뒤에 공백으로 구분된 문자열 목록을 주고 실행하면, 문자열 목록으로 구성된 String[] 배열이 생성되고, main() 메서드를 호출할 때 매개값으로 전달된다.
		
		// main() 메서드는 String[] args 매개 변수를 통해서 커맨트 라인에서 입력된 데이터의 수와 입력된 데이터를 알 수 있게 된다. 다음 예제는 프로그램을 실행할 때 2개의 문자열을 주지 않으면 프로그램의 사용법을 출력하고
		// 강제 종료하도록 하였다.
		// 만약 프로그램 실행할 때 2개의 문자열이 정확히 입력되었다면 2개의 문자열을 int 타입 숫자로 변환하고 덧셈 연산을 수행한다.
	
		
		// 이렇게 실행하면 args는 {"10","20"} 배열을 참조하게 되고 args[0]은 "10", args[1]은 "20"을 얻을 수 있따.
		// 문자열은 산술 연산을 할 수 없기 떄문에 이 문자열들을 Integer.parseInt() 메서드를 이용해서 정수로 변환시킨다.
		
		// 만약 정수로 변환할 수 없는 문자열이 주어졌을 경우에는 NumberFormatException 실행 예외가 발생한다.
		
	}

}
