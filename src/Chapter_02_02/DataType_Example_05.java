package Chapter_02_02;

public class DataType_Example_05 {

	public static void main(String[] args) {

		// long타입 변수
		
		long var1 = 10;
		long var2 = 20L;
		
//		long var3 = 1000000000000; // 컴파일 에러 저장범위를 넘어서는 정수 리터럴에 L을 붙이지 않아서
		long var4 = 1000000000000L;
		
		
		System.out.println("var1 = " + var1);
		System.out.println("var2 = " + var2);
		System.out.println("var4 = " + var4);
		
	}

}
