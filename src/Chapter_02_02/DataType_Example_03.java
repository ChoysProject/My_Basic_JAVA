package Chapter_02_02;

public class DataType_Example_03 {

	public static void main(String[] args) {

		//문자 타입

		char c1 = 'a';		// 문자를 직접 저장
		char c2 = 97;		// 10진수로 저장
		char c3 = '\u0041';	// 16진수로 저장
		
		
		char c4 = '가';		// 문자를 직접 저장
		char c5 = 44032;	// 10진수로 저장
		char c6 = '\uac00';	// 16진수로 저장
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		
//		int uniCode = c4;
//		System.out.println(uniCode);

	}

}
