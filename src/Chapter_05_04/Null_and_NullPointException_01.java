package Chapter_05_04;

public class Null_and_NullPointException_01 {

	public static void main(String[] args) {

		// Null과 NullPointException
		
		// 참조 타입 변수는 힙 영역의 객체를 참조하지 않는다는 뜻으로 Null값을 가질수 있다.
		// null 값도 초기값으로 사용할 수 있기 떄문에 null로 초기화된 참조 변수는 스택영역에 생성된다.
		
		// 참조타입 변수가 null 값을 가지는지 확인하려면 다음과 같이 ==, != 연산을 수행하면 된다.
		// 상기 그림에서 page.144 refVar1은 힙 영역의 객체를 참조하므로 연ㅅ나의 결과는 다음과 같다.
		
		// refVar1 == null 결과 false
		// refVar2 != null 결과 true
		
		// refVar2 == null 결과 true
		// refVar3 != null 결과 false
		
		// 자바는 프로그램 실행 도중에 발생하는 오류를 예외(Exception)라고 부른다.
		// 예외는 사용자의 잘못된 입력으로 발생할 수도 있고, 프로그래머가 코드를 잘못 작성해서 발생할 수도 있다.
		// 참조 변수를 사용하면서 가장 많이 발생하는 예외 중 하나로 NullPointerException이 있다.
		// 이 예외는 참조타입 변수를 잘못 사용하면 발생한다.
		// 참조타입 변수가 null을 가지고 있을 경우, 참조 타입 변수는 사용할 수 없다.
		// 참조 타입 변수를 사용하는 것은 곧 객체를 사용하는 것을 의미하는데,
		// 참조할 객체가 없으므로 사용할 수가 없는 것이다.
		// 그러나 프로그래머의 실수로 null 값을 가지고 있는 참조 타입 변수를 사용하면 nullPointException이 발생한다. 다음 코드를 보자.
		
		// int[] intArray = null;
		// intArray[0] = 10; // nullpointException
		
		// 상기 코드에서 intArray는 뱅ㄹ 타입 변수이므로 참조 타입 변수이다. 그래서 null로 초기화가 가능하다.
		// 이 상태에서 intArray[0]에 10을 저장하려면 NullPointerException이 발생한다.
		// 이유는 intArray 변수가 참조하는 배열 객체가 없기 떄문이다.
		
//		String str = null;
//		System.out.println("총 문자수 : " + str.length());
		
		// Stirng은 클래스 타입이므로 참조 타입이다. 따라서 str변수도 null로 초기호가 가능하다.
		// 이 상태에서 String 객체의 length()라는 메소드를 호출하면 NullPointerException이 발생한다.
		// 이유는 str변수가 참조하는 String 객체가 없기 떄문이다. 프로그램 실행 도중 NullPointerException이 발생하면, 예외가 발생된 곳에서 객체를 참조하지 않은 상태로 참조 타입 변수를 사용하고 있음을 알아야 한다.
		// 대체 방법은 이 변수를 추적해서 객체를 참조하도록 수정해야 한다.
		
		// NullPointException은 아마 여러분이 앞으로 가장 많이 볼 수 있는 예외중 하나일 것이다.
		
	}

}
