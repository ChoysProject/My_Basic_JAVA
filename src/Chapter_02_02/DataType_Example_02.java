package Chapter_02_02;

public class DataType_Example_02 {

	public static void main(String[] args) {

		// byte 타입 변수
		
		byte var1 = 125;
		int var2 = 125;
		
		for(int i=0; i<5;i++) { // 중괄호 블록을 5회 반복 실행
			var1++;
			var2++;
			
			System.out.println("var1 = "+ var1 + "\t" + "var2 = " + var2); // \t tab 한만큼 칸을 띄워주는 역할을 함.
		}
		
		
	}

}
