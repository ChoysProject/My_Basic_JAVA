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
		
		
		//long 타입
		
	}

}
