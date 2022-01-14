package Chapter_05_06;

public class Arrangement_Type_08 {

	public static void main(String[] args) {

		
		// 객체를 참조하는 배열
		
		// 기본타입 (byte, char, short, int, long, float, double, boolean) 배열은 각 항목에 직접 값을 갖고 있지만,
		// 참조 타입(클래스, 인터페이스) 배열은 각 항목에 객체의 번지를 가지고 있다.
		// 예를들어 String은 클래스 타입이므로 String[] 배열은 각 항목에 문자열이 아니라, String 객체의 주소를 가지고 있다.
		// 즉 String 객체를 참조하게 된다.
		
		// String[] strArray = new String[3];
		// strArray[0] = "java";
		// strArray[1] = "C++";
		// strArray[2] = "C#";
		
		// 위 코드는 배열 변수 strArray를ㅇ 선언하고 3개의 문자열을 참조하는 배열을 생성한다.
		// 따라서 String[] 배열의 항목도 결국 String 변수와 동일하게 취급되어야 한다.
		// 예를 들어 String[] 배열 항목 간에 문자열을 비교하기 위해서는 == 연산자 대신 equals() 메서드를 사용해야한다.
		// ==는 객체의 번지 비교이기 때문에 문자열 비교에 사용할 수 없다.
		
		// Stirng[] strArray = new String[3];
		// strArray[0] = "Java";
		// strArray[1] = "Java";
		// strArray[2] = new String("Java");
		
//		System.out.println(strArray[0] == strArray[1]); // true (같은 객체를 참조)
//		System.out.println(strArray[0] == strArray[2]); // false (다른 객체를 참조)
//		System.out.println(strArray[0].equals(strArray[2])); // true (문자열 동일)	

		// strArray[0]과 strArray[1] 배열 항목을 == 연산하면 결과는 true 가 나온다. 
		// 이유는 동일한 String 객체를 참조하기 때문이다. 반면에 String 객체를 new 연산자로 생성하면, 무조건 새로운 String 객체가 생성되기 때문에 
		// strArray[0]과 strArray[2] 배열 항목을 == 연산하면 결과는 false가 나온다.
		// strArray[0]과 strArray[2]는 서로 다른 객체를 참조하기 때문이다.
		// 하지만 문자열을 비교하는 strArray[0].equals(strArray[2])는 true 값이 리턴된다.
	
	}
}
