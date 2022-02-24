package Chapter_06_10;

public class Static_Example_02 {

	public static void main(String[] args) {

		
		// 정적 멤버 사용
		
		double result1 = 10* 10 * Static_Example_01.pi;
		int result2 = Static_Example_01.plus(10, 5);
		int result3 = Static_Example_01.minus(15, 3);
		
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		System.out.println("result3 = " + result3);
		
		
	}

}
