package Chapter_02_02;

public class DataType_03 {

	public static void main(String[] args) {

		// 정수 타입에는 모두 다섯 개의 타입이 있으며, 저장할 수 있는 값의 범위가 서로 다르다.
		// 메모리 크기 순으로 나열하면 다음과 같다.
		
		// 정수 타입	byte	char	short	 int	 long
		// 바이트 수	 1        2      2        4 	  8  
	
		// char 타입
		// 자바는 모든 문자를 유니코드로 처리한다.
		
		char var1 = 'A'; // 유니코드 : 0x0041		2진수 00000000 01000001
		char var2 = 'B'; // 유니코드 : 0x0042		2진수 00000000 01000010
		char var3 = '가'; // 유니코드 : 0xAC00		2진수 10101100 00000000
		char var4 = '각'; // 유니코드 : 0xAC01		2진수 10101100 00000001
		
		char c = 65;
		char c1 = '\u0041';
		
		char c2 = 'A';
		int  uniCode = c2;
	
		
		
		String name = "홍길동";
		
		//문자타입 빈값 주기
//		char a1 = ''; -> char a2 = ' ';
	
		
		//문자열타입 빈값 주는 방법은
		String str = "";
		

		//int 타입
		int number = 10;
		int octNumber = 012;
		int hexNumber = 0xA;
		
		
		// long 타입
		
		// long 타입은 8byte(64bit)로 표현되는 정수값을 저장 할 수 있는 데이터 타입이다.
		// 저장할 수 있는 값의 범위는 -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 이다.
		// 수치가 큰 데이터를 다루는 프로그램에서는 long 타입이 필수적으로 사용된다.
		// 정수값 뒤에 소문자 l,L 을 붙일 수 있다.
		// 이것은 4byte 정수 데이터가 아니라 8byte 정수 데이터임을 컴파일러에게 알려주기 위한 목적
		// int 타입의 저장범위를 넘어서 큰 정수는 반드시 l L 을 붙여줘야한다.
		
		
		// 실수 타입 (float, double)
		// 실수 타입은 소수점이 있는 실수 데이터를 저장할 수 있는 타입으로, 메모리 사용 크기에 따라 float와 double이 있다.
		
		// 실수타입     float		double
		// 바이트수	    4		  8

		// float와 double은 int와 long 크기와 같지만 저장방식 떄문에 훨씬 더 큰 범위의 값을 저장할 수 있다.
		// 실수는 정수와 달리 부동 소수점 (floating-point) 방식으로 저장된다. 
		
		double doubleValue = 3.14;
//		float var2 = 3.14;	// 컴파일 에러
		float floatValue = 3.14F;
	
		
		int intValue = 3000000;		// 3000000
		double doubleValue2 = 3e6;	// 3000000
		float floatValue2 = 3e6f;	// 3000000
		double doubleValue3 = 2e-3;	// 0.002
		
	
		// 논리타입
		
		// boolean 타입은 1byte(8bit)로 표현되는 논리값 (true/false)을 저장할 수 있는 데이터 타입이다.
		// boolean 타입은 두가지 상태값을 저장할 필요성이 있을 경우 사용함, 
		// 상태값에 따라 조건문과 제어문의 실행 흐름을 변경하는데 주로 사용.
		
		
	
	
	}

}
