package Chapter_02_03;

public class Change_the_Type_Example_01 {

	public static void main(String[] args) {

		byte byteValue = 10;
		int intValue = byteValue; // int <- byte
		
		System.out.println("intValue = " + intValue);
		
		char charValue = '가';
		intValue = charValue; // int <- char
		
		System.out.println("가의 유니코드 = " + intValue);
		
		intValue = 500;
		long longValue = intValue; // long <- int
		
		System.out.println("longValue = " + longValue);

		intValue = 200;
		double doubleValue = intValue; // double <- int
		
		System.out.println("doubleValue = " + doubleValue);
	} 

}
