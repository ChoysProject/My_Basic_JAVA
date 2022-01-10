package Chapter_04_03;

public class For_and_While_Example_07 {

	public static void main(String[] args) {

		// 1~ 100까지 합을 출력
		
		int sum = 0;
		int i = 1;
		
		while (i<=100) {
			sum += i;
			i++;
		}
		
		System.out.println("1~" + (i-1) + " 합 : " + sum);
		
	}

}
