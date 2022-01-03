package Chapter_03_03;

public class Operator_Example_04 {

	public static void main(String[] args) {
		// 비트 반전 연산자
		
		int v1 = 10;
		int v2 = ~v1;
		int v3 = ~v1 + 1;
		
		System.out.println("v1 " + toBinaryString(v1) + " (십진수 : " + v1 + ")");
		System.out.println("v2 " + toBinaryString(v2) + " (십진수 : " + v2 + ")");
		System.out.println("v13" + toBinaryString(v3) + " (십진수 : " + v3 + ")");
		System.out.println();
	}
	
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		
		while(str.length() < 32) {
			str = "0" + str;
		}
		return str;
	}
	
	
	
}
