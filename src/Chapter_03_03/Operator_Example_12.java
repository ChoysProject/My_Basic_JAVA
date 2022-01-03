package Chapter_03_03;

public class Operator_Example_12 {

	public static void main(String[] args) {

		// Infinity 와 NaN
		
		int x = 5;
		double y = 0.0;
		
		double z = x / y;
		//double z= x % y;
		
		System.out.println("Double.isInfinite(z) = " + Double.isInfinite(z));
		System.out.println("Double.isNaN(z) = " + Double.isNaN(z));
	
		System.out.println("z = " + z + 2); // 문제가 되는 코드
		
	}

}
