package Chapter_04_03;

public class For_and_While_Example_10 {

	public static void main(String[] args) {

		// break로 while문 종료
		
		while(true) {
			int num = (int)(Math.random()*6) + 1;
			System.out.println("num value = " + num);
			if (num == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
		
	}

}
