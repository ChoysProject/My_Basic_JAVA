package Chapter_04_03;

public class For_and_While_02 {

	public static void main(String[] args) {

		// for문
		
		// 프로그램을 작성하다 보면 똑같은 실행문을 반복적으로 실행해야 할 경우가 많이 발생한다.
		
		
		int sum = 0;
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;
		// 다섯개의 실행문
		System.out.println("1~5까지의 합" + sum);
		
		// 상기 코드는 1부터 5까지의 합을 구하는 것으로 5개의 실행문으로 해결했다. 하지만
		// 1부터 100까지의 합을 구하는 코드를 같은 방법으로 작성한다면 코드 양이 엄청 늘어난다. 100갸의 지루한
		// 실행문이 필요하기 때문이다. 이런 경우 for문을 사용하면 코드를 획기적으로 줄여준다.
		
		int sum1 = 0;
		for (int i=1; i<=100; i++) {
			sum = sum +i;
		}
		System.out.println("1~100까지의 합 : " + sum1);
		
		// 100개의 실행문을 단 3라인으로 압축한 것이라고 볼 수 있는데, 반복문은 한 번 작성된 실행문을 여러 번 반복 실행해주기 때문에 코드를 절감하고 간결하게 만들어준다.
		// 코드가 간결하면 개발 시간을 줄일 수 있고, 오류가 날 확률도 줄어든다.
		// for문은 주어진 횟수만큼 실횅문을 반복 실행할 대 적합한 반복 제어문이다.
		// 다음은 for문의 형식와 실행 흐름을 도식화한 것이다.
		
		
		
	}

}
