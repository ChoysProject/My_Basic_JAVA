package Chapter_04_02;

public class If_and_Switch_Example_04 {

	public static void main(String[] args) {

		// 주사위 번호를 뽑는 예제
		
		int num = (int)(Math.random()*6) + 1; // 주사위 번호 하나 뽑기
		
		System.out.println("num value = " + num);
		
		if(num==1) {
			System.out.println("1번이 나왔습니다.");
		}else if (num==2) {
			System.out.println("2번이 나왔습니다.");
		}else if (num==3) {
			System.out.println("3번이 나왔습니다.");
		}else if (num==4) {
			System.out.println("4번이 나왔습니다.");
		}else if (num==5) {
			System.out.println("5번이 나왔습니다.");
		}else if (num==6) {
			System.out.println("6번이 나왔습니다.");
		}
		
	}

}
