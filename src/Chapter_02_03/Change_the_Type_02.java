package Chapter_02_03;

public class Change_the_Type_02 {

	public static void main(String[] args) {

		
		// 자동 타입 변환(Promotion)은 프로그램 실행 도중에 자동적으로 타입 변환이 일어나는 것을 말한다.
		// 자동 타입 변환은 작은 크기를 가지는 타입이 큰 크기를 가지는 타입에 저장될 때 발생한다.
		
		// 큰 크기 타입과 작은 크기 타입의 구분은 사용하는 메모리 크기이다. 
		// 예를 들어 byte 타입은 1byte -> 4byte 크기를 가진 int로 예를 들수 있다.
		
		// byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
		// float는 4byte 크기인데, int(4byte)와 long(8byte) 보다 더 큰 타입으로 표시했다.
		// 그이유는 표현할 수 있는 값의 범위가 float가 더 크기 떄문이다. 이것만 주의하면 데이터 타입의 크기를 비교하는 것은 어렵지 않다.
		
		byte byteValue = 10;
		int intValue = byteValue; // 자동 타입 변환이 일어난다.
		
		
		int intValue2 = 200;
		double doubleValue = intValue2; // 200.0
		
		char charValue = 'A';
		int intValue3 = charValue; // 65가 저장
		
		byte byteValue2 = 65;
//		char charValue2 = byteValue2; // 컴파일 에러
//		char charData ] (char) byteData;  // 강제 타입 변환 필요.
		
	}

}
