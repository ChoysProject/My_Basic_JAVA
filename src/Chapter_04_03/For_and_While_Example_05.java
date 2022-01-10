package Chapter_04_03;

public class For_and_While_Example_05 {

	public static void main(String[] args) {

		// 구구단 출력하기
		
		for (int m=2; m<=9; m++) {
			System.out.println("*** " + m + "단 ***");
			for(int n=1 ; n<=9; n++) {
				System.out.println(m + " x " + n + " = " + (m*n));
			}
		}
		
	}

}
