package Chapter_03_03;

public class Operator_Example_04 {

	public static void main(String[] args) {
		// ��Ʈ ���� ������
		
		int v1 = 10;
		int v2 = ~v1;
		int v3 = ~v1 + 1;
		
		System.out.println("v1 " + toBinaryString(v1) + " (������ : " + v1 + ")");
		System.out.println("v2 " + toBinaryString(v2) + " (������ : " + v2 + ")");
		System.out.println("v13" + toBinaryString(v3) + " (������ : " + v3 + ")");
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
