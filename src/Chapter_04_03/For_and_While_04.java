package Chapter_04_03;

import java.util.Scanner;

public class For_and_While_04 {

	public static void main(String[] args) {

		// do-while문
		
		// do-while문은 조건식에 의해 반복 실행한다는 점에서 while문과 동일하다. 
		// while문은 시작할 대부터 조건식을 검사하여 블록 내부를 실행할지 결정하지만,
		// 경우에 따라서는 블록 내부의 실행문을 우선 실행시키고 실행 결과에 따라서 반복 실행을 계속할지 결정하는 경우도 발생한다.
		// 이때 do-while문을 사용할 수 있다.

		// 이번 예제는 키보드로부터 문자열을 입력받고 출력시킨다.
		
		// 먼저 콘솔에서 입력한 문자열을 읽는 방법에 대해 알아보자
		// System.in.read() 메소드는 하나의 키 코드만 읽기 때문에 콘솔에 입력된 문자열을 한 번에 읽을 수 없다.
		// 대신 다음과 같이 Scanner 객체를 생성하고 nextLine() 메소드를 호출하면 콘솔에 입력된 문자열을 한 번에 읽을 수 있다. nextLine() 메소드로 읽은 문자열을 저장하기 위해서
		// String 변수가 필요한데 아래 코드에서는 inputString 변수에 저장했다.
		
		Scanner scanner = new Scanner(System.in); // Scanner 객체 생성
		String inputString = scanner.nextLine();
		

	}

}
