package Chapter_03_03;

public class Operator_Example_11 {

	public static void main(String[] args) {

		// 정확하게 계산할 때에는 부동소수점 타입을 사용하지 않는다.
		
		int apple = 1;
		
		int totalPieces = apple * 10;
		int number = 7;
		int temp = totalPieces - number;
		
		double result = temp / 10.0;
		
		System.out.println("사과 한개에서 ");
		System.out.println("0.7 조각을 뺴면,");
		System.out.println(result + "조각이 남는다.");
		
	}

}
