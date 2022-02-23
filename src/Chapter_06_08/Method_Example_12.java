package Chapter_06_08;

public class Method_Example_12 {

	public static void main(String[] args) {

		Method_Example_11 myCalcu = new Method_Example_11();
		
		// 정사각형의 넓이 구하기
		
		double result1 = myCalcu.areaRectangle(10);
		
		// 직사각형의 넓이 구하기
		
		double result2 = myCalcu.areaRectangle(10, 20);
		
		// 결과 출력
		
		System.out.println("정사각형 넓이 = " + result1);
		System.out.println("직사각형 넓이 = " + result2);
		
		
	}

}
