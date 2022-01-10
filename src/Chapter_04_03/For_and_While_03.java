package Chapter_04_03;

import java.io.IOException;

public class For_and_While_03 {

	public static void main(String[] args) throws IOException {

		// for문이 정해진 횟수만큼 반복한다면, while문은 조건식이 true일 경우에 계속해서 반복한다. 조건식에는 비교 또는 논리 연산식이 주로 오는데,
		// 조건식이 false가 되면 반복 행위를 멈추고 while문을 종료한다.
		// Example을 참고해서 while문을 살펴보자.
	
		
		// 조건식에는 boolean 변수나 true/false 값을 산출하는 어떠한 연산식이든 올 수 있다. 
		// 만약 조건식에 true을 사용하면 while (true) {---}가 되어서 무한 루프를 돌게된다.
		// 무한 루프는 무한히 반복하여 실행하기 때문에 언젠가는 while문을 빠져나가기 위한 코드가 필요하다.
		// 다음 다음 예제는 키보드에서 1, 2를 입력했을 때 속도를 증속, 감속시키고, 3을 입력하면 프로그램을 종료시킨다.
		// 먼저 키보드에서 입력된 키가 어떤 키인지 확인하는 방법부터 알아보자. 다음 코드는 키보드로부터 입력된 코드를 리턴한다.
		
		int keyCode = System.in.read();
		
		// page 126 참고해서 사용하자.
		
		
	}

}
