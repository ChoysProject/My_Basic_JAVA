package Chapter_03_03;

public class Operator_Example_06 {

	public static void main(String[] args) {

		// char 타입 연산
		
		char c1 = 'A' + 1;
		char c2 = 'A';
		// char c3 = c2 + 1; // 컴파일 에러 연산 산출을 하게되면 int로 결과를 받게된다.
		
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
//		System.out.println("c3 = " + c3);
		
//		다음과 같이 수정을 해서 유니코를 받을 수 있도록 수정이 필요하다.
		
		char c4 = (char) (c2 + 1);
		System.out.println("c4 = " + c4);
		
		
	}

}
