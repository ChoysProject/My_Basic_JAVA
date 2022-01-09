package Chapter_04_02;

public class If_and_Switch_Example_06 {

	public static void main(String[] args) {

		int num = (int)(Math.random() * 6) + 1;
		
		switch(num) {
		
		case 1 : 
			System.out.println("1번이 나왔습니다.");
			break;
		case 2 : 
			System.out.println("2번이 나왔습니다.");
			break;
		case 3 : 
			System.out.println("3번이 나왔습니다.");
			break;
		case 4 :
			System.out.println("4번이 나왔습니다.");
			break;
		case 5 : 
			System.out.println("5번이 나왔습니다.");
			break;
		default : 
			System.out.println("6번이 나왔습니다.");
			break;
		}
		
		// case 끝에 break가 붙어 있는 이유는 다음 case를 실행하지말고 swtich문을 빠져나가기 위해서 사용한다.
		
		
	}

}
