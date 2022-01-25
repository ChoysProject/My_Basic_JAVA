package Chapter_06_08;

public class Method_Example_02 {

	public static void main(String[] args) {

		Method_Example_01 myMethod = new Method_Example_01();
		
		myMethod.powerOn();
		
		int result1 = myMethod.plus(10, 20);
		System.out.println("result1 : " + result1);
		
		byte x = 10;
		byte y = 4;
		
		double result2 = myMethod.divide(x, y);
		System.out.println("result2 : " + result2);
		
		myMethod.powerOff();
		
		
	}

}
