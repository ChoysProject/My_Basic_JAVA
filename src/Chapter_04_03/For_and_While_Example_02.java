package Chapter_04_03;

public class For_and_While_Example_02 {

	public static void main(String[] args) {

		
		// 1부터 100까지 합을 출력
		
		int sum = 0;
		
		for(int i = 1 ; i<=100; i++) {
			sum += i;
		}
		
		System.out.println("1~100 합 : " + sum);
		
	}

}
