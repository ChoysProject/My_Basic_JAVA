package Chapter_05_06;

public class Arrangement_Type_Example_05 {

	public static void main(String[] args) {

		// main() 메소드의 매개변수
		
		if(args.length != 2) { // 입력된 데이터 개수가 두 개가 아닐 경우.
			System.out.println("프로그램의 사용법");
			System.out.println("java MainStringArrayArgument num1 num2");
			System.exit(0); // 프로그램 강제 종료
		}
		
		
		String strNum1 = args[0]; // 첫번째 데이터 얻기
		String strNum2 = args[1]; // 두번째 데이터 얻기
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println("num1 : " + num1 +" / " + "num2 :" + num2);
		
		
		// 위 예제를 그냥 실행하면 숫자가 아닌 문자열이 출력됨.
		// 그 이유는 실행할 때 매개값을 주지 않았기 때문에 길이 0인 String 배열이 매개값으로 전달된다. 
		// 따라서 args.length는 0이므로 3라인의 if 조건식이 true가 되어 if문의 블록이 실행된 것이다.
		// 이클립스에서 프로그램을 실행할 때 매개값을 주고 실행하려면 메뉴에서 Run-> Run Configurations를 선택해서 
		// p.161을 참고
		// 대화상제의 Main탭에서 Project와 Main Class를 확인
		// Arguments 탭을 클릭하고 Program arguments 입력란에 10을 입력하고 빈칸을 띄우고 20을 입력 후 Run버튼을 클릭하면
		// 숫자가 출력된다.
		
		
	}

}
