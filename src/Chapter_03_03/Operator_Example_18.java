package Chapter_03_03;

public class Operator_Example_18 {

	public static void main(String[] args) {

		// 문자열 비교
		
		String strVar1 = "조영상";
		String strVar2 = "조영상";
		String strVar3 = new String("조영상");
		
		System.out.println("result1 = " + strVar1 == strVar2);
		System.out.println("result2 = " + strVar1 == strVar3);
		System.out.println();
		System.out.println("result3 = " + strVar1.equals(strVar2));
		System.out.println("result4 = " + strVar1.equals(strVar3));
	}

}
