package Chapter_03_03;

public class Operator_Example_17 {

	public static void main(String[] args) {

		// 비교 연산자
		
		int v2 = 1;
		double v3 = 1.0;
		System.out.println("result value1 = " + (v2 == v3));
		
		double v4 = 0.1;
		float v5 = 0.1f;
		
		System.out.println("result value2 = " + (v4 == v5));
		System.out.println("result value3 = " + ((float)v4 == v5));
		System.out.println("result value4 = " + ((int)(v4*10) == (int)(v5*10)));
	}

}
